package ObjectOrientedProgramming.Class_Object_Methodes.Classes_Objects_Methods;

import java.util.Scanner;
class Calculatorr {

    public static int add(int a , int b){
        return a + b;
    }
    
    public static int subtract(int a, int b){
        return a - b;
    }

    public static int multiply(int a , int b){
        return a * b;
    }

    public static float divide(int a , int b){
        return a / b;
    }

    //main function:-
    public static void main(String[] args) {
        Calculatorr calculator = new Calculatorr();
        System.out.println(calculator.add(12, 3));
        System.out.println(calculator.subtract(12, 3));
        System.out.println(calculator.multiply(12, 2));
        System.out.println(calculator.divide(12, 3)); 
    }
}