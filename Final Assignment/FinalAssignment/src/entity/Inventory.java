package entity;

import adt.SortedArrayList;
import java.time.LocalDate;

public class Inventory {
    private String invCode;
    private String invName;
    private int quantity;
    private double price;
    private LocalDate date = LocalDate.now();
    
    private SortedArrayList arrayList;
    
    public Inventory(){
        
    }
    
    public void update(){
        
    }
    
    public boolean reStock(String invCode, int quantity){
        return true;
    }
    
    public boolean addNew(String invCode){
        return true;
    }
    
    public String stockCheck(){
        return this.invCode;
    }
    
    public boolean isExisted(String addingStock){
        return true;
    }  
}
