import java.util.Scanner;
//TO return the size of largest sub array
public class SubArr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int ans = largestSubArr(arr);
        System.out.println(ans);
    }
    static int largestSubArr(int arr[]){
        int count=1 , max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]+1 == arr[i+1]){
                count++;
            }
            else{
                if(count>max){
                    max=count;
                }
                count=1;
            }
        }
        if(count>max){
            max = count;
        }
        return max;
    }
    
}