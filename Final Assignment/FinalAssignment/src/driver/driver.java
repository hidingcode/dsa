package driver;

import adt.StackInterface;
import adt.SortedArrayListInterface;
import adt.SortedArrayList;
import java.util.Iterator;
import adt.LinkedStack;

import entity.Chef;
import entity.Kitchen;
import entity.Inventory;

import java.util.Iterator;
import java.util.Scanner;

public class driver {
    public static void main(String[] args) {
        SortedArrayListInterface<Inventory> invList = new SortedArrayList<>();   
        Inventory inventory;
        int code = 0;
        invList.add(inventory = new Inventory(++code, "Steak", 25, 100));
        invList.add(inventory = new Inventory(++code, "Pork", 25, 80));
        invList.add(inventory = new Inventory(++code, "Lamb", 25, 90));
        invList.add(inventory = new Inventory(++code, "Fish", 25, 70));
        invList.add(inventory = new Inventory(++code, "Bread", 25, 50));
        invList.add(inventory = new Inventory(++code, "Sugar", 25, 30));
        inventory.main(invList, inventory);


//         StackInterface<Chef> chefShift = new LinkedStack<>();
        
//         Kitchen kitchen = new Kitchen();

//         kitchen.PunchIn("C0001", "ykp", "Noob");
//         kitchen.PunchIn("C0002", "ywy", "Noob");

//         kitchen.ShowChefShift();
//         kitchen.CheckLate();
// >>>>>>> 88fddc667ba30d0a1f58b7d95fd0b08c2688d160














        // Inventory inventory = new Inventory(req_invCode, req_invName, req_quantity, req_price);
        // Iterator<Inventory> invIterator = invList.getIterator();
        // while(invIterator.hasNext()){
        //     Inventory inv = invIterator.next();
        //     System.out.printf(inv.getInvCode()+", "+ inv.getInvName()+", "+ inv.getQuantity()+", "+ inv.getPrice()+ ", "+inv.getDate()+"\n");
            
        //     if (inv.getInvCode().equals(inventory.getInvCode())){
        //         System.out.println("Existed");
        //     }
            
        // }
        

        
    }

    private static Inventory inventory() {
        return null;
    }

}
