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
        UpdateChef();
    }
    
    public void UpdateInventory(){ 
        
    }
    
    public void MainUI(){
        System.out.println();
        System.out.println("Kitchen Module");
        System.out.println("1) Punch In\t2) Show Chef Shift\t3) Show Last Punch In\t4) Search");
        System.out.println();
        System.out.print("Option(Any Key To Exit Except 1,2,3,4) >> ");
    }

    public void Main(){
        MainUI();
        Scanner sc = new Scanner(System.in);
        String option = sc.next();
        switch(option){
            case "1":
                // Allow chef to punch in
                PunchInUI();
                break;
            case "2":
                // Allow chef to check the chef shift
                ShowChefShift();
                break;
            case "3":
                // Show last punch in chef information
                ShowLastPunchIn();
                break;
            case "4":
                SearchChefUI();
                break;     
            default:
                // Do nothing an end the program
        }
    }
    // Punch In User Interface
    public void PunchInUI(){
        // Receive chef ID
        System.out.print("Please enter your ID: ");
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        // Receive chef Name
        System.out.print("Please enter your Name: ");
        String name = sc.next();
        System.out.println();
        PunchIn(id, name);  
    }

    // Get chefID and chefName and push the information into the stack
    public void PunchIn(String chefID, String chefName){ 
        Chef newChef = new Chef(chefID, chefName); 
        chefShift.push(newChef);
        System.out.println("Punch In Succesfully");
        Main();   
    }
    // Show the Chef Shift
    public void ShowChefShift(){
        // If the chefShift is empty print "No Chef Avaliable"
        if(chefShift.isEmpty())
        {
            System.out.println("No Chef Avaliable");
        }
        else{
            // Loop through the stack with Iterator 
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

    // Search Chef User Interface (Search the chef with the punchInSequence)
    public void SearchChefUI(){
        System.out.println("The 'n' punch in chef");
        System.out.println();
        System.out.println("n: ");
        Scanner sc = new Scanner(System.in);
        int punchInSequence = sc.nextInt();
        // Get the result ChefID
        String resultChefID = SearchChef(punchInSequence).getChefID();
        // Get the result ChefName
        String resultChefName = SearchChef(punchInSequence).getChefName();
        System.out.println("The" + punchInSequence + "punch in chef");
        System.out.println();
        System.out.printf("%-10s %-15s\n","Chef ID","Chef Name");
        System.out.printf("%-10s %-15s\n",resultChefID,resultChefName);  
        Main();
    }

    public Chef SearchChef(int punchInSequence){
        return chefShift.searchFromPosition(chefShift.getNumberOfEntries()- punchInSequence);
    }
}
