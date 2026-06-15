//         * * * * * 
//       *       * 
//     *       * 
//   *       * 
// * * * * *


public class HollowRhombus{
    public static void main(String[] args){
        int n=5;
        
        //for printing rows
        for(int i=1; i<=n; i++){
            
            //to print spaces
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            
            //to print stars
            for(int j=1; j<=n; j++){
                //check for only outer later of pattern
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
