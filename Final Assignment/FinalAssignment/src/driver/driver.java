package driver;

import adt.LinkedStackInterface;
import adt.SortedArrayListInterface;
import control.Kitchen;
import adt.SortedArrayList;
import java.util.Iterator;
import adt.LinkedStack;

import entity.Chef;
import entity.Inventory;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class driver {
    public static void main(String[] args) {
        // SortedArrayListInterface<Inventory> invList = new SortedArrayList<>();   
        // Inventory inventory;
        // invList.add(inventory = new Inventory("Inv001", "Steak", 25, 100));
        // invList.add(inventory = new Inventory("Inv002", "Pork", 25, 80));
        // invList.add(inventory = new Inventory("Inv003", "Lamb", 25, 90));
        // invList.add(inventory = new Inventory("Inv004", "Fish", 25, 70));
        // invList.add(inventory = new Inventory("Inv005", "Bread", 25, 50));
        // invList.add(inventory = new Inventory("Inv006", "Sugar", 25, 30));
        // inventory.main(invList, inventory);

        Kitchen kitchen = new Kitchen();
        kitchen.Main();
    }
}
