//Max Product of an array pair
//when the array values are negative , the output will be wrong,
//So we nned to find max1,2 & min1,2 - and product of it and compare it
import java.util.Scanner;
public class Arr4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int min1 = firstMin(arr);
        int min2 = secondMin(arr);
        int min = min1*min2;
        int max1 = highValue(arr);
        int max2 = secondHighVAlue(arr);
        int max = max1*max2;
        int res = max > min ? max : min;
        System.out.println(res);
    }
    public static int firstMin(int [] arr){
        int m1 = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<m1){
                m1 = arr[i];
            }
        }
        return m1;
    }
    public static int secondMin(int [] arr){
        int m1 = Integer.MAX_VALUE , m2 = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<m1){
                m2 = m1;
                m1 = arr[i];
            }
            else if(arr[i]<m2){
                m2 = arr[i];
            }
        }
        return m2;
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
//IP = -3 -6 -8 -1 (-8*-6)
//Op = 48
//IP = 3 6 8 1(8*6)
//Op = 48
