import java.util.Scanner;

public class SubArr4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int ans = lenOfMaxSubArr(arr)-1;
        int j=0;
        for(int i=0;i<arr.length-ans;i++){
            if(arr[i+ans]-arr[i]==ans){
                j=i;
            }
        }
        int count = 0;
        while(count <= ans){
            System.out.println(arr[j++]);
            count++;
        }
    }
    static int lenOfMaxSubArr(int arr[]){
        int count = 1, max = Integer.MIN_VALUE;
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
        while(count>max){
            max = count;
        }
        return max;
    }
}
