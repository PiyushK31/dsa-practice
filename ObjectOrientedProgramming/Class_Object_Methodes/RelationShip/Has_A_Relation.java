package ObjectOrientedProgramming.Class_Object_Methodes.RelationShip;
import java.util.*;
public class Has_A_Relation {

    class Info{
        Scanner sc = new Scanner(System.in);
        String state = sc.next();
        int age = sc.nextInt();

        void displayAdd(){
            System.out.println("State: " + state + " : " + "age: " + age);
        }
    }

    class Student{
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int rollNo = sc.nextInt();

        // Direct reference to another class
        Info details = new Info();// Object created directly inside the class

        void Studentss(){
            System.out.println("name: " + name + " " + "RollNo: " + rollNo);
            details.displayAdd();
        }
    }

    public static void main(String[] args) {
        Has_A_Relation relation = new Has_A_Relation();
        Student s = relation.new Student();// No need to pass Address
        s.Studentss();// Displays student info along with address
    }
}
