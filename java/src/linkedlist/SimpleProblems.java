package linkedlist;

public class SimpleProblems {

    public static void reverseStringWithStringBuilderLoop(){
        String name = "swarooop";

        StringBuilder sb = new StringBuilder();

        for (int i = name.length()-1; i >= 0; i--) {
            sb.append(name.charAt(i));
        }

        String  newName  = sb.toString();
        System.out.println(newName);
    }

    public static void reverseWithStringBuilderMethod(){
        String name = "swarooop";

        StringBuilder sb = new StringBuilder(name);
        String  newName  = sb.reverse().toString();
        System.out.println(newName);
    }


    public static void reverseString(){
        String name = "Manchester United is the Best";
        String reversed = "";

        for (int i = name.length()-1; i >= 0; i--) {
            reversed = reversed + name.charAt(i);
        }


        System.out.println(reversed);
    }


    public static void selectionSort(int[]array, int n) {

        int minIndex;
        for (int i = 0; i < n - 1; i++) {
            minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;

            System.out.println(temp);


        }
    }


    public static int[] insertionSort(int[] list) {

        int j, element, temp;

        for (int i = 1; i < list.length; i++) {
            element = list[i];
            j = i-1;

            while (j >=0 && element < list[j]) {
                temp = list[j];
                list[j] = list[j+1];
                list[j+1] = temp;
                j--;
            }
        }

        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }

        return list;
    }

}
