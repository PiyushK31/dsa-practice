package ObjectOrientedProgramming.Class_Object_Methodes.Constructors;

public class Parameterized {

    public Parameterized(int num){
        System.out.println("number is: " + num);
    }

    public  static void main(String args[]){
        Parameterized obj = new Parameterized(100);
    }
}
