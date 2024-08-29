@FunctionalInterface
interface Show{
    void disp(int a , int b);
}
public class IntfacLambda {
    public static void main(String[] args) {
        Show d = (a,b) -> { System.out.println(a+b); }; //Lambda Function - () [input parametres] -> [pointing towrds body] {} [body]
        d.disp(10 , 20);
    }
}
/*
 * Lambda Epression
 * = (int a) -> { };
 * = (a) -> { };
 * = a -> { }; (for two or more number of parameters "( )" should be compulsory
 * All are correct lambda expression
 * Lambda is used for functional interface not for normal interface
 */
