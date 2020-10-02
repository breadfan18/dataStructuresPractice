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

        System.out.println(practice("aaa", "bbbccc"));
    }



    public static String practice(String a, String b) {
        //charArray for a
        //charArray for b
        //find out which string is longer, iterate over the length of the longer  one.
        //
        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();
        StringBuilder sb = new StringBuilder();

        int max = Math.max(a.length(), b.length());

        for (int i = 0; i < max; i++) {
            if (a.length() > i) {
                sb.append(aChars[i]);
            }
            if (b.length()  > i){
                sb.append(bChars[i]);
            }

        }
        return sb.toString();
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











