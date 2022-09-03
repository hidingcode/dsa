package adt;

public class LinkedStack<T> implements StackInterface<T> {
    Node topNode;
    
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
        tempNode.reference = topNode;
        topNode = tempNode;
        return true;
    }
    // Removes and returns the stack's top entry.
    @Override
    public boolean pop() {
        // Update the top pointer to point to the next node
       if(!isEmpty())
       {
            topNode = topNode.reference;
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

    private class Node{
        // Data
        T data;
        // reference variable Node type
        Node reference;
    }
    
}
