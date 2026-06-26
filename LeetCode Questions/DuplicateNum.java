//287. Find the Duplicate Number

import java.util.*;
public class DuplicateNum{
    public static int findDuplicate(int[] nums){
        for(int i=0; i<nums.length; i++){
            for(int j= i+1; j<nums.length; j++){
                if(nums[i] == nums [j]){
                    System.out.println(nums[i]);
                    
                }
            }
        }
        return 0;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int nums [] = {3,1,3,4,2};
        findDuplicate(nums);
    }
}
