package linkedlist;

import com.sun.media.sound.RIFFInvalidDataException;

import javax.security.auth.login.CredentialException;
import javax.swing.*;
import java.util.Arrays;
import java.util.function.DoubleBinaryOperator;

public class Runner {


    public static void main(String[] args) {

        int[] test = {2, 3, 5}; // {5 ,7, 2}
        int[] test1 = {1, 5, 7, 7, 6};

        System.out.println(Arrays.toString(practice(test)));
    }



    public static int[] practice(int[] nums) {
        //array  lengthh is  3, so loop 3 times,  check  each  time if  element  is 2
        //if  yes, chheck  is next  eelemeent is 3
        //if  yes, seet next eleement to 0

        for (int i = 0; i < 3; i++) {
            if (nums[i] == 2) {
                if (nums[i + 1] == 3) {
                    nums[i + 1] = 0;
                }
            }
        }
        return nums;
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











