package linkedlist;

import linkedlist.myEmployees.Deepika;
import linkedlist.myEmployees.Gio;
import linkedlist.myEmployees.Kranthi;
import linkedlist.myEmployees.Latika;

import java.lang.reflect.Array;
import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleProblems {

    public static void reverseStringWithStringBuilderLoop(){
        String name = "swarooop";

        StringBuilder sb = new StringBuilder();

        for (int i = name.length()-1; i >= 0; i--) {
            sb.append(name.charAt(i));
        }

        String  newName  = sb.toString();
        System.out.println(newName);
    }

    public static void reverseWithStringBuilderMethod(){
        String name = "swarooop";

        StringBuilder sb = new StringBuilder(name);
        String newName  = sb.reverse().toString();
        System.out.println(newName);
    }


    public static void reverseString(){
        String name = "Manchester United is the Best";
        String reversed = "";

        for (int i = name.length()-1; i >= 0; i--) {
            reversed = reversed + name.charAt(i);
        }


        System.out.println(reversed);
    }

    public static void palindrome(String input) {
        //first reverse the String
        String reversed = "";
        for (int i = input.length()-1; i >= 0 ; i--) {
            reversed = reversed + input.charAt(i);
        }
        if (input.equalsIgnoreCase(reversed)) System.out.println("It's a palindrome");
        else System.out.println("Its not a palindrome");

    }


    public static void selectionSort(int n) {

        //Time Complexity - Big  O of O(n^2)
        //Pretty complex,  so useful only for small data sets
        int[] array = {9, 2, 8, 69, 7, 1};

        int minValueIndex;
        for (int i = 0; i <= n-1; i++) {
            minValueIndex = i;

            for (int j = i+1; j < n; j++) {
                if (array[j] < array[minValueIndex]) {
                    minValueIndex = j;
                }
            }
            int temp = array[minValueIndex];
            array[minValueIndex] = array[i];
            array[i] = temp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


    public static int[] insertionSort(int[] list) {

        int j, element, temp;

        for (int i = 1; i < list.length; i++) {
            element = list[i];
            j = i-1;

            while (j >=0 && element < list[j]) {
                temp = list[j];
                list[j] = list[j+1];
                list[j+1] = temp;
                j--;
            }
        }

        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }

        return list;
    }


    public static void addObjectsIntoArrayList() {
        List<Object[]> mylist = new ArrayList<>();

        mylist.add(new Object[]{1, "String", "Test", 2.2, 3});
        mylist.add(new Object[]{1, "Integer", "Test", 2.2, 3});
        mylist.add(new Object[]{1, "Long", "Test", 2.2, 3});
        mylist.add(new Object[]{1, "Double", "Test", 2.2, 3});

        Object[] myObj = mylist.get(3);
        System.out.println(myObj[1]);
    }

    public static void exampleForInheritance() {
        List<Employees> myEmps = new ArrayList<>();

        myEmps.add(new Gio());
        myEmps.add(new Deepika());
        myEmps.add(new Kranthi());
        myEmps.add(new Latika());

        Employees myCurrentEmp = myEmps.get(2);

        for (Employees employee: myEmps) {
            System.out.println(employee.getName() + " | " + employee.getAge() + " | " + employee.getPosition() + " | " + employee.getSalary());
        }
    }

    public static void exceptionsOutOfString(){
        String input = "org.hibernate.exception.SQLException: error executing work org.hibernate.exception.SQLGrammarException: error \n" +
                "executing work &nbsp;&nbsp;&nbsp;&nbsp;at  ~[hibernate-core-5.0.12.Final.jar:5.0.12.Final] &nbsp;&nbsp;&nbsp;&nbsp;\n" +
                "\\norg.hibernate.exception.SQLGrammarException: error executing work &nbsp;&nbsp;&nbsp;&nbsp;at  ~[hibernate-core-5.0.12.Final.jar:5.0.12.Final] \n" +
                "&nbsp;&nbsp;&nbsp;&nbsp; Caused by: java.sql.SQLSyntaxErrorException: malformed string: 'Acme''&nbsp;&nbsp;&nbsp;&nbsp;at";

        String regex = "[a-zA-Z]*Exception";

        Matcher m = Pattern.compile(regex).matcher(input);






//        String regex = "\\w+Exception";
//        Matcher m = Pattern.compile(regex).matcher(input);
//
//        while (m.find()) {
//            System.out.println(m.group());
//        }







    }

    public boolean validateIP(String ip) {




        return true;
    }


}
