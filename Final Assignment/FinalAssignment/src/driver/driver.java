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
        SortedArrayListInterface<Inventory> invList = new SortedArrayList<>();    
        Inventory inventory = new Inventory<>();
        Scanner input = new Scanner(System.in);
        System.out.print(
            "Do you want to add new inventory?\n"+
            "y = Yes, n = No\n"+
            "Enter your selection: (y/n)\n"
        );
        char cmd = input.next().charAt(0);
        
        do{
            while(cmd == 'y' || cmd == 'v'){
                switch(cmd){
                    case 'y': 
                        inventory = inventory.addNew(invList, inventory); 
                        invList.add(inventory);
                        
                        break;
                    case 'v': 
                        System.out.println("Latest list: ");
                        inventory.update(invList, inventory);
                        break;
                }
                System.out.print("Enter 'n' to quit add new inventory, 'y' to continue: , 'v' to view list");
                cmd = input.next().charAt(0);
            }
            

        }while(cmd != 'n');
        
        
        
        // invList.add(inventory.addNew(invList, inventory));
        // inventory.update(invList);
        // inventory.isExisted(invList, inventory);
//=======
        // Inventory inventory = new Inventory<>();
        
        // invList.add(inventory.addNew(invList, inventory));
        // inventory.update(invList, inventory);

        // inventory.isExisted(invList);

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

}
