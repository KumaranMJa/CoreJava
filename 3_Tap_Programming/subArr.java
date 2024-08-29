import java.util.Scanner;

public class subArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<arr.length;i++){
            printAllSubArr(arr,i);
        }
    }
    static void printAllSubArr(int arr[], int n){
        for(int i=0;i<arr.length-(n-1);i++){ 
            for(int j=i;j<i+n;j++){
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }
    }
}
