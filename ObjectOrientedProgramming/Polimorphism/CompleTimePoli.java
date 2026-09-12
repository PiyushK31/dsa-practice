package ObjectOrientedProgramming.Polimorphism;

//THIS CODE IS FOR COMPILE_TIME_Polimorphism!!
public class CompleTimePoli {
    //SAME NAME API WITH 3 PARAMETERS
    public static void Api(int get, int post , int put){
        System.out.println("Api is working fine!");
    }

    //SAME NAME API WITH NO PARAMETERS!!
    public static void Api(){
        System.out.println("Api method is not defined, not working!");
    }

    public static void main(String args[]){
        CompleTimePoli obj = new CompleTimePoli();
        obj.Api(102 , 400 , 502);
        obj.Api();
    }
}
