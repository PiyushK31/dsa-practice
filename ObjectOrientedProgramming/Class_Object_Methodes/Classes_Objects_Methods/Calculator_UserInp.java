package ObjectOrientedProgramming.Class_Object_Methodes.Classes_Objects_Methods;

import java.util.*;
public class Calculator_UserInp {

    public static int add(int a , int b){
        return a + b;
    }

    public static int subtract(int a , int b){
        return a - b;
    }

    public static int multiply(int a , int b){
        return a * b;
    }

    public static float divide (int a , int b){
        return a / b;
    }

    public static void main(String[] args) {
        Calculator_UserInp calculator = new Calculator_UserInp();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.println("a + b: " +calculator.add(a, b));
        System.out.println("a - b: " +calculator.subtract(a, b));
        System.out.println("a * b: " +calculator.multiply(a, b));
        System.out.println("a / b: " +calculator.divide(a, b));
    }
}
