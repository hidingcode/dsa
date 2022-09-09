// Lim Yong Chien
package control;

import adt.LinkedStack;
import adt.LinkedStackInterface;
import entity.Chef;

import java.util.Iterator;
import java.util.Scanner;

public class Kitchen {  
    LinkedStackInterface<Chef> chefShift = new LinkedStack<Chef>();
    
    public void GetOrder(){
        
    }
    
    public void UpdateInventory(){ 
        
    }
    
    public void Main(){
        System.out.println();
        System.out.println("Kitchen Module");
        System.out.println("1) Punch In\t2) Show Chef Shift\t3) Show Last Check In\t4) Search");
        System.out.println();
        System.out.print("Option(Any Key To Exit Except 1,2 and 3): ");
        Scanner sc = new Scanner(System.in);
        String option = sc.next();
        switch(option){
            case "1":
                // Allow chef to punch in
                PunchInMenu();
                break;
            case "2":
                // Allow chef to check the chef shift
                ShowChefShift();
                break;
            case "3":
                // Show last punch in chef information
                ShowLastPunchIn();
            case "4":
                System.out.println(SearchChef(1).getChefID());    
            default:
                // Do nothing an end the program
        }
    }

    public void PunchInMenu(){
        System.out.print("Please enter your ID: ");
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        System.out.print("Please enter your Name: ");
        String name = sc.next();
        System.out.println();
        PunchIn(id, name);  
    }

    public void PunchIn(String chefID, String chefName){ 
        Chef newChef = new Chef(chefID, chefName); 
        chefShift.push(newChef);
        System.out.println("Punch In Succesfully");
        Main();   
    }

    public void ShowChefShift(){
        if(chefShift.isEmpty())
        {
            System.out.println("No Chef Avaliable");
        }
        else{
            Iterator<Chef> chefIterator = chefShift.getIterator();
            System.out.println();
            System.out.println("Chef Shift List");
            System.out.println();
            System.out.printf("%-10s %-15s\n","Chef ID","Chef Name");
            while (chefIterator.hasNext()) {
            Chef chef = chefIterator.next();
            System.out.printf("%-10s %-15s\n",chef.getChefID(),chef.getChefName());
            }
        }
        Main();
    }
    // Show Last Punch In Chef
    public void ShowLastPunchIn(){
        // Check Chef Shift is empty or not?
        if(chefShift.isEmpty()){
            System.out.println("\nChef Shift is Empty ");
        }
        // Show Chef Information
        else{
            System.out.println("\nLast Punch In Chef");
            System.out.println();
            System.out.printf("%-10s %-15s\n","Chef ID","Chef Name");
            System.out.printf("%-10s %-15s\n",chefShift.peek().getChefID(),chefShift.peek().getChefName());    
        }
        Main();
    }
    // UpdateChef After Getting Order
    public void UpdateChef(){
         // Check Chef Shift is empty or not?
        if(chefShift.isEmpty()){
            System.out.println("Chef Shift is Empty ");
        }
        else{
            System.out.println("Chef assigned: " + chefShift.peek().getChefName());
            // Remoce chef from the stack
            chefShift.pop();
        }
    }

    public Chef SearchChef(int punchInSequence){
        int inversePosition = chefShift.getNumberOfEntries();
        return chefShift.searchFromPosition(punchInSequence - 1);
    }
}
