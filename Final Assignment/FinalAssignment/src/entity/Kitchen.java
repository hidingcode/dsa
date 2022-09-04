package entity;

import adt.LinkedStack;
import adt.StackInterface;


public class Kitchen {  
    StackInterface<Chef> chefShift = new LinkedStack<Chef>();
    
    public void GetOrder(){
        
    }
    
    public void ChangeOrderStatus(){

    }

    public void UpdateInventory(){ 

    }
    
    public void PunchIn(Chef chef){   
        chefShift.push(chef);
    }

    public boolean CheckChefAvaliability(){
        if(chefShift.isEmpty()){
            return false;
        }
        else{
            return true;
        }
    }
}
