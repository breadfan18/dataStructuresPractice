package linkedlist;

import com.sun.media.sound.RIFFInvalidDataException;

import javax.security.auth.login.CredentialException;
import javax.swing.*;
import java.util.Arrays;
import java.util.function.DoubleBinaryOperator;

public class Runner {


    public static void main(String[] args) {

        int[] test = {2, 1, 3, 7, 9}; // {5 ,7, 2}
        int[] test1 = {7, 6};

        System.out.println(practice(test));
    }



    public static boolean practice(int[] nums) {
        //need to  check the length of  the array,
        //if less than 2, return  false
        //if less than oro equal to 3, check if 1 = 1 and 2 = 3
        //if greater than 3, if first element is 1

        int length = nums.length;

        if (length < 2) {
            return false;
        } else if ((nums[0] == 1 && nums[1] == 3) || (nums[nums.length-2] == 1 && nums[nums.length-1] == 3)   ) {
            return  true;
        } else if (nums[1] == 1 && nums[2] == 3) {
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











