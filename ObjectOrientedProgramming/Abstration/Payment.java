package ObjectOrientedProgramming.Abstration;

/**
 * Payment:-this program demonstrate the concept of INTERFACE !
 */

interface Transaction{
    void Pay();
}

class Monney implements Transaction {
    @Override 
    public void Pay(){
        System.out.println("Payment througth UPI");
    } 
}

class Rs implements Transaction{
    @Override 
    public void Pay(){
        System.out.println("Payment throught card");
    }
}

public class Payment {
    public static void main (String args[]){
        Transaction mony = new Monney();
        mony.Pay();

        System.out.println("-------------------------");

        Transaction rup = new Rs();
        rup.Pay();
    }
}