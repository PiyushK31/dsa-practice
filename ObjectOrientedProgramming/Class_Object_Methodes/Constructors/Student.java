package ObjectOrientedProgramming.Class_Object_Methodes.Constructors;

public class Student {
 
    //instance variable:-
    String name;
    int rollNo;

    //constructer:-
    Student(String nm , int rn){
        name = nm;
        rollNo = rn;
    }

    public static void main(String args[]){
        Student obj1 = new Student("kalu", 123);
        System.out.println(obj1.name + ":" + obj1.rollNo);

        Student obj2 = new Student("Piyush" , 150);
        System.out.println(obj2.name + ":" + obj2.rollNo);
    }
}
