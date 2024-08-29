class Bank{
    
    private int balance ; //private is to give security to coollent so no one can access
    private int accNo ;
    //getter and setter is to access the private data by other class.
    public void setBal(int balance){ //Input parameter here is a local variable, which is inside main method.
        if(balance>0){
            this.balance = balance; //this - refers to the instace varaiable of the class.
        }
        else{
            System.out.println("Invalid Balance");
        }
    } 
    public void setAccNo(int accNo){
        this.accNo = accNo;
    }
    public int getBal(){
        return balance;
    }
    public int getAccNo(){
        return accNo;
    }
}


public class Encapsul1 {
    public static void main(String[] args) {
        Bank a = new Bank();
        a.setBal(3000);
        a.setAccNo(1234560987);
        System.out.println(a.getBal());
        System.out.println(a.getAccNo());
        //System.out.println(a.coolent); //private thing cant access by other class
    }
}
//abstract is to give the security to the objects
//To access the secured things we use getter and setter method