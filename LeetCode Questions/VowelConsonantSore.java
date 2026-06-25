//leetcode question 3813. Vowel-Consonant Score

import java.util.*;
public class VowelConsonantSore{
    public static void main(String[] args){
        //user input a string
        Scanner sc = new Scanner (System.in);
        String word = sc.nextLine();

        //variable initialization
        int v=0, c=0, score=0;
        
        //triverse in the string
        for(int i=0; i<word.length() ; i++){
            char ch = word.charAt(i);

            //check for is it a digit 
            if(Character.isDigit(ch)){
                continue;

            //is it a space
            }else if(ch == ' '){
                continue;

            // is it a vowel 
            }else if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                v++;

            //else part for consonant
            }else{
                c++;
            }
        }

        //checking for c > 0
        if(c > 0){

            //expression for calculating score
            score = (v/c);
            System.out.println("The score is: " + score);
        }else{
            score = 0;
            System.out.println("The score is: " + score);
        }
    }
}

