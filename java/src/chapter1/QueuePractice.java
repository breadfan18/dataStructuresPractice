package chapter1;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePractice {

    //An ordered list of objects where elements are inserted at the end of the queue, and removed
    //from the beginning of the queue

    //FIFO model - First in first out

    //Queue is an interface - LinkedList implements Queue!

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("Sam");
        queue.add("Anna");
        queue.add("Heidi");
        queue.add("Susan");
        queue.add("Charlotte");

        System.out.println(queue);

        String nextInQueue = queue.peek();
        System.out.println("Next up: " + nextInQueue);

        String recentlyRemoved = queue.remove();
        System.out.println(recentlyRemoved);

        System.out.println(queue);
    }
}
