import java.util.*;


class InsertionSort {
   public static void printArray(int arr[]) {
       for(int i=0; i<arr.length; i++) {
           System.out.print(arr[i]+" ");
       }
       System.out.println();
   }
   public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of an array");
        int arrLen = sc.nextInt();
        int arr[] = new int [arrLen];

        for(int i=0; i<arrLen; i++){
            arr[i] = sc.nextInt();
        }


        //insertion sort
        for(int i=1; i<arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
                while(j >= 0 && arr[j] > current) {
                    //Keep swapping
                    arr[j+1] = arr[j];
                    j--;
                }
            arr[j+1] = current;
        }
        printArray(arr);
    }
}
