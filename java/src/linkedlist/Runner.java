package linkedlist;

import com.sun.media.sound.RIFFInvalidDataException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Runner {


    public static void main(String[] args) {

        int[] test = {1, 3, 7, 9}; // {5 ,7, 2}
        int[] test1 = {};

        System.out.println(practice("abcdefgh"));
    }



    public static String practice(String str) {
        //loop over string

        StringBuilder sb = new StringBuilder();

        List<String> mList = new ArrayList<>();

        for (int i = 0; i < str.length()-2; i+=3) {
            mList.add(str.substring(i, i + 3));
        }

        for (String s : mList) {
            String flipped = s.substring(1, 3) + s.charAt(0);
            sb.append(flipped);
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











