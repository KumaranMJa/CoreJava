import java.util.Scanner;
public class Str4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        //reverseTheString(str);
        //reverseTheWords(str);
        reverseTheWordsinReverse(str);
    }
    static void reverseTheString(String str){
        String[] arr = str.split(" ");
        for(int i =arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
    static void reverseTheWords(String str){
        String[] arr = str.split(" ");
        for(int i=0;i<arr.length;i++){
            System.out.print(reverse(arr[i])+" ");
        }
    }
    static String reverse(String s){
        String ans="";
        for(int i=s.length()-1;i>=0;i--){
            ans+=s.charAt(i);
        }
        return ans;
    }
    static void reverseTheWordsinReverse(String str){
        String[] arr = str.split(" ");
        for(int i=0;i<arr.length;i++){
            System.out.print(reverse(arr[i])+" ");
        }
    }
    static String reverse(String s){
        String ans="";
        for(int i=s.length()-1;i>=0;i--){
            ans+=s.charAt(i);
        }
        return ans;
    }
}
