package adt;

import java.io.Serializable;

public class ArrayList<T> implements ArrayListInterface<T>, Serializable {

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
    public boolean contains(T anEntry) {
      boolean found = false;
      for (int index = 0; !found && (index < numberOfEntries); index++) {
        if (anEntry.equals(array[index])) {
          found = true;
        }
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
    public String getAllEntry() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
