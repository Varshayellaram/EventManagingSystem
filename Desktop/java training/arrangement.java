
import java.lang.Math;
public class arrangement{
    public static int factorial(int n){
        System.out.println(n);
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }


    public static void main(String[] args) {
        
        
        int n=3,r=5;
        int num,d;
        if(n<r){
            num=factorial(r);
        }
        else{
            num = factorial(n);
        }
        
        d=factorial(Math.abs(n-r));
        System.out.println("The result is : "+(num/d));
    }
}