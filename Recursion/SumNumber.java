import java.util.*;
public class SumNumber{
    public static void sumNum(int i, int n, int sum){
        if(i == n){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        sumNum(i+1,n,sum);   
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int i = 1 , sum = 0;
        sumNum(i , n , sum );
    }
}
