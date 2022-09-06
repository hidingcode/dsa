// Lim Yong Chien
package entity;

import adt.LinkedStack;
import adt.StackInterface;
import java.util.Iterator;
import entity.Chef;

public class Kitchen {  
    StackInterface<Chef> chefShift = new LinkedStack<Chef>();
    
    public void GetOrder(){
        
    }
    
    public void UpdateInventory(){ 

    }
    
    public boolean PunchIn(String chefName, String chefID, String chefPosition){ 
        chefShift.push(new Chef(chefName, chefID, chefPosition));
        System.out.println("Punch In Succesfully");
        return true;
    }

    public void ShowChefShift(){
        Iterator<Chef> chefIterator = chefShift.getIterator();
        System.out.println("Chef Shift List");
        System.out.println();
        System.out.printf("%-10s %-15s %-10s\n","Chef ID","Employee Name","Position" );
        while (chefIterator.hasNext()) {
            Chef chef = chefIterator.next();
            System.out.printf("%-10s %-15s %-10s\n",chef.getChefName(),chef.getChefID(),chef.getChefPosition());
        }
    }

    public void CheckLastPunchIn(){
        if(chefShift.isEmpty()){
            System.out.println("Chef Shift is Empty ");
        }
        else{
            System.out.println(chefShift.peek().getChefID());    
        }
    }
}
