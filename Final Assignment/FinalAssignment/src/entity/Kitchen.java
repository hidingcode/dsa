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
        while (chefIterator.hasNext()) {
            Chef chef = chefIterator.next();
            System.out.println(chef.getChefName());
        }
    }

    public boolean CheckLate(){
        if(chefShift.isEmpty()){
            System.out.println("There is no chef avaliable ");
            return false;
        }
        else{
            return true;
        }
    }
}
