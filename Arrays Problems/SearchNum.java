//take an array as input from the user. Search for a given number x and print the index at which it occur.

import java.util.*;
public class SearchNum{
    
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        
        //array size input
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();

        //initialize an array
        int NumArray[] = new int [size];

        //taking input in the array
        System.out.println("Enter elements of the ayrray");
        for(int i=0; i<NumArray.length; i++){
            NumArray[i] = sc.nextInt();
        }

        //taking an number input for searching
        System.out.println("Enter a number for searching");
        int SearchNum = sc.nextInt();

        //loop for searching that number
        for(int i=0; i<NumArray.length; i++){
            if(SearchNum == NumArray[i]){
                System.out.println("Index is: " + (i+1));
            }
        }
    }
}
