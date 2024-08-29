interface Calculator1{
     void add(); // By default  in interface the methods are abstract and public
     void sub();
}
interface Calculator2{
    void mul();
    void div();
}

//Multiple inheritence is indirectly achieved through interface.

//Here two super class and one base class where that implenting two interfaces.

abstract class MyCalc1 implements Calculator1 , Calculator2{
 @Override
 public void add(){
    System.out.println("Adding : ");
 }
 //partially implented methods should have the class as abstract
 @Override
 public void mul(){
    System.out.println("Multiplication : ");
 }
}

public class IntfacTwo {
    public static void main(String[] args) {
        
    }
}
