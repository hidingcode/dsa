package adt;
import java.util.Iterator;

import entity.Inventory;

public class SortedArrayList<T extends Comparable<T>> implements SortedArrayListInterface<T>{

    private T[] array;
    private int numberOfEntries;
    private static final int DEFAULT_CAPACITY = 100;

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
        while (i < numberOfEntries && newEntry.compareTo(array[i]) > 0){
            i++;
        }
        moveForward(i + 1);
        array[i] = newEntry;
        numberOfEntries++;
        return true;
    }

    private void moveForward(int insertPosition) {
        int newIndex = insertPosition - 1;
        int lastIndex = numberOfEntries - 1;    

        for (int index = lastIndex; index >= newIndex; index--) {   
          array[index + 1] = array[index];
        }

    }

    //remove an entry
    public boolean remove(T anEntry){
        if(numberOfEntries == 0){
            return false;
        }else{
            int index = 0;
            while(index < numberOfEntries && array[index].compareTo(anEntry) < 0){
                index++;
            }
            
            if(array[index].equals(anEntry)){
                System.out.println("Found same");
                moveBackward(index + 1);
                numberOfEntries--;
                return true;
            }
        }
        return false;
    }
    

    private void moveBackward(int removePosition){
        int removedIndex = removePosition - 1;
        int lastIndex = numberOfEntries - 1;

        for (int index = removedIndex; index < lastIndex; index++){
            array[index] = array[index + 1];
        }
    }

    
    //Check if a certain value is contained in the list
    public boolean contain(String invCode, Inventory inventory){
        System.out.println("Contain invCode: "+ invCode);
        System.out.println("Contain inventory Invcode: "+ inventory.getInvCode());
        if (invCode.equals(inventory.getInvCode())){
            System.out.println("Contained");
        }
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
        int nextIndex = 0;

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
