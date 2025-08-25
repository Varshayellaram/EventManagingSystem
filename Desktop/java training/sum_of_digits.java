public class sum_of_digits {
    public static void main(String[] args){
        int num=27;
        int last_digit , sum=0;
        while(num>0){
            last_digit=num%10;
            sum+=last_digit;
            num=num/10;
        }
        System.out.println(sum);
    }
}
