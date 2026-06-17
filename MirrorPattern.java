//mirror image traingle pattern

// 1 2 3 4 5 6 
//  2 3 4 5 6 
//   3 4 5 6 
//    4 5 6 
//     5 6 
//      6 
//     5 6 
//    4 5 6 
//   3 4 5 6 
//  2 3 4 5 6 
// 1 2 3 4 5 6 


public class MirrorPattern{
    public static void main(String[] args){
        int n=6;
        int num=1;
        
        for(int i=1; i<n; i++){
            num=i;
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(int j=n; j>=i; j--){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--){
            num=i;
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(int j=n; j>=i; j--){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
