package entity;

import adt.SortedArrayList;
import java.time.LocalDate;

public class Inventory implements Comparable{
    private String invCode;
    private String invName;
    private int quantity;
    private double price;
    private LocalDate date = LocalDate.now();
    
    public Inventory(String invCode){
        this.invCode = invCode;
        // this.invName = invName;
        // this.quantity = quantity;
        // this.price = price;
       
    }

    public String getInvCode(){
        return invCode;
    }
    
    public void update(){
       System.out.println("Update function");
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

    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }  
}
