package linkedlist;

import abstracts.employees.*;
import abstracts.employees.myEmployees.Deepika;
import abstracts.employees.myEmployees.Gio;
import abstracts.employees.myEmployees.Kranthi;
import abstracts.employees.myEmployees.Latika;


import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleProblems {

    public static void reverseStringWithStringBuilderLoop(){
        String name = "swar\noop";

        //Test data
            //empty string
            //all kinds of alpha characters  /.@#$%^
            //escape sequences..like a newline in the middle of the string
            //test with digits
            //untrimmed string, with  spaces at the beginning and end

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
        String newName  = sb.reverse().toString();
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

    public static void palindrome(String input) {
        //first reverse the String
        String reversed = "";
        for (int i = input.length()-1; i >= 0 ; i--) {
            reversed = reversed + input.charAt(i);
        }
        if (input.equalsIgnoreCase(reversed)) System.out.println("It's a palindrome");
        else System.out.println("Its not a palindrome");

    }


    public static void selectionSort(int n) {

        //Time Complexity - Big  O of O(n^2)
        //Pretty complex,  so useful only for small data sets
        int[] array = {9, 2, 8, 69, 7, 1};

        int minValueIndex;
        for (int i = 0; i <= n-1; i++) {
            minValueIndex = i;

            for (int j = i+1; j < n; j++) {
                if (array[j] < array[minValueIndex]) {
                    minValueIndex = j;
                }
            }
            int temp = array[minValueIndex];
            array[minValueIndex] = array[i];
            array[i] = temp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


    public static int[] insertionSort(int[] list) {

        int j, key, temp;

        for (int i = 1; i < list.length; i++) {
            key = list[i];
            j = i-1;

            while (j >=0 && key < list[j]) {
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


    public static void addObjectsIntoArrayList() {
        List<Object[]> mylist = new ArrayList<>();

        mylist.add(new Object[]{1, "String", "Test", 2.2, 3});
        mylist.add(new Object[]{1, "Integer", "Test", 2.2, 3});
        mylist.add(new Object[]{1, "Long", "Test", 2.2, 3});
        mylist.add(new Object[]{1, "Double", "Test", 2.2, 3});

        Object[] myObj = mylist.get(3);
        System.out.println(myObj[1]);
    }


    public void numberSwap(){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int temp;

        System.out.println("Before Swapping: " + "X = " + x + " and" + " Y = " + y);

        System.out.println("--------------------------------------------");
        int total = x + y;
        y = total - y;
        x = total - x;

        System.out.println("After Swapping: " + "X = " + x + " and " + " Y = " + y);
    }


    public static void exceptionsOutOfString(){
        String input = "org.hibernate.exception.SQLException: error executing work org.hibernate.exception.SQLGrammarException: error \n" +
                "executing work &nbsp;&nbsp;&nbsp;&nbsp;at  ~[hibernate-core-5.0.12.Final.jar:5.0.12.Final] &nbsp;&nbsp;&nbsp;&nbsp;\n" +
                "\\norg.hibernate.exception.SQLGrammarException: error executing work &nbsp;&nbsp;&nbsp;&nbsp;at  ~[hibernate-core-5.0.12.Final.jar:5.0.12.Final] \n" +
                "&nbsp;&nbsp;&nbsp;&nbsp; Caused by: java.sql.SQLSyntaxErrorException: malformed string: 'Acme''&nbsp;&nbsp;&nbsp;&nbsp;at.... SQLException /...SQLException...NullPointerException";

        String regex = "[a-zA-Z]*Exception";

        Matcher m = Pattern.compile(regex).matcher(input);

        List<String> exceptions = new ArrayList<>();

        while (m.find()) {
            exceptions.add(m.group());
        }
        System.out.println(exceptions);

        HashMap<String, Integer> myHashmap = new HashMap<>();

//        for (int i = 0; i < exceptions.size(); i++) {
//            System.out.println(exceptions.get(i));
//            int occurrences = Collections.frequency(exceptions, exceptions.get(i));
//            myHashmap.put(exceptions.get(i), occurrences);
//        }

        //count the occurrences of each  element of the array in the hashmap. If it's already there, we increment it by 1
        for (int i = 0; i < exceptions.size(); i++) {
            String currentKey = exceptions.get(i);
            if (myHashmap.containsKey(currentKey)) {
                myHashmap.put(currentKey, myHashmap.get(currentKey) + 1);
            } else {
                myHashmap.put(currentKey, 1);
            }
        }

        for (String s: myHashmap.keySet()) {
            System.out.println(s + ": " + myHashmap.get(s));
        }
    }

    public static String vowelsOrConsonants(String s) {
        String trimmed = s.trim().replaceAll(" ", "").toLowerCase();

        int vowelsCount = 0;
        int consonantsCount = 0;

        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};

        for (int i = 0; i < trimmed.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (trimmed.charAt(i) == vowels[j]) {
                    vowelsCount++;
                }
            }
        }

        consonantsCount = trimmed.length() - vowelsCount;

        return "This sentence has " + vowelsCount + " vowels and " + consonantsCount + " consonants";
    }

    public static boolean isItemInArray(String item, String[] itemArray) {
        for (String i : itemArray) {
            if (i.equalsIgnoreCase(item)) {
                return true;
            }
        }
        return false;
    }


    public static String returnStringByDivisible(int input) {
        String myString = "ANIMAL";
        String output = "";

        if (input % 32 == 0){
            output = myString;
        } else if (input % 16 == 0) {
            output = myString.substring(0,4);
        } else if (input % 8 == 0) {
            output =  myString.substring(0, 2);
        }
        return output;
    }

    public static void fizzBuzz() {
        for (int i = 1; i <= 50; i++) {
            if (i % (3*5) == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            }else System.out.println(i);
        }
    }

    public static void isArmstrong(int number) {
        String numString = Integer.toString(number);
        System.out.println(numString);
        if (numString.length() < 3) {
            System.out.println("number is smaller that  3 digits");
        }
        else  {
            List<Integer> numList =  new ArrayList<>();
            for (int i = 0; i < numString.length(); i++) {
                numList.add(Integer.parseInt(numString.substring(i, i+1)));
            }

            int total = 0;
            for (int i : numList) {
                total += Math.pow(i, 3);

            }
            System.out.println(total);
            if (total == number){
                System.out.println(number + " is an Armstrong number");
            }else System.out.println(number + " is NOT an Armstrong number");
        }
    }

    public static void isArmstrongWithStacks() {
        //Armstrong number  is a number where the same of each number cubed = the number itself
        int number = 153;
        int numberCopy = number;
        int total = 0;
        Stack<Integer> stack = new Stack<>();

        while (numberCopy > 0){
            stack.push(numberCopy % 10);
            numberCopy =  numberCopy / 10;
        }

        while (!stack.isEmpty()){
            int i = stack.pop();
            total += Math.pow(i, 3);

        }

        if (number == total) {
            System.out.println("Armstrong");
        }else System.out.println("Not Armstrong");

    }

    public static List<Integer> splittingInts(int number){
        List<Integer> intList = new ArrayList<>();

        while (number >  0){
            int lastDigit = number % 10;
            number = number / 10;
            intList.add(lastDigit);
        }
        return intList;
    }


    public static boolean validateIpWithRegex(String input) {

        String ipRegex = "(([0-9]|" +
                "[1-9][0-9]|" +
                "1[0-9][0-9]|" +
                "2[0-4][0-9]|" +
                "25[0-5])" +
                "\\.)" +
                "{3}" +
                "([0-9]|" +
                "[1-9][0-9]|" +
                "1[0-9][0-9]|" +
                "2[0-4][0-9]|" +
                "25[0-5])";

        Pattern pattern = Pattern.compile(ipRegex);
        Matcher matcher = pattern.matcher(input);

        System.out.println(matcher.matches());
        return matcher.matches();
    }

    public static boolean validateIPEasyWay(String ip) {

        String[] ipArray = ip.split("\\.");

        for (String s : ipArray) {
            if (s.length() > 3) {
                return false;
            }
            try {
                if (Integer.parseInt(s) > 255) {
                    return false;
                }
            } catch (NumberFormatException e) {
                return false;
            }
        }

        return true;
    }

    public static String findTheNumber(int n) {
        String result = "";

        List<Integer> numList = new ArrayList<>();
        numList.add(5);
        numList.add(1);
        numList.add(2);
        numList.add(3);
        numList.add(4);
        numList.add(5);
        numList.add(1);

        for (Integer i : numList) {
            if (i == n) {
                result = "YES";
                break;
            }else result  = "NO";
        }
        return result;
    }

    public static List<Integer> oddNumbers(int l, int r) {
        List<Integer> oddNumList = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            if (i % 2 != 0) {
                oddNumList.add(i);
            }
        }
        System.out.println(oddNumList);
        return oddNumList;

    }

    public static void countPairsOfSumLessThanX(int[] arr,  int n, int x) {

        int l = 0;
        int r = n-1;
        int result = 0;

        while (l < r) {

            if (arr[l] + arr[r] < x) {
                result  += (r-l);
                l++;
            }

            else r--;

        }
        System.out.println(result);
    }

    public static void mostRepeatingCharacter() {
        String s1 = "hello kitty my kitty my kitty kat";
        String s = s1.toLowerCase().trim().replaceAll(" ", "");
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character currentKey = s.charAt(i);
            if (hashMap.containsKey(currentKey)) {
                hashMap.put(currentKey, hashMap.get(currentKey) + 1);
            }else {
                hashMap.put(currentKey, 1);
            }
        }

        for (Character c : hashMap.keySet()) {
            System.out.println("Key: " + c  + " | " + "Value: " + hashMap.get(c));
        }

        int  max = 0;
        Character mostRepeated = ' ';
        for (Character key : hashMap.keySet()) {
            int currentValue = hashMap.get(key);
            if (currentValue >  max){
                max = currentValue;
                mostRepeated = key;
            }
        }

        System.out.println("Most repeated char is: \"" + mostRepeated  + "\". It is repeated "  + max  + " times");
    }


    public static String removeDuplicatesFromString() {

        //given a string, remove the dupes

        //How would you test this code
            //empty string
            //only 1 letter
            //really long string
            //lots of alpha special characters in the middle of words
            //odd spacing..multiple spacing
            //digits in the middle of  words
            //escape sequences in the string \n

        String text = "hello. hi! take care of you\n and say hello for me!, see you!";

        String regex = "[^a-zA-Z ]";

        String trimmed = text.trim().toLowerCase().replaceAll(regex, "").replaceAll("  ", " ");

        String[] words = trimmed.split(" ");

        HashMap<String, Integer> myHash = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];
            if (myHash.containsKey(currentWord)) {
                myHash.put(currentWord, myHash.get(currentWord) + 1);
            }else {
                myHash.put(currentWord, 1);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (String key : myHash.keySet()) {
            System.out.println(key + " | " + myHash.get(key));
            if (myHash.get(key) == 1) {
                sb.append(key).append(" ");
            }
        }

        return sb.toString();
    }

    public static char google() {

        //how to test?
        //make sure to adjust for

        String text = "oggoeagdro loogle";

        String normalized =  text.trim().toLowerCase().replaceAll(" ","");

        char[] textArray = normalized.toCharArray();

        HashMap<Character, Integer> myHash = new HashMap<>();

        char firstRepeating = ' ';

        for (int i = 0; i < textArray.length; i++) {
            char currentChar = textArray[i];

            if (myHash.containsKey(currentChar)) {
                myHash.put(currentChar, myHash.get(currentChar) + 1);
                firstRepeating =  currentChar;
                break;
            } else myHash.put(currentChar, 1);
        }
        return firstRepeating;
    }

    public static void findLargestIntFromList(int a, int b,  int c) {
        List<Integer> myInts = new ArrayList<>();

        myInts.add(a);
        myInts.add(b);
        myInts.add(c);

        int max = 0;

        for (int i = 0; i < myInts.size(); i++) {
            int current = myInts.get(i);

            if (current > max){
                max = current;
            }
        }
        System.out.println(max);
    }

    public static int findLargestInt(int a, int b,  int c) {
        int  max;

        if (a > b){
            max = a;
        }else {
            max = b;
        }

        if (c > max){
            max = c;
        }

        return max;
    }

    public static int findLargestIntWithMath(int a, int b,  int c) {
        int max = Math.max(Math.max(a, b), c);

        return max;
    }

    public static int max1020(int a, int b) {
        //Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
        // or return 0 if neither is in that range.

        //First make it so that the bigger value is in a
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }

        //Knowing a is bigger, just check a first..if that condition is not met, then check b
        if (a >= 10 && a <= 20) { return a; }

        if (b >= 10 && b <= 20) { return b; }

        return 0;
    }








}
