package linkedlist;

import com.sun.media.sound.RIFFInvalidDataException;

import java.util.HashMap;

public class Runner {


    public static void main(String[] args) {

        int[] test = {1, 3, 7, 9}; // {5 ,7, 2}
        int[] test1 = {};

        System.out.println(practice("AX_bread_BX_bread_CX"));
    }



    public static String practice(String str) {
        int first = str.indexOf("bread");
        int last = str.lastIndexOf("bread");

        if (first == last) {
            return "";
        }



        return str.substring(first+5, last);
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











