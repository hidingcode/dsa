// Lim Yong Chien
package adt;

import java.util.Iterator;

public class Stack<T> implements StackInterface<T> {
    private Node topNode;
    private int numberOfEntries = 0;

    public Stack(){
        this.topNode = null;
    }
    // Adds a new entry to the top of the stack.
    @Override
    public boolean push(T newEntry){
        // Check if the top node match the entry
        if(!isMatch(newEntry)){
            System.out.println("Duplicate input detected");
            return false;
        }
        else{
            // Create new temp node
            Node tempNode = new Node();
            tempNode.data = newEntry;
            tempNode.next = topNode;
            topNode = tempNode;
            numberOfEntries++;
        return true;
        } 
    }
    // Removes and returns the stack's top entry.
    @Override
    public boolean pop() {
       if(!isEmpty())
       {    // Move the top pointer to point to the next node
            topNode = topNode.next;
            // Decrease the number of entries by 1
            numberOfEntries--;
            return true;
       }       
       else{
            System.out.println("Stack is empty");    
            return false;
       }

    }
    // Retrieves the stack's top entry.
    @Override
    public T peek(){
        if(!isEmpty()){
            return topNode.data;
        }
        else{
            System.out.println("Stack is empty");
            return null;
        }
    }
    // Detects whether the stack is empty.
    @Override
    public boolean isEmpty() {
        return topNode == null;
    }
    // Removes all entries from the stack
    @Override
    public void clear() {
        topNode = null;
    }

    // Search the position in the stack and return the data
    public T searchFromPosition(int position) {
        int index = 0;
        Node currentNode = topNode;
        while (currentNode != null){
            if (index == position) {
                return currentNode.data;
            }
            currentNode = currentNode.next;
            index++;
        }
        // Search failed
        System.out.println("Search not found");
        return null;
    }

    // Get the Number Of Entries
    public int getNumberOfEntries() {
        if(isEmpty()){
            return 0;
        }

        else{
            return numberOfEntries;
        }    
    }

    // Chech if the entry match the topNode 
    public boolean isMatch(T anEntry){
        if(topNode.data == anEntry){
            return true;
        }
        else{
            return false;
        }
    }

    // Get Iterator
    public Iterator<T> getIterator(){
        return new StackIterator();
    }
    
    // Iterator is used to loop through the stack 
    private class StackIterator implements Iterator<T>{
        private Node currentNode = topNode;
        public boolean hasNext(){
        return currentNode != null;
        }
        public T next(){
        T currentData = null;
        if(hasNext()){
            currentData = currentNode.data;
            currentNode = currentNode.next;
        }
        return currentData;
        }
    }
    
    // Node 
    private class Node{
        // Data
        T data;
        // reference variable Node type
        Node next;
    }
}
