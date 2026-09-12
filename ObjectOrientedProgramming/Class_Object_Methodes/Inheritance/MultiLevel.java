package ObjectOrientedProgramming.Class_Object_Methodes.Inheritance;

public class MultiLevel {
    public class Dog extends MultiLevel{
        void eat(){
            System.out.println("The Dog is Eating");
        }
    }

    public class Puppy extends Dog{
        void cute(){
            System.out.println("The Puppy is Cutieee!");
        }
    }

    public static void main(String args[]){
        MultiLevel result = new MultiLevel();
        // Dog d = result.new Dog();
        // d.eat();
        Puppy p = result.new Puppy();
        p.eat();
        p.cute();
    }
}
