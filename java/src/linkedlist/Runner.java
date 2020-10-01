package linkedlist;

import com.sun.media.sound.RIFFInvalidDataException;
import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

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

        System.out.println(practice("bbb"));
    }



    public static boolean practice(String str) {
        //find the index of last x, and see if theres a y after that..
            //how?
                //loop over string, set index as x is found
        //if yes, then true, if no then false
        int lastIndexOfX = 0;
        int lastIndexOfY = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                lastIndexOfX = i;
            }
            if (str.charAt(i) == 'y') {
                lastIndexOfY = i;
            }
        }

        if (lastIndexOfX < lastIndexOfY) {
            return true;
        }else return false;




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











