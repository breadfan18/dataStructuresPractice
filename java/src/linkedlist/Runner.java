package linkedlist;

public class Runner {


    public static void main(String[] args) {

//        String s = "str";
//        Character c = s.charAt(s.length()-1);
//        String newString = c + s + c;
//        System.out.println(newString);

        String test = "del";


         selSort();

    }

    public static Character google() {
        //Goal is to find the first repeating character!
        String input = "google";
        int distance;
        char finalChar = 0;


        return null;
    }

    public static void selSort() {
        int[] array = {9, 2, 8, 12, 7};

        int minIndex, temp;

        for (int i = 0; i <= array.length; i++) {
            minIndex = i;
            for (int j = i+1; j < array.length ; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex  =  j;
                }
            }
            temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }

        for (int i : array) {
            System.out.println(i);
        }

    }
}







