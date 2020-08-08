package linkedlist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Runner {


    public static void main(String[] args) {

//        String s = "str";
//        Character c = s.charAt(s.length()-1);
//        String newString = c + s + c;
//        System.out.println(newString);

        String test = "del";


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
        String input = "org.hibernate.exception.SQLException: error executing work org.hibernate.exception.SQLGrammarException: error \n" +
                "executing work &nbsp;&nbsp;&nbsp;&nbsp;at  ~[hibernate-core-5.0.12.Final.jar:5.0.12.Final] &nbsp;&nbsp;&nbsp;&nbsp;\n" +
                "\\norg.hibernate.exception.SQLGrammarException: error executing work &nbsp;&nbsp;&nbsp;&nbsp;at  ~[hibernate-core-5.0.12.Final.jar:5.0.12.Final] \n" +
                "&nbsp;&nbsp;&nbsp;&nbsp; Caused by: java.sql.SQLSyntaxErrorException: malformed string: 'Acme''&nbsp;&nbsp;&nbsp;&nbsp;at.... SQLException /...SQLException...NullPointerException";

        String myRegex = "[a-zA-Z]*Exception";

        Pattern p = Pattern.compile(myRegex);
        Matcher m = p.matcher(input);

        List<String> exceptions = new ArrayList<>();

        while (m.find()) {
            exceptions.add(m.group());
        }

        System.out.println(exceptions);

        HashMap<String, Integer> myHash = new HashMap<>();

        for (int i = 0; i < exceptions.size(); i++) {
            String currentKey = exceptions.get(i);
            int counter = 1;
            for (int j = i+1; j < exceptions.size(); j++) {
                if (currentKey.equalsIgnoreCase(exceptions.get(j))) {
                    myHash.put(currentKey, counter);
                    counter++;
                }
            }
        }

        for (String s : myHash.keySet()) {
            System.out.println(s + ": " + myHash.get(s));
        }

    }
}







