package control;

import adt.LinkedQueue;
import adt.LinkedQueueInterface;
import adt.ArrayList;
import adt.ArrayListInterface;
import entity.Menu;
import entity.Order;
import adt.SortedList;
import adt.SortedListInterface;
import entity.Inventory;

import java.util.Iterator;
import java.util.Scanner;

public class OrderDetail {
    private double Price = 0;

    public class Queue {
        int SIZE = 10;
        int items[] = new int[SIZE];
        int front, rear;

        boolean isFull() {
            if (front == 0 && rear == SIZE - 1) {
            return true;
            }
            return false;
        }

        boolean isEmpty() {
            if (front == -1)
            return true;
            else
            return false;
        }

        void enQueue(int element) {
            if (isFull()) {
                System.out.println("Queue is full");
            } else {
                if (front == -1)
                front = 0;
                rear++;
                items[rear] = element;
                System.out.println("Inserted " + element);
            }
        }

        int deQueue() {
            int element;
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return (-1);
            } else {
                element = items[front];
                if (front >= rear) {
                front = -1;
                rear = -1;
                } /* Q has only one element, so we reset the queue after deleting it. */
                else {
                    front++;
                }
                System.out.println("Deleted -> " + element);
                return (element);
            }
        }
        void display() {
            /* Function to display elements of Queue */
            int i;
            if (isEmpty()) {
            System.out.println("Empty Queue");
            } else {
            System.out.println("\nFront index-> " + front);
            System.out.println("Items -> ");
            for (i = front; i <= rear; i++)
                System.out.print(items[i] + "  ");
        
            System.out.println("\nRear index-> " + rear);
            }
        }
    }

    public double getCalc_Total(){
        return Price;
    }

    public void setCalc_Total(double menuprice){
        this.Price += menuprice;
    }

    public void MenuList(ArrayListInterface<Menu> menuList, SortedListInterface<Inventory> invList){
        menuList.add(new Menu("M001","Black pepper Steak","Steak with black pepper","Inv001",19, 0, false));
        menuList.add(new Menu("M002","Black pepper Pork","Pork with black pepper","Inv002", 19, 0, false));
        menuList.add(new Menu("M003","Black pepper Lamb","Lamb with black pepper","Inv003", 19, 0, false));
        menuList.add(new Menu("M004","Black pepper Fish","Fish with black pepper","Inv004",19, 0, false));
        menuList.add(new Menu("M005","Mushroom Steak", "Steak with Mushroom sauce","Inv001", 19, 0, false));
        menuList.add(new Menu("M006","Mushroom Pork","Pork with Mushroom sauce","Inv002", 19, 0, false));
        menuList.add(new Menu("M007","Mushroom Lamb","Lamb with Mushroom sauce","Inv003",19, 0, false));
        menuList.add(new Menu("M008","Mushroom Fish","Fish with Mushroom sauce","Inv004", 19, 0, false));
        menuList.add(new Menu("M009","Raw Steak","Steak AND ITS Fuking RAW!!!!","Inv001", 19, 0, false));
        
        Iterator<Inventory> InvIterator = invList.getIterator();
        int num = 0;
        while (InvIterator.hasNext()){
            Inventory inv = InvIterator.next(); 
            Iterator<Menu> menuIterator = menuList.getIterator();
            while (menuIterator.hasNext()){
                Menu menu = menuIterator.next();
                if (inv.getInvCode().equals(menu.getInvCode())){
                    if (inv.getQuantity() > 1){
                        menu.setQty(inv.getQuantity());
                        menu.setStatus(true);
                    }
                }
            }
        }
    }

    public void Ordering(ArrayListInterface<Menu> menuList, ArrayListInterface<Order> orderList, char orderProceed){
        Iterator<Menu> menuIterator = menuList.getIterator();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Order Your Food");
            System.out.print("Type in the MenuID(example:M001): ");
            String MenuID = sc.next();
            while (menuIterator.hasNext()){
                Menu menu = menuIterator.next();
                if(menu.getMenuID().equals(MenuID)){
                    setCalc_Total(menu.getMenuPrice());
                    orderList.add(new Order(menu.getMenuID(),menu.getMenuPrice(), getCalc_Total()));
                }
            }
            orderProceed = 'q';
        }while(orderProceed == 'y');
        
    }

    public void OrderList(ArrayListInterface<Menu> menuList, ArrayListInterface<Order> orderList){
        Iterator<Order> menuIterator = orderList.getIterator();
        Order tempOrder = new Order();
        System.out.printf("%-10s %-15s\n", "MenuID", "Price(RM)");
        while (menuIterator.hasNext()){
            Order order = menuIterator.next();
            tempOrder = new Order(order.getMenuID(), order.getPrice(), getCalc_Total());
            System.out.printf("%-10s %-15.2f\n", tempOrder.getMenuID(), tempOrder.getPrice());
        }
        System.out.printf("Total Price (RM): %.2f", tempOrder.getTotalPrice());
        System.out.println();
    }

    public void Main(ArrayListInterface<Menu> menuList, ArrayListInterface<Order> orderList, SortedListInterface<Inventory> invList){
        MenuList(menuList, invList);
        Iterator<Menu> menuIterator = menuList.getIterator();
        System.out.println("\nMenu List: ");
        System.out.printf("%-10s %-25s %-30s %-15s %-15s %-25s\n", "MenuID", "Name", "Description", "Price(RM)", "Quantity", "Availability");
        while (menuIterator.hasNext()){
            Menu menu = menuIterator.next();
            System.out.printf("%-10s %-25s %-30s %-15.2f %-15d %-25s\n",menu.getMenuID(), menu.getMenuName(), menu.getMenuDesc(), menu.getMenuPrice(), menu.getQty(), menu.getStatus());
        }
        Order ordering = new Order();

        Scanner ui = new Scanner(System.in);
        char proceedOrder = 'y';
        do{
            Ordering(menuList, orderList, proceedOrder);
            System.out.println("If you want to continue order key in 'y', else 'q' to quit");
            proceedOrder = ui.next().charAt(0);
        } while(proceedOrder == 'y');

        OrderList(menuList, orderList);

        Queue q = new Queue();

        // deQueue is not possible on empty queue
        q.deQueue();

        // enQueue 5 elements
        q.enQueue(001);
        q.enQueue(002);
        q.enQueue(003);
        q.enQueue(004);
        q.enQueue(005);

        // 6th element can't be added to because the queue is full
        q.enQueue(6);

        q.display();

        // deQueue removes element entered first i.e. 1
        q.deQueue();

        // Now we have just 4 elements
        q.display();
        
    }
}
