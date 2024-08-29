class Cal{
    void add(int a , char b){
        System.out.println("Int Char");
    }
    void add(byte a , char b){
        System.out.println("Byte Char");
    }
}

public class MethOverLoad {
    public static void main(String[] args) {
        Cal c = new Cal();
        c.add(10, 'A');
        c.add('A','B'); //It will typecaste implicity
        main(10,20); //overloaded can have main method but it should have defrent input parametres 
    }
    public static void main(int a , int b){
        System.out.println(a+b);
    }
}

//Method Overloading See - Method Name , No. of parameters , Type of Parameters , It do Imlicit typecasting for parameters.
//Return Types does not comes under method overloading.
