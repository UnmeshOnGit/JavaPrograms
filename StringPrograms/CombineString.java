// Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

import java.util.*;
public class CombineString{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter length of the array");
        int len = sc.nextInt();
        sc.nextLine();
        String strArray [] = new String [len];
        int arrayLength = 0;

        for(int i=0; i<len; i++){
            strArray[i] = sc.nextLine();
            arrayLength += strArray[i].length();
        }

        System.out.println("Cumulative length of array is: " + arrayLength);
    }
}
