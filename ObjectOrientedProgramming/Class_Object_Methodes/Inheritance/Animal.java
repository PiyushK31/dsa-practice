package ObjectOrientedProgramming.Class_Object_Methodes.Inheritance;

/**
 * Animal
 */
public class Animal {
    
    void eat(){
        System.out.println("Dog is eating!");
    }

    /**
     * Inheritance:-
     */
    class Dog extends Animal{
        void bark(){
            System.out.println("Dog is Barking!");
        }
    }

    public static void main(String args[]){
        Animal result = new Animal();
        Dog d = result.new Dog();
        d.eat();
        d.bark();
    }
}