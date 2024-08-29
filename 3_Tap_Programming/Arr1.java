//Sum of array excpect the Min and MAx value
import java.util.Scanner;
public class Arr1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum=0;
        for(int i=0;i<=arr.length;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        //int max = arr_Max(arr);
        //int min = arr_Max(arr);
        //System.out.println(sum-max);
        //System.out.println(sum-min);
    }
    /*public static int arr_Max(int []arr){
        
    }
    public static int arr_Mi(int []arr){

    }*/
}
