package adt;

public interface LinkedListInterface<T> {
    
    public boolean add(T newEntryT);

    public boolean add(int newPosition, T newEntry);

    public T remove(int givenPosition);

    public void clear();

    public boolean replace(int givenPosition, T newEntry);

    
    public T contains(int Position);

    public int getNumberOfEntries();

    public boolean isEmpty();

}
