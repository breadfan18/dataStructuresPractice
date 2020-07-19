package linkedlist;

import oracle.jvm.hotspot.jfr.JFROptions;

import java.util.ArrayList;
import java.util.List;

public class Challenge {

    public static void main(String[] args) {
        List<String> groceries = new ArrayList();

        groceries.add("Pumpkin");
        groceries.add("Cilantro");
        groceries.add("Beer");
        groceries.add("Cigarettes");

        List<String> moreGroceries = new ArrayList();
        moreGroceries.add("Banana");
        moreGroceries.add("Apples");

        groceries.addAll(moreGroceries);

        System.out.println(groceries);

        String searchItem = "Beer";

        if (groceries.contains(searchItem)) {
            groceries.remove(searchItem);
        }

        System.out.println(groceries);




    }





}
