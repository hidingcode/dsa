package driver;

import adt.SortedListInterface;
import adt.SortedList;
import adt.StackInterface;
import adt.Stack;
import adt.ArrayListInterface;
import adt.ArrayList;
import adt.LinkedQueue;
import adt.LinkedQueueInterface;

import entity.Chef;
import entity.Inventory;
import entity.Account;
import entity.Customer;
import entity.Staff;
import entity.Menu;
import entity.Order;

import java.util.Iterator;
import java.util.Scanner;

import control.Kitchen;
import control.AccountControl;
import control.StockControl;
import control.OrderDetail;

public class driver {
    public static void main(String[] args) {
        ArrayListInterface<Menu> menuList = new ArrayList<Menu>();
        ArrayListInterface<Order> orderList = new ArrayList<Order>();
        SortedListInterface<Inventory> invList = new SortedList<>();  
        // Inventory inventory;
        // StockControl stocks = new StockControl();
        // invList.add(inventory = new Inventory("Inv001", "Steak", 25, 230));
        // invList.add(inventory = new Inventory("Inv002", "Pork", 25, 180));
        // invList.add(inventory = new Inventory("Inv003", "Lamb", 25, 210));
        // invList.add(inventory = new Inventory("Inv004", "Fish", 25, 150));
        // invList.add(inventory = new Inventory("Inv005", "Bread", 25, 50));
        // invList.add(inventory = new Inventory("Inv006", "Sugar", 25, 40)); 
        // invList.add(inventory = new Inventory("Inv007", "Water", 25, 25)); 
        // invList.add(inventory = new Inventory("Inv008", "Coke", 25, 35)); 
        // invList.add(inventory = new Inventory("Inv009", "Salt", 25, 40)); 
        // stocks.update(invList, inventory, false, 0, false);
        // stocks.main(invList, inventory, stocks);

        //OrderDetail orderDetail = new OrderDetail();
        //orderDetail.Main(menuList, orderList, invList);


        // StockControl stocks = new StockControl();
        // Inventory inventory2 = new Inventory("Inv004", "Fish", 25, 100);
        // stocks.outStock(invList, inventory2, stocks, true, 25);
        
        // // Account        
        // ArrayListInterface<Staff> staffList = new ArrayList<>();
        // Staff staff;
        // staffList.add(staff = new Staff(1, "waimin", "waimin123", 2, 1));
        // staffList.add(staff = new Staff(2, "yanzhi", "yanzhi123", 2, 2));
        // staffList.add(staff = new Staff(3, "weiyuan", "weiyuan123", 2, 3));

        // ArrayListInterface<Customer> cusList = new ArrayList<>();
        // Customer customer;
        // cusList.add(customer = new Customer(1, "nengfu", "nengfu14", 1, "018-1234567", "KualaLumpur,Cheras"));
        // cusList.add(customer = new Customer(2, "tikjoe", "tikjoe14", 1, "019-1234567", "Selangor,Kepong"));
        // cusList.add(customer = new Customer(3, "yongchien", "yongchien14", 1, "013-1235896", "Penang,GeorgeTown"));
        // cusList.add(customer = new Customer(4, "xinnan", "xinnangay", 1, "015-1234567", "Perak,Ipoh"));
        
        // AccountControl accControl = new AccountControl();
        // accControl.main(staff, customer, staffList, cusList);

        //Kitchen kitchen = new Kitchen();
        // Punch In chef into the stack
        //kitchen.PunchIn("C0001", "ykp");
        //kitchen.PunchIn("C0002", "ywy");
        //kitchen.PunchIn("C0003", "ytl");
        //kitchen.PunchIn("C0004", "cxn");
        //kitchen.Main();      
    }
}
