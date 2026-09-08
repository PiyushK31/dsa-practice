package OppsInJava;

public class GetSet {
    public String name;
    public double percent;
    private int rno;   // private, so only accessible by getter & setter

    // getter
    public int getRno() {
        return rno;
    }

    // setter
    public void setRno(int rollno) {
        rno = rollno;
    }
}
