package linkedlist;

import com.sun.media.sound.RIFFInvalidDataException;

import javax.security.auth.login.CredentialException;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleBinaryOperator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Runner {


    public static void main(String[] args) {

        int[] test = {1, 3, 7, 9}; // {5 ,7, 2}
        int[] test1 = {};

        System.out.println(practice("abc", "HiABc"));
    }



    public static boolean practice(String a, String b) {
        //Find out which string is longer.
        //Check if the shorter string is equal to the ending substring of the longer string.
        //how to find which one is longer?

        int difference = Math.abs(a.length() - b.length());

        if (a.length() > b.length()  && a.substring(difference).equalsIgnoreCase(b)) {
            return true;
        } else if (b.length() > a.length() && b.substring(difference).equalsIgnoreCase(a)) {
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











