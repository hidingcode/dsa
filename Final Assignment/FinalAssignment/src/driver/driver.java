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
        // hello???
        // SortedArrayListInterface<Inventory> invList = new SortedArrayList<>();    
        
        // Inventory inventory = new Inventory<>();
        
        // invList.add(inventory.addNew(invList, inventory));
        // inventory.update(invList, inventory);

        // inventory.isExisted(invList);

        StackInterface<Chef> chefShift = new LinkedStack<>();
        
        Kitchen kitchen = new Kitchen();

        kitchen.PunchIn("ykp", "C123", "Noob");
        kitchen.PunchIn("ywy", "C123", "Noob");

        Iterator<Chef> chefIterator = chefShift.getIterator();
        System.out.printf("%-10s %-15s %-10s\n","Chef ID","Employee Name","Salary" );
        while (chefIterator.hasNext()) {
            Chef chef = chefIterator.next();
            System.out.println(chef.getChefName() + chef.getChefID() +chef.getChefPosition());
        }













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

}
