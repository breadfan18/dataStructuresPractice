package dataStructures;

import java.util.LinkedList;

public class LinkedListPractice {

    public static void main(String[] args) {

        LinkedList<String> students = new LinkedList<>();

        students.add("Charlie");
        students.add("Sally");
        students.add("Morgan");
        students.add("Taylor");
        students.add("Jamie");

        students.addFirst("Sarah");
        students.addLast("Hailey");
        students.add(2, "Tara");

        System.out.println("First student: " + students.getFirst());
        System.out.println("Last student: " + students.getLast());
        System.out.println(students.size());
        System.out.println(students);

        System.out.println("Second student: " + students.get(1));

        System.out.println("Index of Jamie: " + students.indexOf("Jamie"));

        students.removeFirst();
        students.removeLast();
        System.out.println(students);

        students.remove("Jamie");
        System.out.println(students);
        students.remove(2);
        System.out.println(students);

        boolean hasTaylor = students.contains("Taylor");
        System.out.println(hasTaylor);

        students.clear();
        System.out.println(students);
    }

}
