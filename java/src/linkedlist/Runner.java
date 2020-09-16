package linkedlist;

import com.sun.media.sound.RIFFInvalidDataException;

import javax.swing.*;
import java.util.Arrays;
import java.util.function.DoubleBinaryOperator;

public class Runner {


    public static void main(String[] args) {

        int[] test = {2, 5, 7}; // {5 ,7, 2}
        int[] test1 = {1, 5, 7, 7, 6};

        System.out.println(Arrays.toString(practice(test)));
    }



    public static int[] practice(int[] nums) {

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











