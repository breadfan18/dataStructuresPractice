package linkedlist;

public class Runner {


    public static void main(String[] args) {

        System.out.println(practice());

    }



    public static String practice() {
        String a = "abc";
        String b = "";

        String output;

        if (a.length() == 0 || b.length() == 0) {
            output = a.concat(b);
        }
        else if (a.charAt(a.length() - 1) == b.charAt(0)) {
            String aShortened = a.substring(0, a.length() - 1);
            output = aShortened.concat(b);
        }else output = a.concat(b);

      return output;
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











