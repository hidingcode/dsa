package entity;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.Scanner;
import adt.SortedArrayList;

import adt.SortedArrayListInterface;

public class Inventory<T> implements Comparable<Inventory>{ 
    private String invCode;
    private String invName;
    private int quantity;
    private double price;
    private LocalDate date = LocalDate.now();
    
    public Inventory() {

    }

    public Inventory(String invCode, String invName) {
        this.invCode = invCode;
        this.invName = invName;
    }
    
    public Inventory(String invCode, String invName, int quantity, double price){
        this.invCode = invCode;
        this.invName = invName;
        this.quantity = quantity;
        this.price = price;
        this.date = LocalDate.now();
    }

    

    public void main(SortedArrayListInterface<Inventory> invList, Inventory inventory){
         
        Scanner input = new Scanner(System.in);
        System.out.print(
            "Inventory section: \n"+
            "Enter 'a' to add new inventory,\n"+
            "Enter 'v' to view inventory list\n"+
            "Enter 's' to search inventory\n"+
            "Enter 'q' to quit the inventory\n"+
            "Enter your selection: "
        );
        char cmd = input.next().charAt(0);
        
        do{
            while(cmd == 'a' || cmd == 'v' || cmd == 's' || cmd == 'o'){
                switch(cmd){
                    case 'a': 
                        System.out.println("Add New Inventory: ");
                        Scanner req_stock = new Scanner(System.in);
                        System.out.print("Please enter inv code: ");
                        String req_invCode = req_stock.nextLine();
                        System.out.print("Please enter inv name: ");
                        String req_invName = req_stock.nextLine();
                        System.out.print("Please enter quantity: ");
                        int req_quantity = req_stock.nextInt();
                        System.out.print("Please enter price: ");
                        double req_price = req_stock.nextDouble();
                        System.out.println("ADDED");
                        inventory = inventory.addNew(inventory, req_invCode, req_invName, req_quantity, req_price); 
                        invList.add(inventory);
                        
                        break;
                    case 'v': 
                        System.out.println("Latest list: ");
                        inventory.update(invList, inventory, false, 0, false);
                        if (inventory.stockList(invList, inventory)){
                            System.out.println("Do you want to sort?");
                            System.out.print("'y' for Yes, 'n' for No: ");
                            char reqSort = input.next().charAt(0);
                            switch(reqSort){
                                case 'y':
                                    System.out.println("YES");
                                    System.out.println("What do you want to sort?");
                                    System.out.print("'i' for ID, 'n' for Name, 'q' for quantity, 'p' for price, 'd' for date, any key to quit: ");
                                    char sortBy = input.next().charAt(0);
                                    switch(sortBy){
                                        case 'i':
                                            System.out.println("Sort by ID");
                                            break;
                                        case 'n':
                                            System.out.println("Sort by Name");
                                            break;
                                        case 'q':
                                            System.out.println("Sort by Quantity");
                                            break;
                                        case 'd':
                                            System.out.println("Sort by Date");
                                            break;
                                    }
                            }
                        }

                        break;
                    case 's':
                        System.out.println("\nSearching section:");
                        if (!invList.Searching(invList, inventory)){
                            System.out.println("does not exists!");
                        }
                        break;
                    
                    case 'o':
                    // inventory.update(invList, currentObj, outStock, qty);
                        break;

                }
                System.out.print(
                    "\nInventory section: \n"+
                    "Enter 'a' to add new inventory,\n"+
                    "Enter 'v' to view inventory list\n"+
                    "Enter 's' to search inventory\n"+
                    "Enter 'q' to quit the inventory\n"+
                    "Enter your selection: "
                );
                
                cmd = input.next().charAt(0);
            }
            

        }while(cmd != 'q');
        
    }

    public boolean stockList(SortedArrayListInterface<Inventory> invList, Inventory inventory){
        Iterator<Inventory> invIterator = invList.getIterator();
        System.out.printf("%-10s %-15s %-15s %-15s %-10s\n", "InvID", "InvName", "Quantity", "Price(RM)", "Date");
        while(invIterator.hasNext()){
            Inventory inv = invIterator.next();
            System.out.printf("%-10s %-15s %-15d %-15.2f %-10s\n", inv.getInvCode(), inv.getInvName(), inv.getQuantity(), (inv.getPrice()/inv.getQuantity())*inv.getQuantity(), inv.getDate());
            if (inv.getQuantity() < 1){
                System.out.println(inv.getInvName()+" is ran out!");
                System.out.println("Do you want to restock?");
                System.out.println("'y' for yes, 'n' for no: ");
                Scanner input = new Scanner(System.in);
                char req_restock = input.next().charAt(0);
                switch(req_restock){
                    case 'y':
                        inventory.reStock(invList, inv);
                        break;
                    case 'n':
                        inventory.update(invList, inv, false, 0, true);
                        break;
                }
                return false;
            }
            
            
        }
        System.out.println();
        return true;
    }

    public void outStock(SortedArrayListInterface<Inventory> invList, Inventory inventory, boolean outStock, int qty){
        
        inventory.update(invList, inventory, outStock, qty, false);
    }

    public void reStock(SortedArrayListInterface<Inventory> invList, Inventory invRestock){
        Scanner input = new Scanner(System.in);
        System.out.println("How many you want to restock?: ");
        int restockQty = input.nextInt();
        System.out.println("How much of the stocks?: ");
        double restockPrice = input.nextInt();

        invRestock.setQuantity(invRestock.getQuantity()+restockQty);
        invRestock.setPrice(invRestock.getPrice()+restockPrice);
    }

    public void update(SortedArrayListInterface<Inventory> invList, Inventory currentObj, boolean outStock, int qty, boolean drop){
        Iterator<Inventory> invIterator = invList.getIterator();
        int repeat = 0;
        int index = 0;
        int currentIndex = 0;
        while(invIterator.hasNext()){
            Inventory inv = invIterator.next();
            index++;
            if(invList.contain(inv.getInvCode(),currentObj.getInvCode()) && repeat > 0 ){
                while(index > currentIndex){
                    currentIndex++;
                }
                inv.setInvName(currentObj.getInvName());
                inv.setPrice(currentObj.getPrice()+inv.getPrice());
                inv.setQuantity(currentObj.getQuantity()+inv.getQuantity());
                inv.setDate();
                invList.remove(currentIndex-2);
            }else if (invList.contain(inv.getInvCode(),currentObj.getInvCode()) && outStock && qty>0){
                System.out.println("OutStock");
                while(index > currentIndex){
                    currentIndex++;
                }
                if (currentObj.getQuantity() > 0){
                    inv.setPrice(currentObj.getPrice()- (inv.getPrice()/currentObj.getQuantity())*qty);
                    inv.setQuantity(currentObj.getQuantity()-qty);
                    inv.setDate();
                }

                
            }else if (invList.contain(inv.getInvCode(),currentObj.getInvCode()) && drop){
                while(index > currentIndex){
                    currentIndex++;
                }
                invList.remove(currentIndex-1);
            }else if (invList.contain(inv.getInvCode(),currentObj.getInvCode())){
                repeat++;
            }else{
                repeat = 0;
            }

        }

    }
    
    public Inventory addNew(Inventory inventory, String invCode, String invName, int invQty, double invPrice){
        return (inventory = new Inventory<>(invCode, invName, invQty, invPrice));
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
