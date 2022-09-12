package driver;

import adt.SortedListInterface;
import adt.SortedList;

import control.StockControl;

import entity.Inventory;

import java.util.Iterator;
import java.util.Scanner;



public class inventoryDriver {
    public static void main(String[] args) {
        SortedListInterface<Inventory> invList = new SortedList<>();  
        StockControl stocks = new StockControl();

        Inventory inventory;
        Inventory stockoutInv = new Inventory("Inv004", "Fish", 25, 150);
        invList.add(inventory = new Inventory("Inv001", "Steak", 25, 230));
        invList.add(inventory = new Inventory("Inv002", "Pork", 25, 180));
        invList.add(inventory = new Inventory("Inv003", "Lamb", 25, 210));
        invList.add(inventory = new Inventory("Inv004", "Fish", 25, 150));
        invList.add(inventory = new Inventory("Inv005", "Bread", 25, 50));
        invList.add(inventory = new Inventory("Inv006", "Sugar", 25, 40)); 
        invList.add(inventory = new Inventory("Inv007", "Water", 25, 25)); 
        invList.add(inventory = new Inventory("Inv008", "Coke", 25, 35)); 
        invList.add(inventory = new Inventory("Inv009", "Salt", 25, 40)); 
        invList.add(inventory = new Inventory("Inv010", "Rice", 25, 400)); 
        stocks.outStock(invList, stockoutInv, stocks, true, 25);
        stocks.update(invList, inventory, false, 0, false);
        stocks.main(invList, inventory, stocks);

    }
}
