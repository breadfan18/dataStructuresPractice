package linkedlist;

import com.sun.media.sound.RIFFInvalidDataException;

import javax.security.auth.login.CredentialException;
import javax.swing.*;
import java.util.Arrays;
import java.util.function.DoubleBinaryOperator;

public class Runner {


    public static void main(String[] args) {

        int[] test = {4,5,6}; // {5 ,7, 2}
        int[] test1 = {1, 5, 7, 7, 6};

        System.out.println(Arrays.toString(practice(test)));
    }



    public static int[] practice(int[] nums) {
      //get length of the array
        //int number of elements to add = length -1.

        int numsLength = nums.length;
        int lengthOfNewArray = numsLength*2;
        int lastElementInOriginalArray = nums[numsLength - 1];
        int[] newNums = new int[lengthOfNewArray];

        newNums[lengthOfNewArray-1] = lastElementInOriginalArray;

        return newNums;
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











