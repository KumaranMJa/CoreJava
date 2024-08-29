import java.util.Scanner;
public class Pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int row = (2*n)-1;
        for(int i=1;i<=row;i++){
            if(i<=n){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            else{
                for(int k=(row-i)+1;k>0;k--){ 
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        scanner.close();
    }
}
