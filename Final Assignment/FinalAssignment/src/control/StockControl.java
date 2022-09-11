package control;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.Scanner;
import adt.SortedList;
import entity.Inventory;

import adt.SortedListInterface;

public class StockControl{ 

    //a main function will be executed at the beginning of the program to let user to select their options
    public void main(SortedListInterface<Inventory> invList, Inventory inventory, StockControl stock){   
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
        //a do while loop to show the options and allow user input the instructions in order to execute the functions
        do{
            //Only these alphabets able to interact with this program
            while(cmd == 'a' || cmd == 'v' || cmd == 's' || cmd == 'c'){
                switch(cmd){
                    // 'a' can call add new inventory object function by filling up the data fields
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
                        //After filled up the informations, inventory object will go into the addNew() function
                        inventory = stock.addNew(inventory, req_invCode, req_invName, req_quantity, req_price); 
                        //After that, inventory object will be passing to the adt sorted array list object
                        invList.add(inventory);
                        break;

                    // 'v' can call function that view all of the inventory object in the list
                    case 'v': 
                        System.out.println("\nLatest list: ");
                        //in order to list out the inventories, update() will need to be execute first in order to make the list to the latest list
                        stock.update(invList, inventory, false, 0, false);
                        //then only call the stockList() function in order to print out the list
                        stock.stockList(invList, inventory, stock);
                        break;

                    // 's' can call searching function, to search the specific inventory in the list
                    case 's':
                        //Create an Iterator object and using the SortedArrayListInterface to create ListIterator object
                        Iterator<Inventory> invIterator = invList.getIterator();
                        boolean isFound = false;
                        System.out.println("\nSearching section:");
                        //Ask for user input an inventory name for searching
                        Scanner search = new Scanner(System.in);
                        System.out.print("Stock name: ");
                        String stockName = search.nextLine();
                        
                        //Check if the list have the next values
                        while(invIterator.hasNext()){
                            // Create an inventory object, and calling the next() function using Iterator object
                            // So that now we can calling the inventory object one by one from the list until there is no next object
                            Inventory inv = invIterator.next();
                            //Check if the searching item in the list
                            if (invList.contain(inv.getInvName(), stockName)){
                                //Check the item is in the object or not
                                if (invList.Searching(invList, inv) != null){
                                    isFound = true;
                                    // System.out.printf("%-10s %-15s %-15s %-15s %-10s\n", "InvID", "InvName", "Quantity", "Price(RM)", "Date");
                                    // System.out.printf("%-10s %-15s %-15d %-15.2f %-10s\n", inv.getInvCode(), inv.getInvName(), inv.getQuantity(), inv.getPrice(), inv.getDate());
                                    inv.toString();
                                }
                            }
                        }
                        if(!isFound){
                            System.out.println("【"+stockName+"】"+" does not exists!");
                        }

                        break;
                    
                    // 'c' can call function to clear the sorted array list
                    case 'c':
                        invList.clear();
                        break;

                }
                System.out.print(
                    "\nInventory section: \n"+
                    "Enter 'a' to add new inventory,\n"+
                    "Enter 'v' to view inventory list\n"+
                    "Enter 's' to search inventory\n"+
                    "Enter 'c' to clear inventory\n"+
                    "Enter 'q' to quit the inventory\n"+
                    "Enter your selection: "
                );
                
                cmd = input.next().charAt(0);
            }
            
        // input 'q' will end the inventory section
        }while(cmd != 'q');
        
    }

    //This function is to display the inventory object's values in the list
    public boolean stockList(SortedListInterface<Inventory> invList, Inventory inventory, StockControl stock){
        //Create an Iterator object and using the SortedArrayListInterface to create ListIterator object
        Iterator<Inventory> invIterator = invList.getIterator();
        System.out.printf("%-10s %-15s %-15s %-15s %-10s\n", "InvID", "InvName", "Quantity", "Price(RM)", "Date");
        //Check if the list have the next values
        while(invIterator.hasNext()){
            // Create an inventory object, and calling the next() function using Iterator object
            // So that now we can calling the inventory object one by one from the list until there is no next object
            Inventory inv = invIterator.next();
            //Styling the print out in order to make it more tidy and easy to read
            System.out.printf("%-10s %-15s %-15d %-15.2f %-10s\n", inv.getInvCode(), inv.getInvName(), inv.getQuantity(), (inv.getPrice()/inv.getQuantity())*inv.getQuantity(), inv.getDate());
            //Check if the inventory's quantity is 0, ask for restock
            if (inv.getQuantity() < 1){
                System.out.println(inv.getInvName()+" is ran out!");
                System.out.println("Do you want to restock?");
                System.out.print("'y' for yes, 'n' for no: ");
                Scanner input = new Scanner(System.in);
                char req_restock = input.next().charAt(0);
                switch(req_restock){
                    // if user input 'y' then will call the restock() function
                    case 'y':
                        stock.reStock(invList, inv);
                        break;
                    // if user input 'n' then will call the update function in order to update the list
                    case 'n':
                        stock.update(invList, inv, false, 0, true);
                        break;
                }
                return false;
            }
            
            
        }
        System.out.println();
        return true;
    }

    //outStock function is to allow the Order() entity make changes to the inventory list
    //if the order is placed successfully, the foods used by the menu will return to the order, and then the order will call the outStock() function, to pass which inventory being used and update the list
    public void outStock(SortedListInterface<Inventory> invList, Inventory inventory, StockControl stock, boolean outStock, int qty){
        stock.update(invList, inventory, outStock, qty, false);
    }

    //restock function is to add an existing stock back to the list by input how many quantity and how much money to restock
    public void reStock(SortedListInterface<Inventory> invList, Inventory invRestock){
        Scanner input = new Scanner(System.in);
        System.out.println("How many you want to restock?: ");
        int restockQty = input.nextInt();
        System.out.println("How much of the stocks?: ");
        double restockPrice = input.nextInt();

        //set the quantity and price to the current inventory object
        invRestock.setQuantity(invRestock.getQuantity()+restockQty);
        invRestock.setPrice(restockPrice);
    }

    //Update the list to the latest list
    public void update(SortedListInterface<Inventory> invList, Inventory currentObj, boolean outStock, int qty, boolean drop){
        //Create an Iterator object and using the SortedArrayListInterface to create ListIterator object
        Iterator<Inventory> invIterator = invList.getIterator();
        //variables for the if condition
        int repeat = 0;
        int index = 0;
        int currentIndex = 0;
        //Check if the list have the next values
        while(invIterator.hasNext()){
            // Create an inventory object, and calling the next() function using Iterator object
            // So that now we can calling the inventory object one by one from the list until there is no next object
            Inventory inv = invIterator.next();
            index++;
            // This is to make some changes to the existing inventory
            if(invList.contain(inv.getInvCode(),currentObj.getInvCode()) && repeat > 0 ){
                while(index > currentIndex){
                    currentIndex++;
                }
                inv.setInvName(currentObj.getInvName());
                inv.setPrice(currentObj.getPrice()+inv.getPrice());
                inv.setQuantity(currentObj.getQuantity()+inv.getQuantity());
                inv.setDate(LocalDate.now());
                invList.remove(currentIndex-2);

            //This is to determine the inventory being outstock
            }else if (invList.contain(inv.getInvCode(),currentObj.getInvCode()) && outStock && qty>0){
                while(index > currentIndex){
                    currentIndex++;
                }
                // Check if the current inventory's quantity is more than 0
                if (currentObj.getQuantity() > 0){
                    //minus the consumed quantity of inventory and the price of each inventory
                    inv.setPrice(currentObj.getPrice()-(inv.getPrice()/currentObj.getQuantity())*qty);
                    inv.setQuantity(currentObj.getQuantity()-qty);
                    inv.setDate(LocalDate.now());
                }

            // To check whether want to remove the inventory from the list
            // In this case, if the user do not want to restock, then this condition will be execute
            // The inventory will be directly remove from the list
            }else if (invList.contain(inv.getInvCode(),currentObj.getInvCode()) && drop){
                while(index > currentIndex){
                    currentIndex++;
                }
                //Remove function to remove the inventory from the list
                invList.remove(currentIndex-1);

            // If the current passing inventory is in the list
            // Then will make the repeat variable increment by 1
            // After that, it will able to make first if condition trigger, so that we can make some changes to the existing inventory
            }else if (invList.contain(inv.getInvCode(),currentObj.getInvCode())){
                repeat++;
            }else{
                repeat = 0;
            }

        }

    }
    
    // This is the function that to create an new inventory object using the same inventory object.
    public Inventory addNew(Inventory inventory, String invCode, String invName, int invQty, double invPrice){
        return (inventory = new Inventory(invCode, invName, invQty, invPrice));
    }

}
