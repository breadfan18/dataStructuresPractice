package linkedlist;

import com.sun.media.sound.RIFFInvalidDataException;

import javax.security.auth.login.CredentialException;
import javax.swing.*;
import java.util.Arrays;
import java.util.function.DoubleBinaryOperator;

public class Runner {


    public static void main(String[] args) {

        int[] test = {1, 3}; // {5 ,7, 2}
        int[] test1 = {7, 6};

        System.out.println(Arrays.toString(practice(test, test1)));
    }



    public static int[] practice(int[] a, int[] b) {
        int[] nnn = new int[4];
        nnn[0] = a[0];
        nnn[1] = a[1];
        nnn[2] = b[0];
        nnn[3] = b[1];

        return nnn;

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











