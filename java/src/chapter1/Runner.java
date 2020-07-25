package chapter1;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int temp;

        System.out.println("Before Swapping: " + "X = " + x + " and" + " Y = " + y);

        System.out.println("--------------------------------------------");
        temp = x;
        x = y;
        y = temp;

        System.out.println("After Swapping: " + "X = " + x + " and " + " Y = " + y);

    }
}
