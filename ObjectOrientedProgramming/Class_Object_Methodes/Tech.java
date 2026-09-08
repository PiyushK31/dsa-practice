package ObjectOrientedProgramming.Class_Object_Methodes;

public class Tech {
    // Instance variables
    int working_time;
    String laptop;

    //Method  to display deatails
     public void Details(String name) {
        System.out.println("----Details of \"" + name + "\"---");
        System.out.println(name + " working hours:" + working_time);
        System.out.println(name + " has a:" + laptop);
    }

    //main Method 
    public static void main(String args[]) {

        //creating new obj name piyush!
        Tech piyush = new Tech();
        piyush.working_time = 8;
        piyush.laptop = "Hp";
        piyush.Details("Backend Dev");
        // piyush.Dev("Backend Dev");

        //creating new object name cj!
        Tech cj = new Tech();
        cj.working_time = 8;
        cj.laptop = "Apple";
        cj.Details("Data Scientist");
        // cj.Data("Data Scientist ");
    }

}
