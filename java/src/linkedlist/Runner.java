package linkedlist;

import com.sun.tools.doclets.formats.html.LinkInfoImpl;
import com.sun.xml.internal.fastinfoset.util.StringIntMap;
import com.sun.xml.internal.rngom.parse.host.SchemaBuilderHost;
import com.sun.xml.internal.ws.addressing.WsaTubeHelperImpl;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Runner {


    public static void main(String[] args) {

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
        String testString1 = "Lorem Ipsum!! is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";

        String testString = "Lorem Ipsum!! is simply, dummy, text lorem the but, text! are of! was.";

        String myRegex = "[^a-zA-Z ]";

        String trimmed = testString1.trim().toLowerCase().replaceAll(myRegex, "");

        String[] words = trimmed.split(" ");

        HashMap<String, Integer> myHash = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];
            if (!isCommon(currentWord) && myHash.containsKey(currentWord)) {
                myHash.put(currentWord, myHash.get(currentWord) + 1);
            }else if (!isCommon(currentWord)){myHash.put(currentWord, 1);}
        }

        for (String word : myHash.keySet()) {
            System.out.println("Word: " + word + " | Count: " + myHash.get(word));
        }

        int max  = 0;
        String maxWord = "";
        for (String wordd : myHash.keySet()) {
            if (myHash.get(wordd) > max) {
                max = myHash.get(wordd);
                maxWord = wordd;
            }
        }

        System.out.println("Maxword: "  + maxWord + " | Repeated " + max + " times");

    }

    public static boolean isCommon(String word) {
        String[] commonWords = {"the", "a", "or", "an", "it", "and", "but", "is", "are", "of", "on", "to", "was", "were", "in", "that", "i", "your", "his", "their", "her", "you", "me", "all"};

        for (String commonWord : commonWords) {
            if (word.equalsIgnoreCase(commonWord)){
                return true;
            }

        }
        return false;
    }
}







