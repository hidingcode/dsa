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

    //add a new entry
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
    
    private void moveBackward(int removePosition){
        int removedIndex = removePosition;
        int lastIndex = numberOfEntries - 1;
        for (int index = removedIndex; index < lastIndex; index++){
            array[index] = array[index+1];
        }
    }

    
    //Check if a certain value is contained in the list
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

    public boolean Searching(SortedArrayListInterface<Inventory> invList, Inventory inventory){
        Iterator<Inventory> invIterator = invList.getIterator();
        Scanner input = new Scanner(System.in);
        System.out.print("Stock name:");
        String stockName = input.nextLine();
        Inventory findingStock = new Inventory<>();
        findingStock.setInvName(stockName);
        while(invIterator.hasNext()){
            Inventory inv = invIterator.next();
            if (inv.getInvName().equals(findingStock.getInvName())){
                System.out.printf("%-10s %-15s %-15s %-15s %-10s\n", "InvID", "InvName", "Quantity", "Price(RM)", "Date");
                System.out.printf("%-10s %-15s %-15d %-15.2f %-10s\n", inv.getInvCode(), inv.getInvName(), inv.getQuantity(), inv.getPrice(), inv.getDate());
                return true;
            }
        }
        
        System.out.print("【"+stockName+"】");
        return false;
    }

    public Iterator<T> getIterator(){
        return new ListIterator();
    }
    
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
