package Cognizant;

/**
 * Student
 */
public class Student {
    String name;
    int rollno;
    int marks;
    public Student(String nm , int rn , int mrk){
        name = nm; 
        rollno = rn;
        marks = mrk;
    }

    public static void main(String[] args) {
        Student obj1 = new Student("Piyush", 150, 80);
        System.out.println(obj1);
        System.out.println("-------------------");
        Student obj2 = new Student("Max", 132, 83);  
        System.out.println(obj2);
    }
}