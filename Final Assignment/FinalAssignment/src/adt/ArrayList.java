package adt;

import java.util.Iterator;

public class ArrayList<T> implements ArrayListInterface<T> {

    private T[] array;
    private int numberOfEntries;
    private static final int DEFAULT_CAPACITY = 100;

    public ArrayList() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayList(int initialCapacity) {
        numberOfEntries = 0;
        array = (T[]) new Object[initialCapacity];
    }

    @Override
    public boolean add(T newEntry) {
        array[numberOfEntries] = newEntry;
        numberOfEntries++;
        return true;
    }

    public boolean add(int newPosition, T newEntry) {
        boolean isSuccessful = true;

        if ((newPosition >= 1) && (newPosition <= numberOfEntries + 1)) {
            createAccount(newPosition);
            array[newPosition - 1] = newEntry;
            numberOfEntries++;
        } else {
            isSuccessful = false;
        }

      return isSuccessful;
    }

    @Override
    public T remove(int givenPosition) {
        T result = null;

        if ((givenPosition >= 1) && (givenPosition <= numberOfEntries)) {
            result = array[givenPosition - 1];

            if (givenPosition < numberOfEntries) {
            removeGap(givenPosition);
            }
            numberOfEntries--;
        }
        return result;
    }

    @Override
    public void clear() {
        numberOfEntries = 0;
    }

    @Override
    public boolean replace(int givenPosition, T newEntry) {
        boolean isSuccessful = true;

        if ((givenPosition >= 1) && (givenPosition <= numberOfEntries)) {
            array[givenPosition - 1] = newEntry;
        } else {
            isSuccessful = false;
        }
        return isSuccessful;
    }

    @Override
    public T getEntry(int givenPosition) {
        T result = null;

        if ((givenPosition >= 1) && (givenPosition <= numberOfEntries)) {
            result = array[givenPosition - 1];
        }
        return result;
    }

    @Override
    public boolean contains(String givenInput, String existData) {
        boolean found = true;
        if(givenInput.equals(existData)){
            found = false;
        }
        return found;
    }

    @Override
    public int getNumberOfEntries() {
        return numberOfEntries;
    }

    @Override
    public boolean isEmpty() {
        return numberOfEntries == 0;
    }

    @Override
    public boolean isFull() {
        return numberOfEntries == array.length;
    }

    private void createAccount(int newPosition) {
        int newIndex = newPosition - 1;
        int lastIndex = numberOfEntries - 1;

        for (int index = lastIndex; index >= newIndex; index--) {
            array[index + 1] = array[index];
        }
    }

    private void removeGap(int givenPosition) {
        int removedIndex = givenPosition - 1;
        int lastIndex = numberOfEntries - 1;

        for (int index = removedIndex; index < lastIndex; index++) {
            array[index] = array[index + 1];
        }
    }

    @Override
    public boolean getAllEntry() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Iterator<T> getIterator() {
        return new ArrayListInterator();
    }

    private class ArrayListInterator implements Iterator<T>{
        int nextIndex = 0;

        public boolean hasNext(){
            return nextIndex < numberOfEntries;
        }

      public T next(){
          T list = null;
          if(hasNext()){
                list = array[nextIndex];
                nextIndex++;
          }
          return list;
        } 
    }
}

    
