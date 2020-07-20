package linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedListThis list = new LinkedListThis();

        list.insertAtHead(5);
        list.insertAtHead(10);
        list.insertAtHead(2);
        list.insertAtHead(12);
        list.insertAtHead(19);
        list.insertAtHead(20);


        list.deleteHead();



        System.out.println(list);
        System.out.println(list.length());

        System.out.println("Found: " + list.find(19));

        LinkedList<String> states = new LinkedList();
        states.add("Alaska");
        states.add("Arizona");
        states.add("Arkansas");
        states.add("Pennsylvania");
        states.add("California");
        states.add("Colorado");
        states.add("Connecticut");


        states.addFirst("Alabama");
        System.out.println(states);

        System.out.println("Last State: " + states.getLast());

        ListIterator iterator = states.listIterator(states.size());
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }

    }
}
