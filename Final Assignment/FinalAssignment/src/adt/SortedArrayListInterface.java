package adt;
import entity.Inventory;
import java.util.Iterator;

public interface SortedArrayListInterface<T>{
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

    public Iterator<T> getIterator();
}
