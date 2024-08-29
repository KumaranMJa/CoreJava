//Factorial in iterativeb- 5! = 1*2*3*4*5 , 0! = 1 , 1!=1
import java.util.Scanner;
public class Fact{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int res = factorial(n);
        System.out.println(res);
    }
    static int factorial(int n){
        int res = 1;
        for(int i=1;i<=n;i++){
            res*=i;
        }
        return res;
    }
}
