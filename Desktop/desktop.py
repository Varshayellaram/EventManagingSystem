import subprocess
import time

def get_current_wifi():
    """Returns the SSID of the currently connected Wi-Fi network, if any."""
    result = subprocess.run(["netsh", "wlan", "show", "interfaces"], capture_output=True, text=True)
    
    for line in result.stdout.split("\n"):
        if "SSID" in line and "BSSID" not in line:
            return line.split(":")[1].strip()
    
    return None

def disconnect_wifi():
    """Disconnects from the current Wi-Fi network."""
    print("Disconnecting from current Wi-Fi network...")
    subprocess.run(["netsh", "wlan", "disconnect"], capture_output=True, text=True)
    time.sleep(3)  # Allow time to disconnect

def scan_wifi():
    """Scans for available Wi-Fi networks and returns a list of SSIDs."""
    result = subprocess.run(["netsh", "wlan", "show", "network", "mode=Bssid"], capture_output=True, text=True)
    output_lines = result.stdout.split("\n")
    
    wifi_list = []
    ssid = None

    for line in output_lines:
        line = line.strip()
        if line.lower().startswith("ssid "):  # SSID line
            ssid = line.split(":")[1].strip()
            if ssid and ssid not in wifi_list:
                wifi_list.append(ssid)  # Store SSID (avoid duplicates)

    return wifi_list

def create_profile(ssid, password):
    """Creates a temporary Wi-Fi profile with the provided password."""
    profile_xml = f"""<?xml version="1.0"?>
    <WLANProfile xmlns="http://www.microsoft.com/networking/WLAN/profile/v1">
        <name>{ssid}</name>
        <SSIDConfig>
            <SSID>
                <name>{ssid}</name>
            </SSID>
        </SSIDConfig>
        <connectionType>ESS</connectionType>
        <connectionMode>manual</connectionMode>
        <MSM>
            <security>
                <authEncryption>
                    <authentication>WPA2PSK</authentication>
                    <encryption>AES</encryption>
                    <useOneX>false</useOneX>
                </authEncryption>
                <sharedKey>
                    <keyType>passPhrase</keyType>
                    <protected>false</protected>
                    <keyMaterial>{password}</keyMaterial>
                </sharedKey>
            </security>
        </MSM>
    </WLANProfile>"""

    profile_path = f"{ssid}.xml"
    with open(profile_path, "w") as file:
        file.write(profile_xml)

    subprocess.run(["netsh", "wlan", "add", "profile", f"filename={profile_path}"], capture_output=True)

def connect_wifi(ssid):
    """Attempts to connect to a Wi-Fi network."""
    connect_command = ["netsh", "wlan", "connect", f"name={ssid}"]
    result = subprocess.run(connect_command, capture_output=True, text=True)

    if "completed successfully" in result.stdout:
        return True
    return False

def verify_connection(ssid):
    """Checks if the system is successfully connected to the expected Wi-Fi network."""
    time.sleep(5)  # Wait to ensure connection attempt completes
    current_wifi = get_current_wifi()
    
    if current_wifi == ssid:
        return True  # Successfully connected to the correct network
    else:
        disconnect_wifi()  # Disconnect if it connected to the wrong network
        return False

def main():
    password = input("Enter Wi-Fi password to check: ")

    # Check and disconnect from current Wi-Fi network if connected
    current_network = get_current_wifi()
    if current_network:
        print(f"Currently connected to: {current_network}")
        disconnect_wifi()

    networks = scan_wifi()
    if not networks:
        print("No Wi-Fi networks found.")
        return

    print("\nAvailable Networks:")
    for ssid in networks:
        print(f"- {ssid}")

    # Try to connect only to networks where the password matches
    for ssid in networks:
        print(f"Trying password on {ssid}...")
        create_profile(ssid, password)

        if connect_wifi(ssid):
            if verify_connection(ssid):
                print(f"Successfully connected to {ssid}!")
                return
            else:
                print(f"Incorrect password for {ssid}, disconnecting...")

    print("No networks matched the entered password.")

if __name__ == "__main__":
    main()
