package adt;
import java.util.Iterator;
import java.util.Scanner;
import entity.Inventory;

public class SortedArrayList<T extends Comparable<T>> implements SortedArrayListInterface<T>{

    private T[] array;
    private int numberOfEntries;
    private static final int DEFAULT_CAPACITY = 100;

    public SortedArrayList(){
        this(DEFAULT_CAPACITY);
    }

    public SortedArrayList(int initialCapacity){
        numberOfEntries = 0;
        array = (T[]) new Comparable[initialCapacity];
    }

    //add a new entry and sorting the values into the array
    public boolean add(T newEntry){
        int i = 0;
        while (i < numberOfEntries && newEntry.compareTo(array[i]) > 0){
            i++;
        }
        moveForward(i + 1);
        array[i] = newEntry;
        numberOfEntries++;
        return true;
    }

    //any new entry coming in, this function will move the existed values in the array forward, to let new entry to insert into the first index of the array
    private void moveForward(int insertPosition) {
        int newIndex = insertPosition - 1;
        int lastIndex = numberOfEntries - 1;    

        for (int index = lastIndex; index >= newIndex; index--) {   
          array[index + 1] = array[index];
        }

    }

    //remove an entry
    public boolean remove(int removePosition){
        if(numberOfEntries == 0){
            return false;
        }else{
            moveBackward(removePosition);
            numberOfEntries--;
            return true;
        }
    }
    
    //any entry being removed, this function will move the existed values in the array backward, to ensure first index of the array is not empty
    private void moveBackward(int removePosition){
        int removedIndex = removePosition;
        int lastIndex = numberOfEntries - 1;
        for (int index = removedIndex; index < lastIndex; index++){
            array[index] = array[index+1];
        }
    }

    
    //Check if a certain values is contained in the list
    public boolean contain(String invCode, String currentCode){
        if (invCode.equals(currentCode)){
            return true;
        }
        return false;
    }
    
    //Return the number of entries in the list
    public int getNumberOfEntries(){
        return numberOfEntries;
    }

    //Clear the array
    public void clear(){
        numberOfEntries = 0;
    }

    //Check the list is empty or not
    public boolean isEmpty(){
        return numberOfEntries == 0;
    }

    //Searching the inventory in the inventory list, if existed will return true, otherwise will return false
    public boolean Searching(SortedArrayListInterface<Inventory> invList, Inventory inventory){
        //Create an Iterator object and using the SortedArrayListInterface to create ListIterator object
        Iterator<Inventory> invIterator = invList.getIterator();
        //Ask for user input an inventory name for searching
        Scanner input = new Scanner(System.in);
        System.out.print("Stock name:");
        String stockName = input.nextLine();
        //Create an new inventory object for storing user's looking inventory
        Inventory findingStock = new Inventory<>();
        findingStock.setInvName(stockName);
        //Check if the list have the next values
        while(invIterator.hasNext()){
            // Create an inventory object, and calling the next() function using Iterator object
            // So that now we can calling the inventory object one by one from the list until there is no next object
            Inventory inv = invIterator.next();
            //Check whether the user's looking inventory inside the list or not
            //If existed, then will print out the object's values to display
            if (inv.getInvName().equals(findingStock.getInvName())){
                //Styling the print out in order to make it more tidy and easy to read
                System.out.printf("%-10s %-15s %-15s %-15s %-10s\n", "InvID", "InvName", "Quantity", "Price(RM)", "Date");
                System.out.printf("%-10s %-15s %-15d %-15.2f %-10s\n", inv.getInvCode(), inv.getInvName(), inv.getQuantity(), inv.getPrice(), inv.getDate());
                return true;
            }
        }
        //For display purpose
        System.out.print("【"+stockName+"】");
        return false;
    }

    //A method to create a ListIterator object
    public Iterator<T> getIterator(){
        return new ListIterator();
    }
    
    //A class to get the object from the array list.
    private class ListIterator implements Iterator<T>{
        int nextIndex = 0;

        public ListIterator(){
            
        }

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
