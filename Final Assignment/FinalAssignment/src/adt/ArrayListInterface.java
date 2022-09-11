package adt;

import java.util.Iterator;

public interface ArrayListInterface<T> {
    
    public boolean add(T newEntry);
    public T remove(int givenPosition);
    public void clear();
    public boolean replace(int givenPosition, T newEntry);
    public boolean contains(T anEntry);
    public T getEntry(int givenPosition);
    public int getNumberOfEntries();
    public boolean isEmpty();
    public Iterator<T> getIterator();

    public int getIndexNumber(T anEntry);
    public void getAllEntry();
}
