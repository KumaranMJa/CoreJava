//re arrrange the array 

import java.util.Scanner;

public class Arr6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        reArrArray(arr);  //Array is object , so it an pass by reference. Where it is changed it is changed once.
        for(int s : arr){
            System.out.print(s+" ");
        }
        
        /*int j=0 , c = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]== -1){
                c = arr[j];
                arr[j]=arr[i];
                arr[i]=c;
                j++;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }*/
    }
    static void reArrArray(int []arr){
        int i=arr.length-1 , j = arr.length-1;
        while(i>=0){
            if(arr[i]==-1){
                i--;
            }
            else{
                arr[j]=arr[i];
                i--;
                j--;
            }
        }
        while(j>=0){
            arr[j]=-1;
            j--;
        }
    }
}
