import java.util.Scanner;
//Pallindrome
public class Str2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans = checkPallindrome(s);
        System.out.println(ans);
        sc.close();
    }
    static String checkPallindrome(String s){
        int i=0 , j=s.length()-1;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                return "Not a Pallindrome";
            }
        }
        return "Pallindrome";
    }
}
//in built method to reverse , rev = reverse(str)
//str.equals(rev)
// s1==s2 -> compares references , s1.equals(s2) -> compares values for objects
// learn all the ways to vompare the string
//s1.comparesTo(s2) - 0 (if s1==s2) , 1 (if s1>s2) , -1 (if s1<s2)