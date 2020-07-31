package linkedlist;

import com.sun.media.sound.RIFFInvalidDataException;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import sun.plugin2.ipc.windows.WindowsIPCFactory;

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
        System.out.println(in1020(test));




    }

    public static String in1020(String  str) {

        if (str.length() >=4){
            String sub = str.substring(1, 4);
            if (sub.equalsIgnoreCase("del")) {
                return str.replace("del", "");
            }
        }

        return str;
    }
}







