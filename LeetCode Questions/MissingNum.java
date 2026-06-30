// 268. Missing Number
// Easy
// Topics
// premium lock icon
// Companies
// Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array

import java.util.*;
public class MissingNum{
    
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int nums [] = {9,6,4,2,3,5,7,0,1};
        int length = nums.length;

        for(int i=0; i<=length; i++){
            boolean found = false;
            for(int j=0; j<length; j++){
                if(nums[j] == i){
                    found=true;
                }
            }
            if(found == false){
                System.out.println(i);
            }
        }
    }
}
