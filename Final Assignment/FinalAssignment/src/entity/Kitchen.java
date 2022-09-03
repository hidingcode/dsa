package entity;

import adt.LinkedStack;
import adt.StackInterface;


public class Kitchen {  
    StackInterface<Chef> chefShift = new LinkedStack<Chef>();
    
    public void GetOrder(){
        
    }
    
    public void DisplayOrderStatus(){

    }
    
    public void UpdateInventory(){ 

    }
    
    public void PunchIn(Chef chef){   
        chefShift.push(chef);
    }

}
