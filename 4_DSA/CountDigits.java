import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(countDigit(n));
    }
    static int countDigit(int n){
        int digit = 0;
        while(n>0){
            n/=10;
            digit++;
        }
        return digit;
    }
}
