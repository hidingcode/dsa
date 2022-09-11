package control;

import adt.LinkedQueue;
import adt.LinkedQueueInterface;
import entity.Menu;
import entity.Order;
import driver.driver;

import java.util.Iterator;
import java.util.Scanner;

public class OrderDetail {
    
    public void Ordering(){
        System.out.println();
        System.out.println("Order Your Food");
        System.out.println("Type in the MenuID: (example:M001)");
        System.out.println();
        System.out.print("Option(Any Key To Exit Except 1,2,3,4) >> ");
    }

    public void main(Menu Menu,OrderDetail Order){
        Ordering();
        Scanner sc = new Scanner(System.in);
        String option = sc.next();
        switch(option){
            case "M001":
                Menu.menuOrder(MenuID, MenuName, price);
                
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
