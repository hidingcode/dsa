package entity;

import adt.LinkedStackList;
import java.time.LocalDate;

public class Inventory {
    private String chefName;
    private String chefID;
    private int quantity;
    private double price;
    private LocalTime checkInDate = LocalDate.now();
    private LocalTime checkOutDate = LocalDate.now();
    
    private SortedArrayList arrayList;
    
    public Inventory(){
        
    }
    
    public void GetOrder(){
        
    }
    
    public void UpdateInventory(){

    }
    
    public boolean PunchIn(String invCode, ){
        return true;
    }
    
    public boolean PunchOut(){
        return true;
    }
}
