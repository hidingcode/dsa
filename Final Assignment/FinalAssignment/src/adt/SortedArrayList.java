package adt;
import java.util.Iterator;

import entity.Inventory;

public class SortedArrayList<T extends Comparable<T>> implements SortedArrayListInterface<T>{

    private T[] array;
    private int numberOfEntries;
    private static final int DEFAULT_CAPACITY = 25;

    public SortedArrayList(){
        this(DEFAULT_CAPACITY);
    }

    public SortedArrayList(int initialCapacity){
        numberOfEntries = 0;
        array = (T[]) new Comparable[initialCapacity];
    }

    //add a new entry
    public boolean add(T newEntry){
        int i = 0;
        if (newEntry != ""){
            array[i] = newEntry;
            i++;
            numberOfEntries++;
        }
        System.out.println("Add triggered");
        return true;
    }


    public String toString() {
        String output = "";
        output += array[0];
        
        System.out.println("Tostring triggered");

        return output;
    }

    //remove an entry
    public boolean remove(T anEntry){
        return true;
    }
    
    //Check if a certain value is contained in the list
    public boolean contain(T anEntry){
        return true;
    }
    
    //Clear the list
    public void clear(){
        
    }
    
    //Return the number of entries in the list
    public int getNumberOfEntries(){
        return 1;
    }
    
    //Check if list is empty
    public boolean isEmpty(){
       return true;
    }

    public Iterator<T> getIterator(){
        return new ListIterator();
    }
    
    private class ListIterator implements Iterator<T>{
        int nextIndex;
        public boolean hasNext(){
            return nextIndex < numberOfEntries;
        }
        public T next(){
            T list = null;
            if(hasNext()){
                list = array[nextIndex];
                nextIndex++;
            }
            
            return list;
        }
        
    }

    
}
