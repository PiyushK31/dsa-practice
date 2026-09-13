package ObjectOrientedProgramming.Abstration;
/**
 * Abstration_Basic
 */

abstract class Animal{
    abstract void display();
}

class Dog extends Animal{

    @Override 
    void display(){
        System.out.println("Aminal is Dog!");
    }
}

class Cat extends Animal{
    @Override 
    void display(){
        System.out.println("Animal is cat!");
    }
}

public class Abstration_Basic {

    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.display();
        System.out.println("=========================");
        Animal cat = new Cat();
        cat.display();

    }
}