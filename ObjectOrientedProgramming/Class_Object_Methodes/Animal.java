package ObjectOrientedProgramming.Class_Object_Methodes;

public class Animal {
    //Making Classes with argument
    public static void eat(String name){
        System.out.println(name+ " is Eating");
    }

    //Making Classes with argument
    public static void run(String name){
        System.out.println(name+ " is Running");
    }

    //Making Classes with argument
    public static void sleep(String name){
        System.out.println(name+ " is Sleeping");
    }

    //Making Classes with argument
    public static void onePice(String name){
        System.out.println(name+ " said One Piece is real");
    }
    //main class:-
    public static void main(String args[]){
        //creating an object!
        Animal jambo = new Animal();
        jambo.eat("jambo");
        jambo.run("jambo");

        //creating an object!
        Animal buzo = new Animal();
        buzo.sleep("buzo");
        buzo.onePice("buzo");
    }
}
