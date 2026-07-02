// 88. Merge Sorted Array
// You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
// Merge nums1 and nums2 into a single array sorted in non-decreasing order.

import java.util.*;
public class MergeSortArray{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int [] nums1 = {1, 2, 3};
        int [] nums2 = {2, 5, 6};
        int m = nums1.length;
        int n = nums2.length;
        int merge [] = new int [m+n];

        for(int i=0; i<m; i++){
            int k=0;
            for(int j=0; j<n; j++){
                if(nums1[i]<=nums2[j]){
                    merge[k] = nums1[i];
                    k++;
                }else{
                    merge[k] = nums2[j];
                    k++;
                }
            }
        }

        for(int i=0; i<merge.length;i++){
            System.out.println(merge[i]);
        }

    }
}
