package linkedlist;

import com.sun.xml.internal.fastinfoset.util.StringIntMap;
import com.sun.xml.internal.ws.addressing.WsaTubeHelperImpl;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Runner {


    public static void main(String[] args) {

//        String s = "str";
//        Character c = s.charAt(s.length()-1);
//        String newString = c + s + c;
//        System.out.println(newString);

        String test = "del";

        System.out.println(SimpleProblems.vowelsOrConsonants("I aM a HaPpy mOuse"));


        practice();

    }

    public static Character google() {
        //Goal is to find the first repeating character!
        String input = "google";
        int distance;
        char finalChar = 0;


        return null;
    }

    public static void practice() {
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};

        String input = "   I aM a HaPpy mOuse  ";

        String trimmed = input.trim().replaceAll(" ", "").toLowerCase();

        int numberOfVowels = 0;
        int numberOfConsonants = 0;

        for (int i = 0; i < trimmed.length(); i++) {
            char currentChar = trimmed.charAt(i);

            for (int j = 0; j < vowels.length; j++) {
                if(currentChar == vowels[j]){
                    numberOfVowels++;
                }
            }
        }

        numberOfConsonants = trimmed.length()-numberOfVowels;

        System.out.println(numberOfVowels);
        System.out.println(numberOfConsonants);
    }
}







