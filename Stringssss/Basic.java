import java.util.*;
class Basic{
    public static void main(String args[]){

        //String Delecerition:-
        // String name = "Piyush";
        // System.out.println(name);


        //Taking input in STR:-
        // Scanner sc = new Scanner(System.in);
        //this is for single line:-
        // String name = sc.next();
        // String name = sc.nextLine();
        // System.out.println("Your name is:" +name);


        //Concatentation(can write A String between Two String!)
        // String firstName = "Piyush";
        // String secName = "Kumar";
        // String name = firstName+ " " +secName;
        // System.out.println(name);


        //length function:-
        // String emaill = "PiyushDev12@tdx.in";
        // System.out.println(emaill.length());


        //CharAt(to find what the value at char x):-
        // String text = "My name is Piyush";
        // for(int i=0 ; i<text.length(); i++){
        //     System.out.println(text.charAt(i));
        // }


        //compare:-
        // String nameOne = "hsuyip";
        // String nameTwo = "Piyush";
        // if(nameOne.compareTo(nameTwo) == 0){
        //     System.out.println("String is equal :)");
        // }
        // else{
        //     System.out.println("String is not equal :(");
        // }


        //Sub-Strings:-
        // String text = "My name is piyush";
        /*  substring(start , end);    */
        // String name = text.substring(11 , text.length());
        // System.out.println(name);

    
        //Declear and Print StringBullder:-
        //StringBuilder sb = new StringBuilder("Tony");
        // System.out.println(sb);
        

       //Incert at String:-
       //sb.insert(3, "n");
       //System.out.println(sb);

       //.Del_Function:- 
    //    sb.delete(2,3);
    //    System.out.println(sb);//----> Toy

       //Append function in java:- 
       StringBuilder sb = new StringBuilder("h");//  ---->  h
       sb.append("e");// -> he
       sb.append("l");// -> hel
       sb.append("l");// -> hell
       sb.append("o");// -> hello
       System.out.println(sb);
    }
}