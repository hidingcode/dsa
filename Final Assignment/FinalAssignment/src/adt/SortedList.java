package adt;
import java.util.Iterator;

public class SortedList<T extends Comparable<T>> implements SortedListInterface<T>{

    private T[] array;
    private int numberOfEntries;
    private static int DEFAULT_CAPACITY = 10;

    public SortedList(){
        this(DEFAULT_CAPACITY);
    }

    public SortedList(int initialCapacity){
        numberOfEntries = 0;
        
        array = (T[]) new Comparable[initialCapacity];
    }

    // Expand the capacity of the list.
    public void expandCapacity(){
        T[] oldList = array;
        int oldSize = oldList.length;
        array = (T[]) new Comparable[oldSize*2];

        for(int i = 0 ; i < oldList.length ; i++){
            array[i] = oldList[i];
        }

    }

    //Check the capacity of the list is full
    public boolean isFull(){
        if (numberOfEntries >= array.length){
            return true;
        }
        
        return false;
    }

    //add a new entry and sorting the values into the array
    public boolean add(T newEntry){
        int i = 0;
        if(isFull()){
            expandCapacity();
        }
        while (i < numberOfEntries && newEntry.compareTo(array[i]) > 0){
            i++;
        }
        moveForward(i + 1);
        array[i] = newEntry;
        numberOfEntries++;
        return true;

    }

    //any new entry coming in, this function will move the existed values in the List forward, to let new entry to insert into the List
    private void moveForward(int insertPosition) {
        int newIndex = insertPosition - 1;
        int lastIndex = numberOfEntries - 1;    

        for (int index = lastIndex; index >= newIndex; index--) {   
          array[index + 1] = array[index];
        }

    }

    //remove an entry
    public boolean remove(int removePosition){
        if(numberOfEntries == 0){
            return false;
        }else{
            moveBackward(removePosition);
            numberOfEntries--;
            return true;
        }
    }
    
    //any entry being removed, this function will move the existed values in the list backward
    private void moveBackward(int removePosition){
        int removedIndex = removePosition;
        int lastIndex = numberOfEntries - 1;
        for (int index = removedIndex; index < lastIndex; index++){
            array[index] = array[index+1];
        }
    }

    
    //Check if a certain values is in the list
    public boolean contain(String object, String currentObject){
        if (object.equals(currentObject)){
            return true;
        }
        return false;
    }
    
    //Return the number of entries of the list
    public int getNumberOfEntries(){
        return numberOfEntries;
    }

    //Clear the array
    public void clear(){
        numberOfEntries = 0;
    }

    //Check the list is empty or not
    public boolean isEmpty(){
        return numberOfEntries == 0;
    }

    //Searching the object in the list, if existed will return the object, otherwise will return null
    public <T> T Searching(T List, T currentObj){
        //Create an Iterator object to create ListIterator object
        Iterator<?> objIterator = ((SortedListInterface<T>) List).getIterator();

        while(objIterator.hasNext()){
            T obj = (T) objIterator.next();
            
            //If the currentObj is in the list
            if(obj.equals(currentObj)){
                //return the object
                return (T)obj;
            }

        }

        return null;
    }

    //A method to create a ListIterator object
    public <T> Iterator<T> getIterator(){
        return new ListIterator<>();
    }
    
    //A class to get the object from the list.
    private class ListIterator<T> implements Iterator<T>{
        int nextIndex = 0;

        public ListIterator(){
            
        }

        public boolean hasNext(){
            return nextIndex < numberOfEntries;
        }

        public T next(){
            T list = null;
            if(hasNext()){
                list = (T) array[nextIndex];
                nextIndex++;
            }
            return list;
        } 

    }
    
}
