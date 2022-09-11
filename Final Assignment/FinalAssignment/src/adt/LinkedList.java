// package adt;

<<<<<<< HEAD
import org.w3c.dom.Node;

public class LinkedList<T> implements LinkedListInterface<T>{
    private Node firstNode;
    private int numberOfEntries;

    public LinkedList()
    {
        clear();
    }

    public T contains(int Position)
    {
        T result = null;
        if ((Position >= 1) && (Position <= numberOfEntries + 1))
        {
            
            
            if (Position == 1)
            {
                //testing
                result = firstNode.data;
            }
            else 
            {
                Node nodeBefore = firstNode;
                for (int i = 1; i < Position ; ++i)
                {
                    nodeBefore = nodeBefore.next;
                }
                result = nodeBefore.data;
            
            }

            
        }
        else
        {
            result = null;
        }
        return result;
    }

    @Override
    public final void clear()
    {
        firstNode = null;
        numberOfEntries = 0;
    }

    public boolean isEmpty()
    {
        boolean result = false;

        if (firstNode == null)
        {
            result = true;
        }

        return result;
    }

    @Override
    public boolean add(T newEntry)
    {
        Node newNode = new Node(newEntry);

        if (isEmpty()){
            firstNode = newNode;

        }else 
        {
            Node currentNode = firstNode;
            while (currentNode.next != null)
            {
                currentNode = currentNode.next;
            }

            currentNode.next = newNode;
        }

        numberOfEntries++;
        return true;
    }

    @Override 
    public boolean add(int newPosition, T newEntry)
    {
        boolean isSuccessful = true;

        if ((newPosition >= 1) && (newPosition <= numberOfEntries + 1))
        {
            Node newNode = new Node(newEntry);

            if (isEmpty() || (newPosition == 1))
            {
                newNode.next = firstNode;
                firstNode = newNode;
            }
            else 
            {
                Node nodeBefore = firstNode;
                for (int i = 1; i < newPosition - 1; ++i)
                {
                    nodeBefore = nodeBefore.next;
                }
    
                newNode.next = nodeBefore.next;
                nodeBefore.next = newNode;
            }

            numberOfEntries++;
        }
        else
        {
            isSuccessful = false;
        }

        return isSuccessful;
        
    }

    @Override
    public T remove(int givenPosition)
    {
        T result = null;

        if((givenPosition >= 1) && (givenPosition <= numberOfEntries))
        {
            if (givenPosition == 1)
            {
                result = firstNode.data;
                firstNode = firstNode.next;
            }
            else{
                Node nodeBefore = firstNode;
                for (int i = 1; i < givenPosition - 1; ++i){
                    nodeBefore = nodeBefore.next;
                }
                result = nodeBefore.next.data;
                nodeBefore.next = nodeBefore.next.next;
            }
            
            numberOfEntries--;
        }

        return result;
    }

    @Override 
    public boolean replace (int givenPosition, T newEntry){
        boolean isSuccessful = true;

        if((givenPosition >= 1) && (givenPosition <= numberOfEntries))
        {
            Node currentNode = firstNode;
            for(int i = 0; i < givenPosition -1; ++i){
                currentNode = currentNode.next;
            }
            currentNode.data = newEntry;
        }
        else
        {
            isSuccessful = false;
        }

        return isSuccessful;
    }

    public int getNumberOfEntries()
    {
        int entries = 0;
        Node currentNode = firstNode;
        while (currentNode.next != null)
        {
            currentNode = currentNode.next;
            entries++;
        }
        return entries;
    }

    private class Node {
        private T data;
        private Node next;

        private Node (T data){
            this.data = data;
            this.next = null;
        }

        private Node(T data, Node next)
        {
            this.data = data;
            this.next = next;
        }
    }
}
=======
// public class LinkedList<T> implements LinkedListInterface<T>{
    
// }
>>>>>>> 600bfda5a72c416abaa8904a81283cac6e3c0292
