package Opps;

// class Pen{
//     String color;
//     String type; //ballpoint; gel

//     public void Write(){
//         System.out.println("Writing someting!");
//     }

//     public void printColor(){
//         System.out.println(this.color);
//     }
// }

class Student{
    String name;
    int age;

    public void PrintInfo(String name){
        System.out.println(name);
    }
    
    public void PrintInfo(int age){
        System.out.println(age);
    }

    public void PrintInfo(String name , int age){
        System.out.println(name);
        System.out.println(age);
    }
    // Student (Student s2){
    //     this.name = s2.name;
    //     this.age = s2.age;
    // }j

    // Student(){

    // }
}

public class OOPS {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "Piyush";
        s1.age = 21;

        s1.PrintInfo(s1.name , s1.age);

        // Student s2 = new Student(s1);
        // s2.PrintInfo();
        // Pen pen1 = new Pen();
        // pen1.color = "blue";
        // pen1.type  = "gel";

        // pen1.Write();
        // pen1.printColor();
    }
}