package OppsInJava;

public class ConstructorMain {
    public static void main(String[] args) {
        Constructor s1 = new Constructor("Max", 76, 90.1);

        System.out.println("Name: " + s1.name);
        System.out.println("Roll No: " + s1.getRno());
        System.out.println("Percent: " + s1.percent);
    }
}
