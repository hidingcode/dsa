package adt;
import entity.Inventory;
import java.util.Iterator;

public interface SortedListInterface<T>{
    
    public boolean add(T newEntry);
    public boolean remove(int removePosition);
    public boolean contain(String obj,String currentObj);
    public int getNumberOfEntries();
    public <T> T Searching(T List, T currentObj);
    public <T> Iterator<T> getIterator();
    public void clear();
    public boolean isEmpty();
    public boolean isFull();

}
