package linkedlist;

import com.sun.tools.doclets.formats.html.LinkInfoImpl;
import com.sun.tools.javac.util.ArrayUtils;
import com.sun.xml.internal.bind.v2.model.core.EnumLeafInfo;
import com.sun.xml.internal.bind.v2.model.core.MaybeElement;
import com.sun.xml.internal.fastinfoset.util.StringIntMap;
import com.sun.xml.internal.rngom.parse.host.SchemaBuilderHost;
import com.sun.xml.internal.ws.addressing.WsaTubeHelperImpl;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Runner {


    public static void main(String[] args) {


//        System.out.println(practice("Hello"));

String test = "Swaroop";



        System.out.println(practice(new String[]{"sam", "guitar",  "football", "swaroop"}));
//        swap();

    }

    public static Character google() {
        //Goal is to find the first repeating character!
        String input = "google";
        int distance;
        char finalChar = 0;


        return null;
    }

    public static String[] practice(String[] strings) {
        Map<String, Integer> map = new HashMap();
        String firstChar = "";
        //First, create a hashMap that stores the firstChar as key, and index position as value
        //index position will be equal to i in the loop;
        for (int i = 0; i < strings.length; i++) {
            String current = strings[i];
            firstChar = current.substring(0, 1);
            if (!map.containsKey(firstChar)) {
                map.put(firstChar, i);
            } else if (map.containsKey(firstChar)) {
                String temp = current;
                current = strings[map.get(firstChar)];
                strings[map.get(firstChar)] = temp;
                map.put(firstChar, strings.length);
            }
        }



        System.out.println(Arrays.toString(strings));
        return strings;
    }


    public static void swap() {

        String a = "Swaroop";
        String b = "Anshu";

        System.out.println("Before Swap");
        System.out.println("-----------------");
        System.out.println("a:  " + a);
        System.out.println("b:  " + b);

        String temp = b;
        b  = a;
        a = temp;

        System.out.println();
        System.out.println("After Swap");
        System.out.println("-----------------");
        System.out.println("a:  " + a);
        System.out.println("b:  " + b);
    }




}











