package chapter1;

import java.util.HashMap;
import java.util.Set;

public class HashMapPractice {

    //uses key  value  pairs and hashing function to store  and organnize data

    //A hashing function maps a key or object to a specific hash

    //This hash determines where  the value is stored

    //hash collision - whhen same key maps to different values

    public static void main(String[] args) {
        HashMap<String, Integer> wordToNum = new HashMap<>();

        wordToNum.put("ONE", 1);
        wordToNum.put("TWO", 2);
        wordToNum.put("THREE", 3);
        wordToNum.put("FOUR", 4);
        wordToNum.put("FIVE", 5);

        Set<String> et = wordToNum.keySet();

        for (String s : et) {
            System.out.println(wordToNum.get(s));
        }

        System.out.println(wordToNum.values());
        System.out.println(wordToNum.keySet());

        System.out.println(wordToNum.remove("FOUR"));

        System.out.println(wordToNum.keySet());
        System.out.println(wordToNum.values());

        whichCharacterMostRepeated();

    }

    public static void whichCharacterMostRepeated() {
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



}
