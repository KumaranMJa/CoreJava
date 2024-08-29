import java.util.Scanner;
//Storing the 0's in the end
public class Arr7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int i=0 , j=0;
        while(i<arr.length){
            if(arr[i]== 0){
                i++;
            }
            else{
                arr[j]=arr[i];
                i++;
                j++;
            }
        }
        while(j<arr.length){
            arr[j++]=0;
        }
        for(int s : arr){
            System.out.print(s+" ");
        }
    }
}
