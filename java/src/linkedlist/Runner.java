package linkedlist;

public class Runner {


    public static void main(String[] args) {

        int[] test = {1, 3, 7, 9}; // {5 ,7, 2}
        int[] test1 = {};

        System.out.println(practice("abxbreadhahabread"));
    }



    public static String practice(String str) {
        String regex = ".*bread.*bread.*";

        if (!str.matches(regex)) {
            return "lol";
        }else {

        }

        return "bread";
    }

    public static boolean isOdd(int n) {
        if (n % 2 != 0) {
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











