package entity;

import java.time.LocalDate;

public class Inventory implements Comparable<Inventory>{ 
    private String invCode;
    private String invName;
    private int quantity;
    private double price;
    private LocalDate date = LocalDate.now();
    
    //An empty constructor allow create new empty inventory object
    public Inventory() {

    }
    
    //A preset constructor allow create new inventory object
    public Inventory(String invCode, String invName, int quantity, double price){
        this.invCode = invCode;
        this.invName = invName;
        this.quantity = quantity;
        this.price = price;
        this.date = LocalDate.now();
    }

    public int compareTo(Inventory inv) {
        return (this.invCode.compareTo(inv.invCode));
    }

    public String getInvCode(){
        return invCode;
    }

    public String getInvName(){
        return invName;
    }

    public int getQuantity(){
        return quantity;
    }

    public double getPrice(){
        return price;
    }

    public LocalDate getDate(){
        return date;
    }

    public void setInvCode(String invCode){
        this.invCode = invCode;
    }

    public void setInvName(String invName){
        this.invName = invName;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setDate(LocalDate date){
        this.date = date;
    }
}
