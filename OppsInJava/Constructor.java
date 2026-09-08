package OppsInJava;

import OppsInJava.StudentClass.Student;

public class Constructor {
    String name;
    double percent;
    int rno;   

    // Proper constructor (no void, same name as class)
    public Constructor(String naam, int roll, double per) {
        name = naam;
        rno = roll;
        percent = per;
    }

    // Getter
    public int getRno() {
        return rno;
    }

    // Setter
    public void setRno(int rollno) {
        rno = rollno;
    }
}
