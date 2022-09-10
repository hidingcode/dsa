package adt;

public interface ArrayListInterface<T> {
    
    public boolean add(T newEntry);
    public T remove(int givenPosition);
    public void clear();
    public boolean replace(int givenPosition, T newEntry);
    public T getEntry(int givenPosition);
    public boolean contains(T anEntry);
    public int getNumberOfEntries();
    public boolean isEmpty();
    public boolean isFull();
    
    public boolean getAllEntry();
    public boolean edit();
}
