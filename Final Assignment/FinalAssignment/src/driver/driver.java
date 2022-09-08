package driver;

import adt.LinkedStackInterface;
import adt.SortedArrayListInterface;
import adt.SortedArrayList;
import java.util.Iterator;
import adt.LinkedStack;

import entity.Chef;
import entity.Kitchen;
import entity.Inventory;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class driver {
    public static void main(String[] args) {
<<<<<<< HEAD
        // SortedArrayListInterface<Inventory> invList = new SortedArrayList<>();    
=======
        SortedArrayListInterface<Inventory> invList = new SortedArrayList<>();   
        Inventory inventory;
        invList.add(inventory = new Inventory("Inv001", "Steak", 25, 100));
        invList.add(inventory = new Inventory("Inv002", "Pork", 25, 80));
        invList.add(inventory = new Inventory("Inv003", "Lamb", 25, 90));
        invList.add(inventory = new Inventory("Inv004", "Fish", 25, 70));
        invList.add(inventory = new Inventory("Inv005", "Bread", 25, 50));
        invList.add(inventory = new Inventory("Inv006", "Sugar", 25, 30));
        inventory.main(invList, inventory);


//         StackInterface<Chef> chefShift = new LinkedStack<>();
>>>>>>> 2af63bf0413e8f0318a27482501cb84257f55494
        
//         Kitchen kitchen = new Kitchen();

//         kitchen.PunchIn("C0001", "ykp", "Noob");
//         kitchen.PunchIn("C0002", "ywy", "Noob");

<<<<<<< HEAD
=======
//         kitchen.ShowChefShift();
//         kitchen.CheckLate();
// >>>>>>> 88fddc667ba30d0a1f58b7d95fd0b08c2688d160














>>>>>>> 2af63bf0413e8f0318a27482501cb84257f55494
        // Inventory inventory = new Inventory(req_invCode, req_invName, req_quantity, req_price);
        // Iterator<Inventory> invIterator = invList.getIterator();
        // while(invIterator.hasNext()){
        //     Inventory inv = invIterator.next();
        //     System.out.printf(inv.getInvCode()+", "+ inv.getInvName()+", "+ inv.getQuantity()+", "+ inv.getPrice()+ ", "+inv.getDate()+"\n");
            
        //     if (inv.getInvCode().equals(inventory.getInvCode())){
        //         System.out.println("Existed");
        //     }
            
        // }  
              
       Kitchen kitchen = new Kitchen();
       kitchen.Main();
    }
<<<<<<< HEAD
=======

    private static Inventory inventory() {
        return null;
    }

>>>>>>> 2af63bf0413e8f0318a27482501cb84257f55494
}
