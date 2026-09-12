package ObjectOrientedProgramming.Polimorphism;
/**
 * RunTimePoli
 */
public class RunTimePoli {
    public static void main(String[] args) {
        Api a = new http();
        a.fun();
    }
}

class Api {
    void fun(){
        System.out.println("Api is working!");
    }
}

class http extends Api{
    @Override 
    void fun(){
        System.out.println("Http port:5000, local host");
    }
}