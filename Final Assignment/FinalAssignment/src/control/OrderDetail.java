package control;

import adt.LinkedQueue;
import adt.LinkedQueueInterface;
import adt.ArrayList;
import adt.ArrayListInterface;
import entity.Menu;
import entity.Order;
import driver.driver;


import java.util.Iterator;
import java.util.Scanner;

public class OrderDetail {
    ArrayListInterface<Menu> menuList = new ArrayList<Menu>();
    ArrayListInterface<Order> orderList = new ArrayList<Order>();

    public void MenuList(){
        menuList.add(new Menu("M001","Black pepper Steak","Steak with black pepper","Inv001",45));
        menuList.add(new Menu("M002","Black pepper Pork","Pork with black pepper","Inv002", 45));
        menuList.add(new Menu("M003","Black pepper Lamb","Lamb with black pepper","Inv003", 45));
        menuList.add(new Menu("M004","Black pepper Fish","Fish with black pepper","Inv004",45));
        menuList.add(new Menu("M005","Mushroom Steak", "Steak with Mushroom sauce","Inv001", 45));
        menuList.add(new Menu("M006","Mushroom Pork","Pork with Mushroom sauce","Inv002", 45));
        menuList.add(new Menu("M007","Mushroom Lamb","Lamb with Mushroom sauce","Inv003",45));
        menuList.add(new Menu("M008","Mushroom Fish","Fish with Mushroom sauce","Inv004", 45));
        menuList.add(new Menu("M009","Raw Steak","Steak AND ITS RAW!!!!","Inv001", 45));
    }

    public void Ordering(){
        System.out.println("Order Your Food");
        System.out.println("Type in the MenuID: (example:M001)");
        System.out.println("'Y' to confirm order");
    }

    public void OrderList(){
        orderList.add(new Order("O001","",,))
    }

    public void Main(){
        MenuList();
        Iterator<Menu> menuIterator = menuList.getIterator();
        System.out.println("\nMenu List: ");
        System.out.printf("%-10s %-25s %-30s %-15s \n", "MenuID", "Name", "Description", "Price(RM)");
        while (menuIterator.hasNext()){
            Menu menu = menuIterator.next();
            System.out.printf("%-10s %-25s %-30s %-15.2f \n",menu.getMenuID(), menu.getMenuName(), menu.getMenuDesc(), menu.getMenuPrice());
        }
        Ordering();
        Scanner sc = new Scanner(System.in);
        String option = sc.next();
        switch(option){
            case "M001":
                
                
                break;
            case "M002":
               
                
                break;
            case "M003":
                
                
                break;
            case "M004":
                
                break;     
            default:
                
        }
    }


}
