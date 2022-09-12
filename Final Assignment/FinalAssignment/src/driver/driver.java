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

        //OrderDetail orderDetail = new OrderDetail();
        //orderDetail.Main();
        

        OrderDetail orderDetail = new OrderDetail();
        orderDetail.Main();


        // SortedListInterface<Inventory> invList = new SortedList<>();   

        // ArrayListInterface<Menu> menuList = new ArrayList<Menu>();
        // ArrayListInterface<Order> orderList = new ArrayList<Order>();
        // SortedListInterface<Inventory> invList = new SortedList<>();  

        // Inventory inventory;
        // StockControl stocks = new StockControl();
        // invList.add(inventory = new Inventory("Inv001", "Steak", 25, 100));
        // invList.add(inventory = new Inventory("Inv002", "Pork", 25, 80));
        // invList.add(inventory = new Inventory("Inv003", "Lamb", 25, 90));
        // invList.add(inventory = new Inventory("Inv004", "Fish", 25, 70));
        // invList.add(inventory = new Inventory("Inv005", "Bread", 25, 50));
        // invList.add(inventory = new Inventory("Inv006", "Sugar", 25, 30)); 
        // // stocks.update(invList, inventory, false, 0, false);
        // // stocks.main(invList, inventory, stocks);

        // OrderDetail orderDetail = new OrderDetail();
        // orderDetail.Main(menuList, orderList, invList);


        // StockControl stocks = new StockControl();
        // Inventory inventory2 = new Inventory("Inv004", "Fish", 25, 100);
        // stocks.outStock(invList, inventory2, stocks, true, 25);

        // stocks.main(invList, inventory, stocks);
        //stocks.main(invList, inventory, stocks);

        



        ArrayListInterface<Customer> cusList = new ArrayList<>();
        ArrayListInterface<Staff> staffList = new ArrayList<>();
        Staff staff;
        Customer customer;
        staffList.add(staff = new Staff(1, "waimin", "waimin", 2, 201));
        staffList.add(staff = new Staff(2, "quack", "quack", 2, 202));
        cusList.add(customer = new Customer(1, "nengfu14", "nengfu14", 1, "1234567890", "GAY"));
        cusList.add(customer = new Customer(2, "YKP", "YKP", 1, "1234567890", "GAY2"));
        cusList.add(customer = new Customer(3, "Pikachu", "Pikachu", 1, "1234567890", "GAY3"));
        cusList.add(customer = new Customer(4, "YWY", "YWY", 1, "1234567890", "GAY4"));
        AccountControl accControl = new AccountControl();
        accControl.main(staff, customer, staffList, cusList);

        Kitchen kitchen = new Kitchen();
        kitchen.Main();      
    }
}
