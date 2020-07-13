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

        int[] a = {7, 2, 4, 1, 5, 3};

        insertionSort(a);





    }


    public static int[] insertionSort(int[] list) {
        int j, element, temp;

        for (int i = 1; i < list.length; i++) {
            element = list[i]; //2
            j = i-1; //0

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

            System.out.println(temp);
        }
    }

    public static int findNumberInOrderedArray(int[] array, int number) {
        int midIndex =  array.length/2;
        int desiredNumberIndex;

        
    }

}


