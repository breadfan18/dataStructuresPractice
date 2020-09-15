package linkedlist;

import com.sun.media.sound.RIFFInvalidDataException;

import java.util.function.DoubleBinaryOperator;

public class Runner {


    public static void main(String[] args) {

        System.out.println(practice(new int[]{2, 5, 6}));
    }



    public static boolean practice(int[] nums) {
        if (nums[0] == 6 || nums[nums.length - 1] == 6) {
            return true;
        }

        return  false;
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











