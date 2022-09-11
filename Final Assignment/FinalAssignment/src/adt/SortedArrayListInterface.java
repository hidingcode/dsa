package adt;
import entity.Inventory;
import java.util.Iterator;

public interface SortedArrayListInterface<T>{
    
    public boolean add(T newEntry);
    public boolean remove(int removePosition);
    public boolean contain(String invCode,String anEntry);
    public int getNumberOfEntries();
    public boolean Searching(SortedArrayListInterface<Inventory> invList, Inventory inventory);
    public Iterator<T> getIterator();
    public void clear();
    public boolean isEmpty();

}
