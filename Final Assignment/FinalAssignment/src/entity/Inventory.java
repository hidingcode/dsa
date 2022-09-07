package entity;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.Scanner;
import adt.SortedArrayList;

import adt.SortedArrayListInterface;

public class Inventory<T> implements Comparable<Inventory>{ 
    private int invCode = 0;
    private String invName;
    private int quantity;
    private double price;
    private LocalDate date = LocalDate.now();
    
    
    public Inventory(int invCode, String invName, int quantity, double price){
        this.invCode = invCode;
        this.invName = invName;
        this.quantity = quantity;
        this.price = price;
        this.date = LocalDate.now();
    }

    public Inventory() {

    }

    public void main(SortedArrayListInterface<Inventory> invList, Inventory inventory){
         
        Scanner input = new Scanner(System.in);
        System.out.print(
            "Do you want to add new inventory?\n"+
            "y = Yes, n = No\n"+
            "Enter your selection: (y/n)\n"
        );
        char cmd = input.next().charAt(0);
        
        do{
            while(cmd == 'y' || cmd == 'v' || cmd == 'f'){
                switch(cmd){
                    case 'y': 
                        inventory = inventory.addNew(invList, inventory); 
                        invList.add(inventory);
                        
                        break;
                    case 'v': 
                        System.out.println("Latest list: ");
                        inventory.update(invList, inventory);
                        inventory.stockList(invList);
                        break;
                    case 'f':
                        System.out.println("SEARCHING");
                        if (!invList.Searching(invList, inventory)){
                            System.out.println("Inventory does not exists!");
                        }
                        break;
                }
                System.out.print("\n\nEnter 'n' to quit add new inventory, 'y' to continue: , 'v' to view list");
                cmd = input.next().charAt(0);
            }
            

        }while(cmd != 'n');
        
    }

    public void stockList(SortedArrayListInterface<Inventory> invList){
        Iterator<Inventory> invIterator = invList.getIterator();
        System.out.printf("%-10s %-15s %-15s %-15s %-10s\n", "InvID", "InvName", "Quantity", "Price(RM)", "Date");
        while(invIterator.hasNext()){
            Inventory inv = invIterator.next();
            System.out.printf("%-10s %-15s %-15d %-15.2f %-10s\n", "Inv"+inv.getInvCode(), inv.getInvName(), inv.getQuantity(), inv.getPrice(), inv.getDate());
  
        }
    }

    public void update(SortedArrayListInterface<Inventory> invList, Inventory currentObj){
        Iterator<Inventory> invIterator = invList.getIterator();
        int repeat = 0;
        int index = 0;
        int currentIndex = 0;
        while(invIterator.hasNext()){
            Inventory inv = invIterator.next();
            index++;
            // System.out.println("INDEX: "+index);
            // System.out.println("NUMBER OF ENTRIES: "+invList.getNumberOfEntries());
            if(currentObj.getInvCode() == inv.getInvCode() && repeat > 0 ){         
                while(index > currentIndex){
                    currentIndex++;
                }
                inv.setInvName(currentObj.getInvName());
                inv.setPrice(currentObj.getPrice()+inv.getPrice());
                inv.setQuantity(currentObj.getQuantity()+inv.getQuantity());
                inv.setDate();
                invList.remove(currentIndex-2);
            }else if (currentObj.getInvCode()==inv.getInvCode()){
                repeat++;
            }else{
                repeat = 0;
            }
            // System.out.printf("%-10s %-15s %-15d %-15.2f %-10s\n", inv.getInvCode(), inv.getInvName(), inv.getQuantity(), inv.getPrice(), inv.getDate());

        }

    }
    
    public Inventory addNew(SortedArrayListInterface<Inventory> invList, Inventory inventory){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter inv name: ");
        String req_invName = input.nextLine();
        System.out.print("Please enter quantity: ");
        int req_quantity = input.nextInt();
        System.out.print("Please enter price: ");
        double req_price = input.nextDouble();
        System.out.println("ADDED");


        return (inventory =new Inventory<>(inventory.getInvCode()+1, req_invName, req_quantity, req_price));
    }

    @Override
    public int compareTo(Inventory inv) {
        return (int)(this.invCode - inv.invCode);
    }

    public int getInvCode(){
        return invCode;
    }

    public String getInvName(){
        return invName;
    }

    public int getQuantity(){
        return quantity;
    }

    public double getPrice(){
        return price;
    }

    public LocalDate getDate(){
        return date;
    }

    public void setInvCode(int invCode){
        this.invCode = invCode;
    }

    public void setInvName(String invName){
        this.invName = invName;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setDate(){
        this.date = LocalDate.now();
    }
}
