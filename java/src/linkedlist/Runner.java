package linkedlist;

import com.sun.media.sound.RIFFInvalidDataException;

import javax.security.auth.login.CredentialException;
import javax.swing.*;
import java.util.Arrays;
import java.util.function.DoubleBinaryOperator;

public class Runner {


    public static void main(String[] args) {

        int[] test = {1, 3, 7, 9}; // {5 ,7, 2}
        int[] test1 = {};

        System.out.println(Arrays.toString(practice(test, test1)));
    }



    public static int[] practice(int[] a, int[] b) {

        if (a.length == 0 && b.length == 0) {
            return a;
        }
        if (a.length == 0) {
            int[] myArr = new int[] {b[0]};
        }
        if (b.length == 0) {
            int[] myArr = new int[] {a[0]};
        }

        int[] myArr = new int[] {a[0], b[0]};
        return myArr;
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











