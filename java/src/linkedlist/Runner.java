package linkedlist;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Runner {

    public static void main(String[] args) {
        System.out.println(validateIpWithRegex("123.235.153.255"));


    }

    public static boolean validateIpWithRegex(String ip) {

        String ipRegex = "(([0-9]|" +
                "[1-9][0-9]|" +
                "1[0-9][0-9]|" +
                "2[0-4][0-9]|" +
                "25[0-5])" +
                "\\.)" +
                "{3}" +
                "([0-9]|" +
                "[1-9][0-9]|" +
                "1[0-9][0-9]|" +
                "2[0-4][0-9]|" +
                "25[0-5])";

        Pattern pattern = Pattern.compile(ipRegex);
        Matcher matcher = pattern.matcher(ip);

        return matcher.matches();






//        String[] ipArray = ip.split("\\.");
//
//
//        for (String s : ipArray) {
//            if (s.length() > 3) {
//                return false;
//            }
//            try {
//                if (Integer.parseInt(s) > 255) {
//                    return false;
//                }
//            } catch (NumberFormatException e) {
//                return false;
//            }
//        }
//
//        return true;
    }
}
