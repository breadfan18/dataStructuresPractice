package linkedlist;

import oracle.jvm.hotspot.jfr.JFROptions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Challenge {

    public static void main(String[] args) {
//        List<String> groceries = new ArrayList();
//
//        groceries.add("Pumpkin");
//        groceries.add("Cilantro");
//        groceries.add("Beer");
//        groceries.add("Cigarettes");
//
//        List<String> moreGroceries = new ArrayList();
//        moreGroceries.add("Banana");
//        moreGroceries.add("Apples");
//
//
//
//        groceries.addAll(moreGroceries);
//
//        Collections.sort(groceries);
//
//        System.out.println(groceries);
//
//        String searchItem = "Beer";
//
//        if (groceries.contains(searchItem)) {
//            groceries.remove(searchItem);
//        }
//
//        System.out.println(groceries);

        Stack myStack = new Stack();
        myStack.push("First");
        myStack.push("Second");
        myStack.push("Third");
        myStack.push("Fourth");
        myStack.push("Fifth");

        System.out.println(myStack.pop());


    }





}
