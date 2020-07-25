package chapter1;

public class Runner {

    public static void main(String[] args) {

        String testStrng = "Swaroop";
        String reversed = "";

        for (int i = testStrng.length()-1; i >= 0; i--) {
            reversed = reversed + testStrng.charAt(i);

        }

        System.out.println(reversed);

    }
}
