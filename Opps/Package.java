package Opps;

class Account{
    public String name;
    protected String email;
    private String password;

    //geter & seter:-
    public String getPassword(){
        return this.password;
    }

    public void setPassword(String pass) {
        this.password = pass;
    }
}

public class Package {
    public static void main(String args[]){
        Account account1 = new Account();
        account1.name = "Piyush";
        account1.email = "piyushkrr80580@gmail.com";
        account1.setPassword("Piyush!@#$%^&*()");
        System.out.println(account1.getPassword());
    }
}