package linkedlist;

import com.sun.media.sound.RIFFInvalidDataException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Runner {

    static int rent = 2_850;
    static int monthlyExpenses_Fixed = 500;
    static int monthlyExpenses_Variable = 3000;
    static int anshuSalary = 4000;
    static final int mammaBuwaMonthly = 1500;

    public static void main(String[] args) {
        int numberOfMonthsOut = 6;


        int totalExpenses = numberOfMonthsOut * (rent + monthlyExpenses_Fixed + monthlyExpenses_Variable);
        int totalCashAvailable = numberOfMonthsOut * (anshuSalary + mammaBuwaMonthly);

        System.out.println("Total cash used from Savings: " + (totalExpenses - totalCashAvailable));

    }


    public static void practice(int numberOfMonthsOut, boolean onlySwaroop, ) {

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











