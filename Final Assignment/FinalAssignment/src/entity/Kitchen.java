package entity;

import adt.LinkedStack;
import java.time.LocalTime;

public class Inventory {
    private String chefName;
    private String chefID;
    private int quantity;
    private double price;
    private LocalTime checkInDate = LocalDate.now();
    private LocalTime checkOutDate = LocalDate.now();
    
    private LinkedStack arrayList;
        
    public void GetOrder(){
        
    }
    
    public void UpdateInventory(){

    }
    
    public boolean PunchIn(){
        return true;
    }
    
    public boolean PunchOut(){
        return true;
    }
}
