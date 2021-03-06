package challenges;

import challenges.model.LinkedListNode;

public class NumberSix {

    /**
     * Create a String representation of the contents of the list that starts at head.
     * The list will only ever contain numbers, as the data inside each node is an integer.
     * You can assume that the value for head will never be null.
     *
     * Here is a video to learn more about Linked Lists.
     * https://www.youtube.com/watch?v=njTh_OwMljA
     *
     * Example:
     * List: 3 -> 2 -> 10 -> 5
     * Then head would contain 3 as it's data and another node that would contain 2.
     * printLinkedList returns "3 2 10 5"
     *
     * Example:
     * List: 6 -> 27 -> 45 -> 75
     * Then head would contain 6 as it's data and another node that would contain 27.
     * printLinkedList returns "6 27 45 75"
     *
     * @param head the first element in the list
     * @return the data contents of the list printed in a String with each number separated by a space
     */
    public String printLinkedList(LinkedListNode head) {
        String result = "";
        LinkedListNode current = head;

        while(current != null){
            result += current.getData();

            if(current.getNext() != null){
                result += " ";
            }
            current = current.getNext();
        }
        return result;
    }
}
