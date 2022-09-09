package driver;

import adt.LinkedStackInterface;
import adt.SortedArrayListInterface;
import control.Kitchen;
import adt.SortedArrayList;
import java.util.Iterator;
import adt.LinkedStack;

import entity.Chef;
import entity.Inventory;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class driver {
    public static void main(String[] args) {
        // SortedArrayListInterface<Inventory> invList = new SortedArrayList<>();   
        // Inventory inventory;
        // invList.add(inventory = new Inventory("Inv001", "Steak", 25, 100));
        // invList.add(inventory = new Inventory("Inv002", "Pork", 25, 80));
        // invList.add(inventory = new Inventory("Inv003", "Lamb", 25, 90));
        // invList.add(inventory = new Inventory("Inv004", "Fish", 25, 70));
        // invList.add(inventory = new Inventory("Inv005", "Bread", 25, 50));
        // invList.add(inventory = new Inventory("Inv006", "Sugar", 25, 30));
        // inventory.main(invList, inventory);

        
        //  
        Kitchen kitchen = new Kitchen();
        kitchen.Main();
        // Chef chef;
        // chef = new Chef("c1", "lyc");
        // chefShift.push(chef);
        // System.out.println(chef.getChefName());
        // chef = new Chef("c1", "ykp");
        // chefShift.push(chef);
        //want to search ykp

//         kitchen.PunchIn("C0001", "ykp", "Noob");
//         kitchen.PunchIn("C0002", "ywy", "Noob");

        // Inventory inventory = new Inventory(req_invCode, req_invName, req_quantity, req_price);
        // Iterator<Inventory> invIterator = invList.getIterator();
        // while(invIterator.hasNext()){
        //     Inventory inv = invIterator.next();
        //     System.out.printf(inv.getInvCode()+", "+ inv.getInvName()+", "+ inv.getQuantity()+", "+ inv.getPrice()+ ", "+inv.getDate()+"\n");
            
        //     if (inv.getInvCode().equals(inventory.getInvCode())){
        //         System.out.println("Existed");
        //     }
            
        // }  
              
    //    Kitchen kitchen = new Kitchen();
    //    kitchen.Main();
    }
}
