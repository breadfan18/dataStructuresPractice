package linkedlist;

public class Challenge extends SimpleProblems{


    public static void main(String[] args) {
//        List<String> groceries = new ArrayList();
//
//        groceries.add("Pumpkin");
//        groceries.add("Cilantro");
//        groceries.add("Beer");
//        groceries.add("Cigarettes");
//
//        List<String> moreGroceries = new ArrayList();
//        moreGroceries.add("Banana");
//        moreGroceries.add("Apples");
//
//
//
//        groceries.addAll(moreGroceries);
//
//        Collections.sort(groceries);
//
//        System.out.println(groceries);
//
//        String searchItem = "Beer";
//
//        if (groceries.contains(searchItem)) {
//            groceries.remove(searchItem);
//        }
//
//        System.out.println(groceries);







        int[] array = {9, 2, 8, 12, 7};
        String[] itemArray = {"apples", "banana", "grapes"};

        reverseStringWithStringBuilderLoop();

        reverseString();

        reverseWithStringBuilderMethod();

        insertionSort(array);

        selectionSort(6);

        palindrome("NeveroddorEVen");

        addObjectsIntoArrayList();

        exceptionsOutOfString();

        vowelsOrConsonants("I aM a HaPpy mOuse");

        isItemInArray("grapes", itemArray);

        System.out.println(returnStringByDivisible(32));

        fizzBuzz();

        isArmstrong(3717);

        validateIpWithRegex("0.12.123.234");

        validateIPEasyWay("0.12.123.234");

        findTheNumber(1);

        oddNumbers(11, 20);

        countPairsOfSumLessThanX(array, array.length, 7);



    }







}
