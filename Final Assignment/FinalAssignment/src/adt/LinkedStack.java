package adt;

public class LinkedStack<T> implements StackInterface<T> {
    Node top;
    
    public LinkedStack()
    {
        this.top = null;
    }
    
    // Adds a new entry to the top of the stack.
    @Override
    public void push(T newEntry) {
         // Create new node temp
        Node temp = new Node();
        temp.data = newEntry;
        temp.link = top;
        top = temp;
    }
    // Removes and returns the stack's top entry.
    @Override
    public T pop() {
        // Update the top pointer to point to the next node
       top = (top).link;
    }
    // Retrieves the stack's top entry.
    @Override
    public T peek() {
        if(!isEmpty()){
            return top.data;
        }
        else{
            throw new Exception("Stack is empty");
        }
    }
    // Detects whether the stack is empty.
    @Override
    public boolean isEmpty() {
        return top == null;
    }
    // Removes all entries from the stack
    @Override
    public void clear() {
        
    }

    private class Node{
        // Integer Data
        int data;
        // reference variable Node type
        Node link;
    }
    
}
