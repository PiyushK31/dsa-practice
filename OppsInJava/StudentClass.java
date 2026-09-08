package OppsInJava;

public class StudentClass {
    public static class Student extends GetSet {

        public String name;
        public double percent;
        public int rno;
        //creating a new data type:-
       
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "max";
        s1.percent = 92.1;
        // s1.rno = 150;

        s1.setRno(150);

        // show that it works
        System.out.println("Name: " + s1.name);
        System.out.println("Percent: " + s1.percent);
        System.out.println("Roll No (getter): " + s1.getRno());
    }
}
