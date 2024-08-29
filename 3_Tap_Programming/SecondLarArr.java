import java.util.Scanner;
public class SecondLarArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int res = secondLargestElement(arr);
        System.out.println(res);
        
    }
    public static int secondLargestElement(int[] arr){
        int max1 =Integer.MIN_VALUE, max2=Integer.MIN_VALUE;
        //Integer.MIN_VALUE , it is the limits of integers which has 32 bits ranges from -2^31  to 2^31 
        //while finding max and min we can use it, beacuse it can go overflow and also underflow problems
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max1){ 
                max2 =max1;
                max1 = arr[i];
            }
            else if(arr[i]>max2 && arr[i]!=max1){//to encounter repeating number(&&arr[i]!=max1)
                max2 = arr[i];
            }
        }
        return max2;
    }
}
//IP - 8 , 2 3 5 9 8 4 6 9  (9 is repeating)
//OP - 8