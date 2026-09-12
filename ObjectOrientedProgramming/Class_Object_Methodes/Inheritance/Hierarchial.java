package ObjectOrientedProgramming.Class_Object_Methodes.Inheritance;
//multi-leve-Inharatince
public class Hierarchial {
    public class Api extends Hierarchial{

        void Post(){
            System.out.println("Post is method in Http which help to created Api endPoints");
        }

    }

    public class ip extends Hierarchial{
        void Get(){
            System.out.println("every req SENDING by apiEndpoints has an ip");
        }
    }

    public static void main(String args[]){
        Hierarchial res = new Hierarchial();
        Api call = res.new Api();
        ip port = res.new ip();
        call.Post();
        port.Get();
    }
}
