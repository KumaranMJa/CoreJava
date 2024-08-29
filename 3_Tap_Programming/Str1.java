import java.util.Scanner;

public class Str1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //System.out.println("1"+1+1);// string + no = string , string + no = string
        String str = "Hello";
        String t ="";
        for(int i=str.length()-1;i>=0;i--){
            t = t+str.charAt(i);
        }
        System.out.println(t);
    }
}
//precidence