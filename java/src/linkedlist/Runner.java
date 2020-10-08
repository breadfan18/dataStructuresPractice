package linkedlist;

import java.util.HashMap;

public class Runner {


    public static void main(String[] args) {

        int[] test = {1, 3, 7, 9}; // {5 ,7, 2}
        int[] test1 = {};

        System.out.println(practice("axhahaAAAbreadfddfbread"));
    }



    public static String practice(String str) {
        HashMap<String, Integer> breadCount = new HashMap<>();

        int count = 0;
        for (int i = 0; i < str.length() - 4; i++) {
            String current = str.substring(i, i + 5);
            if (current.equals("bread")) {
                count++;
            }
        }
        breadCount.put("bread", count);

        if (count <= 1) {
            return "";
        }else {
            int indexOfFirstBread = str.indexOf("bread");
            String updated = str.substring(indexOfFirstBread + 5);

            int indexOfSecondBread = updated.indexOf("bread");
            System.out.println(indexOfSecondBread);

            return updated.substring(0, indexOfSecondBread);

        }
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











