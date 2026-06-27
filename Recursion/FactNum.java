import java.util.*;
public class FactNum{
    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fact_nm1 = factorial(n - 1);
        int cal_fact = fact_nm1 * n;
        return cal_fact;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if(n < 0){
            System.out.println("factorial for negative number is not defined");
        }else{
            int result = factorial(n);
            System.out.println(result);
        }
    }
}
