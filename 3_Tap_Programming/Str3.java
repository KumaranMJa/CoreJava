import java.util.Scanner;
//To count the number of spaces in the sentence
public class Str3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int res = checkSpaces(str);
        System.out.println(res);
    }
    static int checkSpaces(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                count++;
            }
        }
        return count;
    }
}
//when using charAt a string method , it gives the character value in the string.