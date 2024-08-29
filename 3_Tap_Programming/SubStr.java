import java.util.Scanner;
public class SubStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        boolean ans = subSequence(s1,s2);
        System.out.print(ans);
        sc.close();
    }
    static boolean subSequence(String s1,String s2){
        //char dummy ='a';
        //char dummy ='b';
        int i=0,j=0;
        while(i<s1.length()&&j<s2.length()){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(j);
            if(c1==c2){
                i++;
                j++;
            }
            else{
                i++;
            }
        }
        return j==s2.length() ? true : false ;
    }
}
