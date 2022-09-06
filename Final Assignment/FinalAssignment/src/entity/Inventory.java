package entity;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.Scanner;

import adt.SortedArrayListInterface;

public class Inventory<T> implements Comparable<Inventory>{ 
    private String invCode;
    private String invName;
    private int quantity;
    private double price;
    private LocalDate date = LocalDate.now();
    
    
    public Inventory(String invCode, String invName, int quantity, double price){
        this.invCode = invCode;
        this.invName = invName;
        this.quantity = quantity;
        this.price = price;
        this.date = LocalDate.now();
    }

    public Inventory() {

    }

    public void update(SortedArrayListInterface<Inventory> invList, Inventory inventory){
        System.out.println("UPDATE");
        Iterator<Inventory> invIterator = invList.getIterator();
        System.out.printf("%-10s %-15s %-15s %-15s %-10s\n", "InvID", "InvName", "Quantity", "Price(RM)", "Date");
        while(invIterator.hasNext()){
            Inventory inv = invIterator.next();

            // invList.contain(inv.invCode, inventory);

            System.out.printf("%-10s %-15s %-15d %-15.2f %-10s\n", inv.getInvCode(), inv.getInvName(), inv.getQuantity(), inv.getPrice(), inv.getDate());
            
        }

    }
    
    public boolean reStock(String invCode, int quantity){
        return true;
    }
    
    public Inventory addNew(SortedArrayListInterface<Inventory> invList, Inventory inventory){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter inv code: ");
        String req_invCode = input.nextLine();
        System.out.print("Please enter inv name: ");
        String req_invName = input.nextLine();
        System.out.print("Please enter quantity: ");
        int req_quantity = input.nextInt();
        System.out.print("Please enter price: ");
        double req_price = input.nextDouble();
        System.out.println("ADDED");

        ///pass inventory object to the contain()
         

        // System.out.println(inventory.getQuantity());

        // if (isExisted(invList, inventory)){
        //     req_quantity += inventory.getQuantity();
        //     req_price += inventory.getPrice();

        //     return (inventory =new Inventory<>(req_invCode, req_invName, req_quantity, req_price));
        // }

        return (inventory =new Inventory<>(req_invCode, req_invName, req_quantity, req_price));
    }
    
    public boolean isExisted(SortedArrayListInterface<Inventory> invList, Inventory inventory){
        
        Iterator<Inventory> invIterator = invList.getIterator(); 
        while(invIterator.hasNext()){
            inventory = invIterator.next();
            if (inventory.getInvCode().equals(inventory.getInvCode())){
                System.out.println("Existed");

                return true;
            }
            
        }

        return false;
    }

    @Override
    public int compareTo(Inventory inv) {
        return (this.invCode.compareTo(inv.invCode));
    }


    public String getInvCode(){
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

    public void setInvCode(String invCode){
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
