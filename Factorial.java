import java.util.*;
public class Factorial{
    public static int factorial(int num){
        int result = 1;
        if(num == 0){
            return 1;
        }
        else if(num < 0){
            System.out.println("Can't find factorial for " + num + " this number");
            
             
        }
        else{
            for(int i=num; i>=1; i--){
                result = result * i;
            }
            
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println("Enter your number");
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        System.out.println(factorial(num));
    }
}
