import java.util.Scanner;
public class arithmetic_operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter number2 : ");
        int num2 = sc.nextInt();
        System.out.println("The Addition of "+num1+" and "+num2+" is "+(num1+num2));
        System.out.println("The Subtraction of "+num1+" and "+num2+" is "+(num1-num2));
        System.out.println("The Multiplication of "+num1+" and "+num2+" is "+(num1*num2));
        System.out.println("The Division of "+num1+" and "+num2+" is "+(num1/num2));
        System.out.println("The Modulo Division of "+num1+" and "+num2+" is "+(num1%num2));
        sc.close();
    }
}
