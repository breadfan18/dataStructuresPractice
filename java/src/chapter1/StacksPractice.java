package chapter1;

import java.util.Stack;

public class StacksPractice {

    //LIFO Model

    //Its on ordered list  of  objects inserted a nd removed  following the LIFO model.  First item inserted into the
    //stack is the last item removed from the stack. Last item  inserted into the  stack is the first item to be removed.

    //use .push() insert elements on the top of a stack.

    //use .pop() method to  delete items from the top of the stack

    public static void main(String[] args) {
        Stack<String> deckOfCards = new Stack<>();
        String card1 = "Jack : Diamonds";
        String card2 = "8 : Hearts";
        String card3 = "3 : Clubs";

        deckOfCards.push(card1);
        deckOfCards.push(card2);
        deckOfCards.push(card3);

        System.out.println(deckOfCards);

        String topCard = deckOfCards.peek();
        System.out.println(topCard);

        System.out.println(deckOfCards.size());

        while (!deckOfCards.empty()) {
            String removedItem = deckOfCards.pop();
            System.out.println("Removed card: " + removedItem);
        }
        System.out.println(deckOfCards);

        System.out.println(reverseStringWithStack("swaroop"));
    }



     private static String reverseStringWithStack(String input) {
        Stack<Character> myStack = new Stack<>();

        String reverse = "";

        for (int i = 0; i < input.length(); i++) {
            myStack.push(input.charAt(i));
        }
        System.out.println(myStack);
        System.out.println(myStack.size());

        for (int i = 0; i < input.length(); i++) {
            Character myC = myStack.pop();
            reverse = reverse + myC;
        }

        return reverse;
    }

}
