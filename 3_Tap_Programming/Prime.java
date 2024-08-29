//program to print first n prime numbers

import java.util.Scanner;

class Prime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n , to print first n prime numbers");
        int n = sc.nextInt();
        printPrimeNumbers(n);
    }
    static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i*i <= n ;i++){ //for(int i=2;i<=n/2;i++)
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    static void printPrimeNumbers(int n){
        int count = 0;
        for(int i=2 ; count < n ; i++ ){
            if(isPrime(i)){
                System.out.print(i+" ");
                count++;
            }
        }
    }
}