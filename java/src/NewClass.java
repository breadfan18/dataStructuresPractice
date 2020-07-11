public class NewClass {


    public static void main(String[] args) {
//        int[] bubbleSort = {12, 8, 7, 5, 2};
//
//        int[] sorted = {};
//
//        for (int i = 0; i < bubbleSort.length-1; i++) {
//            for (int j = 0; j < bubbleSort.length - 1 - i; j++) {
//                if (bubbleSort[j] > bubbleSort[j+1]) {
//                    int temp = bubbleSort[j+1];
//                    bubbleSort[j + 1] = bubbleSort[j];
//                    bubbleSort[j] = temp;
//                    System.out.println(temp);
//                }
//            }
//        }

        int[] a = {2, 7, 4, 1, 5, 3};

        selectionSort(a, 6);

        for (int i = 0; i < 6; i++) {
            System.out.println(a[i]);
        }

    }

    public static void selectionSort(int[] array, int n) {
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

        }
    }
}

