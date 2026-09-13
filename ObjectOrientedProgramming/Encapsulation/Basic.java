package ObjectOrientedProgramming.Encapsulation;

class Animal{

    String name;
    int eye;

    void display(String nm , int eyee){
        name = nm;
        eye = eyee;
    }

    void PrintDet(){
        System.out.println("The Animal is: " + name);
        System.out.println("The Animal has eye: " + eye);
    }
}
public class Basic {
    public static void main(String args[]){
        Animal a = new Animal();
        a.display("Dog", 2);
        a.PrintDet();
    }
}
