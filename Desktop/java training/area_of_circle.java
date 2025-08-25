import java.util.Scanner;
public class area_of_circle {
    public static void main(String[] args){
        final double pi=3.14;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        int radius = sc.nextInt();
        System.out.println("Area of the circle is: "+(pi*radius*radius)+"sq.cms.");
        sc.close();
    }
}
