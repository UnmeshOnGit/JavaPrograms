// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target. You may assume that each input would have exactly one solution, and you may not use the same element twice. You can return the answer in any order.

import java.util.*;
public class TwoSum{
    
    public static void main(String[] args){
        int [] nums = {2,7,11,15};
        int arrLen = nums.length;
        int target = 10;
        if(arrLen < 2){
            System.out.println("Invalid array length");
        }

        for(int i=0; i<arrLen; i++){
            for(int j=1; j<arrLen; j++){
                if(nums[i] + nums[j] == target){
                    System.out.println(i + " " + j);
                    return;               
                }else{
                    System.out.println("No result :(");
                    return;
                }
            }
        }
    }
}
