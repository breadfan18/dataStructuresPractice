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

        practice();

    }



    public static void practice() {
        String a = "test";
        String b = "class";

        System.out.println(b.substring(1, b.length()-1));

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











