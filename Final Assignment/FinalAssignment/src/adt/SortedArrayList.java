package adt;

public class SortedArrayList<T extends Comparable<T>> implements SortedArrayListInterface<T>{
    //add a new entry
    public boolean add(T newEntry){
        return true;
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
}
