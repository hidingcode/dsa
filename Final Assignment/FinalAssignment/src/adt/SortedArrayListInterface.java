package adt;
import entity.Inventory;
import java.util.Iterator;

public interface SortedArrayListInterface<T>{
    //add a new entry
    public boolean add(T newEntry);

    //remove an entry
    public boolean remove(int removePosition);
    
    //Check if a certain value is contained in the list
    public boolean contain(String invCode,String anEntry);
    
    //Return the number of entries in the list
    public int getNumberOfEntries();

    public boolean Searching(SortedArrayListInterface<Inventory> invList, Inventory inventory);

    public Iterator<T> getIterator();

}
