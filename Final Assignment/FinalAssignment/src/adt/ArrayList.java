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

    // add new antry at the last of the array
    @Override
    public boolean add(T newEntry) {
        array[numberOfEntries] = newEntry;
        numberOfEntries++;
        return true;
    }

    // add new entry to the newPosition
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

    // remove an entry of the givenPosition
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

    // remove the whole entry in the array list
    @Override
    public void clear() {
        numberOfEntries = 0;
    }

    // replace the givenPosition entry
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

    // check the current entry is included in the array list
    @Override
    public boolean contains(T anEntry) {
      boolean found = false;
      for (int index = 0; !found && (index < numberOfEntries); index++) {
        if (anEntry.equals(array[index])) {
          found = true;
        }
      }
      return found;
    }

    // get the givenPosition entry
    @Override
    public T getEntry(int givenPosition) {
        T result = null;
    
        if ((givenPosition >= 1) && (givenPosition <= numberOfEntries)) {
            result = array[givenPosition - 1];
        }
    
        return result;
    }

    // get the total number of entry
    @Override
    public int getNumberOfEntries() {
        return numberOfEntries;
    }

    // check the entry is empty
    @Override
    public boolean isEmpty() {
        return numberOfEntries == 0;
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

    // get the entry number
    @Override
    public int getIndexNumber(T anEntry){
        int entryNumber = -1;
        for(int index = 0; entryNumber == -1 && index < numberOfEntries; index++){
            if(anEntry.equals(array[index])){
                entryNumber = index;
            }
        }
        return entryNumber;
    }

    // get all the entry and display it
    @Override
    public void getAllEntry(){
        for(int index = 0; index < numberOfEntries; index++){
            System.out.println(array[index]);
        }
    }

    // get Iterator
    @Override
    public Iterator<T> getIterator() {
        return new ArrayListInterator();
    }

    // use iterator to loop through the array list
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

    
