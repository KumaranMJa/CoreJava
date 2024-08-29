
//Multiplication of two two dimentional
import java.util.Scanner;

public class TwoDimArr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr1[][] = new int[n][n];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++){ 
                arr1[i][j] = scan.nextInt();
            }
        }
        int arr2[][] = new int[n][n];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++){ 
                arr2[i][j] = scan.nextInt();
            }
        }
        int res[][] = matrixMultiply(arr1, arr2, n);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++){ 
                System.out.print(res[i][j] + " ");
            }
        System.out.println();
        }
    }

    static int[][] matrixMultiply(int arr1[][], int arr2[][], int n) {
        int ans[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {  //as to get single value we need 3-(n) times of calculation for single value in matrix multiplication.
                    ans[i][j] += arr1[j][k] * arr2[k][j]; // as the like 3x3 matrix a value get by mulitplying the 3
                                                          // values from row and col of each matrix and adding it.
                }
            }
        }
        return ans;
    }
}
//Time Complexity O(n^3) .