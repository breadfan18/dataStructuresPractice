package linkedlist;

import com.sun.tools.doclets.formats.html.LinkInfoImpl;
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

        String text = "The giant panda has an insatiable appetite " +
                "for bamboo. A typical animal eats half the day—a " +
                "full 12 out of every 24 hours—and relieves itself " +
                "dozens of times a day. It takes 28 pounds of " +
                "bamboo to satisfy a giant panda's daily dietary " +
                "needs. Pandas will sometimes eat birds or rodents" +
                " as well.";

        //How many sentences
        String[] sentences = text.split("\\.");
        System.out.println(sentences.length);

        for (String sentence : sentences) {
            System.out.println(sentence);
        }

        //How many wordsw
        String[] words = text.replaceAll("\\.", "").split(" ");
        System.out.println(words.length);





    }

    public static Character google() {
        //Goal is to find the first repeating character!
        String input = "google";
        int distance;
        char finalChar = 0;


        return null;
    }

    public static void practice() {



    }
}







