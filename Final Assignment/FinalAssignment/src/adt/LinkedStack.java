// Lim Yong Chien
package adt;

import java.util.Iterator;

public class LinkedStack<T> implements StackInterface<T> {
    private Node topNode;

    public LinkedStack()
    {
        this.topNode = null;
    }
    
    // Adds a new entry to the top of the stack.
    @Override
    public boolean push(T newEntry) {
         // Create new node temp
        Node tempNode = new Node();
        tempNode.data = newEntry;
        tempNode.next = topNode;
        topNode = tempNode;
        return true;
    }
    // Removes and returns the stack's top entry.
    @Override
    public boolean pop() {
        // Update the top pointer to point to the next node
       if(!isEmpty())
       {
            topNode = topNode.next;
            return true;
       } 
       return false;
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

    // Chech if the entry match the 
    public boolean match(T anEntry){
        if(topNode.data == anEntry){
            return true;
        }
        else{
            return false;
        }
    }

    public Iterator<T> getIterator(){
        return new StackIterator();
      }
    
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

    private class Node{
        // Data
        T data;
        // reference variable Node type
        Node next;
    }
    
    
}
