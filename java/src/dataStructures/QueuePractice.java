package dataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePractice {

    //An ordered list of objects where elements are inserted at the end of the queue, and removed
    //from the beginning of the queue - THIS TAKES VERY LITTLE TIME (small time complexity)

    //FIFO model - First in first out

    //Queue is an interface - LinkedList implements Queue!

    //Use the .peek() method to look at the next in queue without removing it. .remove() to remove the first element
    //so if you use queue.remove(), then it will remove the first item that was inserted in the queue

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
