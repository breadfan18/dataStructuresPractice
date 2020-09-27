package linkedlist;

import com.sun.media.sound.RIFFInvalidDataException;

import javax.security.auth.login.CredentialException;
import javax.swing.*;
import java.util.Arrays;
import java.util.function.DoubleBinaryOperator;

public class Runner {


    public static void main(String[] args) {

        int[] test = {1, 3, 5, 7, 9}; // {5 ,7, 2}
        int[] test1 = {7, 6};

        System.out.println(practice(test));
    }



    public static int practice(int[] nums) {
        int middle  = nums.length/2;

        int max = Math.max(nums[0], Math.max(nums[middle], nums[nums.length - 1]));

        return max;


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











