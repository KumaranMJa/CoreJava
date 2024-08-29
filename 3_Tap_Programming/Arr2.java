//Result array is Product of an array of n-1 input array where the n be the current index number.

import java.util.Scanner;

public class Arr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        //System.out.println(arr); - what is the value we get here.(A Refernce's value indicating the address of array)
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        /*Method 1 : 
        int ans[] = new int[n];
        int prod = 1;
        for(int i=0;i<arr.length;i++){
            prod=1;
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                    prod=prod*arr[j];
                }
            }
            ans[i]=prod;
        }
        for(int s : ans){
            System.out.println(s);
        }
        */
        //Method 2 :
        int ans[] = resultArr(arr);
        for(int s : ans){
            System.out.println(s);
        }
    }
    static int[] resultArr(int [] arr){
        int ans[] = new int[arr.length];
        int prod= productOfArray(arr);
        for(int i=0;i<arr.length;i++){
            ans[i]=prod/arr[i];
        } 
        return ans;
    }
    public static int productOfArray(int [] arr){
        int m = 1;
        for(int i=0;i<arr.length;i++){
            m *= arr[i];
        }
        return m;
    }
}
//Example Inp = 5 , 3 5 2 1 4
//op = 40 24 60 120 30
