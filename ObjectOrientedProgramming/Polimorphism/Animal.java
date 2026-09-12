package ObjectOrientedProgramming.Polimorphism;

public class Animal {

    void Sound() {
        System.out.println("Animal makes sounds!");
    }

    public static void main(String args[]) {
        
        Animal a1 = new Dog();
        Animal res = new Animal();
        Animal a2 = new cat();
        a1.Sound();
        a2.Sound();
    }
}

class Dog extends Animal{
    @Override
    void Sound(){
        System.out.println("Dog is Barking!");
    }
}

class cat extends Animal{
    @Override
    void Sound(){
        System.out.println("meow gok");
    }
}