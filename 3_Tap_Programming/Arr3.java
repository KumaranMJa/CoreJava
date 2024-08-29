//Hight sum of an array pair(two arrays)
import java.util.Scanner;
public class Arr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int max1 = highValue(arr);
        int max2 = secondHighVAlue(arr);
        System.out.println(max1+max2);
    }
    public static int highValue(int[]arr){
        int max1 = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max1){
                max1 = arr[i];
            }
        }
        return max1;
    }
    public static int secondHighVAlue(int []arr){
        int max1=Integer.MIN_VALUE , max2 = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max1){
                max2 = max1 ;
                max1 = arr[i];
            }
            else if(arr[i]>max2){
                max2 = arr[i];
            }
        }
        return max2;
    }
}
//IP = 5 , 5 6 4 8 1 
//op - 14