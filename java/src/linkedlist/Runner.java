package linkedlist;

import com.sun.media.sound.RIFFInvalidDataException;

import java.util.HashMap;

public class Runner {


    public static void main(String[] args) {

        int[] test = {1, 3, 7, 9}; // {5 ,7, 2}
        int[] test1 = {};

        System.out.println(practice("abc*ce*f"));
    }



    public static boolean practice(String str) {
        //first count how many starts in string??

        for (int i = 1; i < str.length()-1; i++) {

            if (str.charAt(i) == '*') {
                if (str.charAt(i - 1) == str.charAt(i + 1)) {
                    return true;
                }
            }
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











