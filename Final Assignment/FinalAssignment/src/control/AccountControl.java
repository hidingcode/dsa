package control;

import entity.Account;
import entity.Customer;
import entity.Staff;
import adt.ArrayListInterface;
import adt.ArrayList;

import adt.SortedArrayListInterface;
import adt.SortedArrayList;
import entity.Inventory;

import java.util.Scanner;
import java.util.Iterator;

public class AccountControl {

    Scanner input = new Scanner(System.in);

    ArrayListInterface<Customer> cusList = new ArrayList<Customer>();

    public void main(Staff staff, Customer customer, ArrayListInterface<Staff> staffList, ArrayListInterface<Customer> cusList){
        System.out.println("(1) Login \n"
                        +  "(2) Register \n");
        System.out.println("---------------------------------\n");
        System.out.print("Enter the number to proceed: ");
        int log = input.nextInt();
        switch(log){
            case 1:
                loginProcess(staff, customer, staffList, cusList);
                break;
            case 2:
                register(customer, cusList); 
                // while(cusIterator.hasNext()){
                //     Customer customerList = cusIterator.next();
                //     // System.out.println(customerList.getUsername());
                //     if(cusIterator.hasNext()){
                //         System.out.println(customerList.getUsername());
                //     }
                // }
                break;
            case 3:
                Iterator<Customer> cusIterator = cusList.getIterator();
                System.out.print("getEntry: ");
                System.out.print(cusList.getEntry(cusList.getNumberOfEntries()).getAccountID());

                // while(cusIterator.hasNext()){
                //     Customer customerList = cusIterator.next();
                    
                //     System.out.println("\n" + customerList.getUsername());
                // }
                break;
        }
    }

    // isEmpty
    public void loginProcess(Staff staff, Customer customer, ArrayListInterface<Staff> staffList, ArrayListInterface<Customer> cusList){
        System.out.print("[--- Login Details ---]");
        System.out.print("\nUsername: ");
        String loginUsername = input.nextLine();
        System.out.print("\nPassword: ");
        String loginPassword = input.nextLine();

        // // contains // getEntry
        // if(loginUsername && loginPassword != /*accDB */){
        //     System.out.println("Username or Password Error, Please Try Agian!");
        //     loginProcess();
        // } else {
        //     login(loginUsername, loginPassword);
        // }
        
    }

    public void login(String logUsername, String logPassword){
        // get accID and access

        // // check isStaff or isCustomer
        // switch(accessType){
        //     case 1: // Customer
        //         // to menu page
        //         break;
        //     case 2: // Staff
        //         accountDB(int getAccID, int getStaffID, int getAccAccess);
        //         break;
        // }

    }

    // add // getEntry // isEmpty
    public boolean register(Customer customer, ArrayListInterface<Customer> cusList){
        System.out.print("[--- Register Details ---]\n");
        int registerAccID = 0;
        int registerAccess = 1;
        System.out.print("Username: ");
        String registerUsername = input.next();
        System.out.print("\nPassword: ");
        String registerPassword = input.next();
        System.out.print("\nPhone Number: ");
        int registerPhoneNo = input.nextInt();
        System.out.print("\nHome Address: ");
        String registerAddress = input.next();

        System.out.println("\nRegister Successfully!");

        return (cusList.add(customer = new Customer<>(registerAccID, registerUsername, registerPassword, registerAccess, registerPhoneNo, registerAddress)));
    }    

    // getEntry
    public String userProfile(Customer customer, ArrayListInterface<Customer> cusList, int accID, int accAccess){
        // display the users accountID array except accountID and account access

        System.out.println("(1) Edit Username \n"
                        +  "(2) Edit Password \n"
                        +  "(3) Edit Phone Number\n"
                        +  "(4) Edit Home Address \n");
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        // account.edit(choice, ?) 
        // display the lastest users account information

        return null;
    }

    // Staff edit users account by remove and add back to the position
    // Staff can view all users account
    public String accountDB(Staff staff, Customer customer, ArrayListInterface<Staff> staffList, ArrayListInterface<Customer> cusList, int validAccountID, int validStaffID, int validAccAccess){
        Iterator<Customer> cusIterator = cusList.getIterator();

        // display all users account
        while(cusIterator.hasNext()){
            Customer customerList = cusIterator.next();
            System.out.println(customerList.getUsername());
        }     
        // display all staff account

        return null;
    }

    // clear all account
    public void logout(){
        // account.clear();
    }

    // public void update(ArrayListInterface<Account> accList, SortedArrayListInterface<Account> invList){
    //     Iterator<Account> accIterator = invList.getIterator();
    //     while(accIterator.hasNext()){
    //         Account acc = accIterator.next();
    //         System.out.println(acc.getUsername());
    //     }
    // }
}