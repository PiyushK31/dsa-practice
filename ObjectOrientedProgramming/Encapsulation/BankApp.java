package ObjectOrientedProgramming.Encapsulation;

class Acount{
    private String accountHolder;
    private double balance;

    public String getAccountHolder(){
        return accountHolder;
    }

    /** 
     * Implement Geter and Seter Function:-
     */
    public void setAccountHolder (String accountHolder){
        this.accountHolder = accountHolder;
    }

    public double getBalance(){
        return balance;
    }

    public void deposite(double amount){
        balance = balance + amount;
        System.out.println("YOU HAVE DEPOSITE " + amount + "RS AND NOW BALANCE IS " + balance + " RS.");

    }

    public void withdraw(double amount){
        balance = balance - amount;
        System.out.println("YOU HAVE WITHDRAW " + amount + "RS ANS NOW THE BALANCE IS " + balance + " RS.");
    }
}
public class BankApp {
    public static void main(String args[]){
        Acount obj = new Acount();
        obj.deposite(1000000);
        obj.withdraw(100000);
        obj.getBalance();
    }
}
