import java.util.*;
public class FibonacciNum{
    public static void fibSequence(int n, int firstTerm, int secondTerm, int i){
        int nextTerm = firstTerm + secondTerm;
        if(i == n-2){
            System.out.println(nextTerm);
            return;
        }
        System.out.print(nextTerm + " ");
        fibSequence(n, secondTerm, nextTerm, i+1);
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int firstTerm = 0, secondTerm = 1, i=1;
        System.out.print(firstTerm + " ");
        System.out.print(secondTerm + " ");
        fibSequence(n, firstTerm, secondTerm, i);
    }
}
