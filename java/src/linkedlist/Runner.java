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

        System.out.println(practice("xyz"));
    }



    public static boolean practice(String str) {
        String regex = "[^.]xyz";

        for (int i = 0; i <= str.length()-3; i++) {
            if (i == 0) {
                String current = str.substring(0, 3);
                System.out.println(current);
                if (current.equalsIgnoreCase("xyz")) {
                    return true;
                }
            }else {
                String current = str.substring(i, i + 4);
                if (current.matches(regex)) {
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











