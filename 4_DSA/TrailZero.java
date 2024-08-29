import java.util.Scanner;

//Trainling zeros of a factorial - 5! --> 1.
public class TrailZero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int ans = noOfTrailingZerosInFact(n);
        System.out.println(ans);
        scan.close();
    }
    static int noOfTrailingZerosInFact(int n){
        int powOf5 = 5 , res = 0;
        while(n>=powOf5){
            res+=(n/powOf5);
            powOf5*=5;
        }
        return res;
    }
}
// Multiplying a number 5 in factorial and with muliplications of 5 gives 0's at..
// ..last
//No of 5 and multiples of 5 in factorial is no.of trailing zeros
//for every powers of 5 and it gets extra one zero atlast again extra.
//for example for 25 it gets zero atlast extra again.
// n/5^1 + n/5^2 + n/5^3 + n/5^4 +....
// n>=powerOf5 , where numerator greator than or equal to denominator.
//for 200! is 49 trailing zeros. 200/5 = 40, 200/25 =8 , 200/125= 1 
//40+8+1 = 49 . trailing zeros at last is 49.
