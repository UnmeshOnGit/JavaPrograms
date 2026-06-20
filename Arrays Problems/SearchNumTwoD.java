//take an  2D array as input from the user. Search for a given number x and print the indices at which it occur.

import java.util.*;
public class SearchNumTwoD{
    
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        //taking input for no. of rows and columns
        System.out.println("Enter rows and columns of an array");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        // initialization of an array
        int [] [] numbers = new int [rows] [cols];

        // input elements of an array 
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                numbers[i] [j] = sc.nextInt();
            }
        }

        //taking input of element to be search
        System.out.println("Enter elements for searching the indices");
        int searchNum = sc.nextInt();

        //searching for the elements
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(numbers[i][j] == searchNum){
                    System.out.println("The number you are searching is on " + (i+1) + " " + (j+1) + "location");
                }
            }
        }
    }
}
