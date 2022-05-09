package org.way2it.data_structures.linked_list;

public class LinkedList {

    // Represents the first node of this list
    // Should be initialized when first value is added
    private Node head;

    // Represents the number of values that were added to this list
    private int length = 0;

    public LinkedList() {
    }

    // Should add new value to the end of the list and increment length
    public void add(String value) {
        // TODO implement me
        LinkedList.add("Iphone");
        length++;
    }

    // Should add new value next to specified afterValue, increment length and return true
    // If afterValue is not present in list - do nothing and return false.
    public boolean addAfter(String value, String afterValue) {
        // TODO implement me
        boolean addedSamsung = LinkedList.addAfter("Samsung","Iphone");
        if (LinkedList.contains("Iphone")){
        length++;
            return true;
        }
        
        return false;
    }

    // Should return true if value exists in this list, false - otherwise
    public boolean contains(String value) {
        // TODO implement me
        if(LinkedList.contains("Iphone")){
        return true ;
        }
        return false;
    }

    // Should remove first occurrence of the specified value from this list and decrement the length
    // If value existed and was removed - return true, false - otherwise
    public boolean remove(String value) {
        // TODO implement me
        boolean removeSamsung = LinkedList.remove("Samsung");
        if(LinkedList.contains("Samsung")){
        return false;
        }
        return true;
    }

    public int getLength() {
        return length;
    }

    private static class Node {
        String value;
        Node next;
    }
}
