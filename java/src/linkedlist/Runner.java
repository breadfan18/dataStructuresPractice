package linkedlist;

import com.sun.media.sound.RIFFInvalidDataException;

import javax.security.auth.login.CredentialException;
import javax.swing.*;
import java.util.Arrays;
import java.util.function.DoubleBinaryOperator;

public class Runner {


    public static void main(String[] args) {

        int[] test = {1, 3, 5}; // {5 ,7, 2}
        int[] test1 = {1, 5, 7, 7, 6};

        System.out.println(practice(test,  test1));
    }



    public static int practice(int[] a, int[] b) {
        int count = 0;

        if (a.length > 0 && a[0] == 1) {
            count++;
        }
        if (b.length > 0 && b[0] == 1) {
            count++;
        }

        return count;
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











