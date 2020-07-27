package chapter1;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        String str = "x";


            if (str.length() >=3 && str.substring(0, 3).equals("not")) {
                System.out.println(str);
            } else {
                System.out.println("not " + str);
            }

        }



}
