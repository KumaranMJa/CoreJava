import java.util.Scanner;
//Storing the 1's in the begining of the array
public class Arr8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int i = arr.length-1 , j = arr.length-1;
        while(i>=0){
            if(arr[i]==1){
                i--;
            }
            else{
                arr[j]=arr[i];
                j--;
                i--;
            }
        }
        while(j>=0){
            arr[j--]=1;
        }
        for(int s : arr){
            System.out.print(s+" ");
        }
    }
}
