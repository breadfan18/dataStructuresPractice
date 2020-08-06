package linkedlist;

import com.sun.media.sound.RIFFInvalidDataException;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import sun.plugin2.ipc.windows.WindowsIPCFactory;

import javax.print.attribute.standard.Finishings;
import java.util.ArrayList;
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

        palindrome("poopoop");

    }

    public static Character google() {
        //Goal is to find the first repeating character!
        String input = "google";
        int distance;
        char finalChar = 0;


        return null;
    }

    public static void palindrome(String input) {
        String reversed = "";

        for (int i = input.length()-1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        if (input.equalsIgnoreCase(reversed)) {
            System.out.println("Palindrome");
        }else System.out.println("Not Palindrome");

    }
}







