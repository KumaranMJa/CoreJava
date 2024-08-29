import java.util.Scanner;
//count the no elements in consececutive sub arrays
public class SubArr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int count = 1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] == arr[i+1]-1){
                count++;
            }
            else{
                System.out.println(count);
                count=1;
            }
        }
        System.out.println(count);
    }
}
