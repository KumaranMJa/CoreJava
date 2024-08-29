abstract class Bird{ // if any method in the class is a abstract method then the class should be decalre as abstract class
    abstract void eat();
    abstract void fly();
}
abstract class Eagle extends Bird{ // if any  abstract method is not overriden then the child class should also decalre abstract.
    //when the child class is called first the super class will be read and the child classs methods will be called next.
    @Override
    void fly(){
        System.out.println("Eagles can fly");
    }
}
class WhiteEagle extends Eagle{
    @Override
    void eat(){
        System.out.println("WhiteEagle eats");
    }
    @Override
    void fly(){
        System.out.println("WhiteEagle flew Low");
    }
}
class GoldenEagle extends Eagle{
    @Override
    void eat(){
        System.out.println("GoldenEagle eats");
    }
    @Override
    void fly(){
        System.out.println("GoldenEagle flew Low");
    }
}

 class FlyingAnimal{
    void dis(Bird ref){
        ref.eat();
        ref.fly();
    }
}
public class Abs {
    public static void main(String[] args){
        //Cannot create object for abstract class
        //constructor can be creat for abstarct class with the help of extended child class constructor with the help of constructor chaining.
        WhiteEagle w = new WhiteEagle();
        GoldenEagle g = new GoldenEagle();
        FlyingAnimal f = new FlyingAnimal();
        //polymorphism is achieved in abstraction
        f.dis(w);
        f.dis(g);
    }
}
