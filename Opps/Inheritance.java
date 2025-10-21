package Opps;

class Shap{
    public void area(){
        System.out.println("Display area!");
    }
}

class Triangle extends Shap{
    public void area(int l , int  h){
        System.out.println(1/2 * l * h);
    }
}

class Circle extends Shap{
    public void area(int r){
        System.out.println(3.14 * r * r);
    }
}

public class Inheritance {
    public static void main(String args[]){
        Shap s;
        s = new Shap();
        s.area();

        s = new Triangle();
        ((Triangle) s).area(10, 5);

        s = new Circle();
        ((Circle) s).area(7);
    }
}
