package adt;

public interface SortedArrayListInterface<T extends Comparable<T>>{
    //add a new entry
    public boolean add(T newEntry);

    //remove an entry
    public boolean remove(T anEntry);
    
    //Check if a certain value is contained in the list
    public boolean contain(T anEntry);
    
    //Clear the list
    public void clear();
    
    //Return the number of entries in the list
    public int getNumberOfEntries();
    
    //Check if list is empty
    public boolean isEmpty();
}
