package linkedlist;

import com.sun.media.sound.RIFFInvalidDataException;

import javax.swing.*;
import java.util.Arrays;
import java.util.function.DoubleBinaryOperator;

public class Runner {


    public static void main(String[] args) {

        int[] test = {2, 5, 7}; // {5 ,7, 2}
        int[] test1 = {1, 5, 7, 7, 6};

        System.out.println(Arrays.toString(practice(test)));
    }



    public static int[] practice(int[] nums) {
        //what is asked?
            //compare first and last element of array and set a max value based on which is larger
            //set the rest of the elements as that max value
        int max = 0;
        if (nums[0] > nums[2]) {
            max = nums[0];
        }
        else if (nums[0] < nums[2]) {
            max = nums[2];
        }

        return new int[]{max, max, max};
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











