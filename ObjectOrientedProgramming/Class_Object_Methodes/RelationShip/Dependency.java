package ObjectOrientedProgramming.Class_Object_Methodes.RelationShip;

public class Dependency {
    class Printer{
        
        void printDoc(String copy){
            System.out.println("Printing the book: " + copy);
        }
    }

    class Book{
        void PrintBook(){
            Printer print = new Printer();// Dependency via local variable
            print.printDoc("Fullmetal Alchemist");
            System.out.println("Work Completed");
        }
    }

    public static void  main(String args[]){
        Dependency relation = new Dependency();
        Book fma = relation.new Book();
        fma.PrintBook(); // Book depends on Printer to print
    }
}
