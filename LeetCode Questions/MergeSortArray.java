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