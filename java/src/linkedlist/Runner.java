package linkedlist;

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


        System.out.println(practice());

    }

    public static Character google() {
        //Goal is to find the first repeating character!
        String input = "google";
        int distance;
        char finalChar = 0;


        return null;
    }

    public static boolean practice() {
        String ipAddress = "0.12.123.2555";

        String[] breakdown = ipAddress.split("\\.");

        for (String s : breakdown) {
            int number = Integer.parseInt(s);
            if (s.length() > 3) {
                return false;
            }
            else if (number > 255) {
               return false;
            }
        }
        return true;
    }
}







