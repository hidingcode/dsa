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
        // SortedArrayListInterface<Inventory> invList = new SortedArrayList<>();    
        
        // Inventory inventory = new Inventory<>();
        
        // invList.add(inventory.addNew(invList, inventory));
        // inventory.update(invList, inventory);

        // inventory.isExisted(invList);

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
}
