// 1
// 01
// 010
// 1010
// 10101

public class NumPattern{
    public static void main(String[] args){
        int n=5;
        int previousNum = 0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(previousNum == 0){
                    System.out.print("1");
                    previousNum = 1;
                }else{
                    System.out.print("0");
                    previousNum = 0;
                }
            }
            System.out.println();
        }
    }
}
