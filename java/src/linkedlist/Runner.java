package linkedlist;

public class Runner {


    public static void main(String[] args) {

        System.out.println(practice());

    }



    public static boolean practice() {
        String str = "bad";
        if(str.length() >=3 && str.substring(0,3).equals("bad")){
            return true;
        }
        if(str.length() >=4 && str.substring(1,4).equals("bad")){
            return true;


        }
        return false;
    }



    public static void swap() {

        String a = "Swaroop";
        String b = "Anshu";

        System.out.println("Before Swap");
        System.out.println("-----------------");
        System.out.println("a:  " + a);
        System.out.println("b:  " + b);

        String temp = b;
        b  = a;
        a = temp;

        System.out.println();
        System.out.println("After Swap");
        System.out.println("-----------------");
        System.out.println("a:  " + a);
        System.out.println("b:  " + b);
    }




}











