package control;

import entity.Account;
import entity.Customer;
import entity.Staff;
import adt.ArrayListInterface;
import adt.ArrayList;
import java.util.Scanner;

public class AccountControl {

    Scanner input = new Scanner(System.in);

    ArrayListInterface<Account> accList = new ArrayList<Account>();

    public void main(){
        System.out.println("(1) Login \n"
                        +  "(2) Register \n");
        System.out.println("---------------------------------\n");
        System.out.println("Enter the number to proceed: ");
        int log = input.nextInt();
        switch(log){
            case 1:
                loginProcess();
                break;
            // case 2:
            //     register(acclist, account); 
            //     acclist.add(account);
            //     break;
        }
    }

    // isEmpty
    public void loginProcess(){
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
    public void registerProcess(){
        System.out.print("[--- Register Details ---]");
        int registerAccID = 0;
        int registerAccess = 1;
        System.out.print("\nUsername: ");
        String registerUsername = input.nextLine();
        System.out.print("\nPassword: ");
        String registerPassword = input.nextLine();
        System.out.print("\nPhone Number: ");
        int registerPhoneNo = input.nextInt();
        System.out.print("\nHome Address: ");
        String registerAddress = input.nextLine();

        register(registerAccID, registerUsername, registerPassword, registerAccess, registerPhoneNo, registerAddress);
    }    

    public String register(int regAccID, String regUsername, String regPassword, int regAccess, int regPhoneNo, String regAddress){
        System.out.println("Register Successfully!");

        return null;// (account = new AccountControl<>(registerUsername, registerPassword, registerPhoneNo, registerAddress));
    }

    // getEntry
    public String userProfile(int accID, int accAccess){
        // display the users accountID array except accountID and account access

        System.out.println("(1) Edit Username \n"
                        +  "(2) Edit Password \n"
                        +  "(3) Edit Phone Number\n"
                        +  "(4) Edit Home Address \n");
        System.out.println("Enter your choice: ");
        int choice = input.nextInt();

        // account.edit(choice, ?) 
        // display the lastest users account information

        return null;
    }

    // Staff edit users account by remove and add back to the position
    // Staff can view all users account
    public String accountDB(int validAccountID, int validStaffID, int validAccAccess){
        // display all users account list

        return null;
    }

    // clear all account
    public void logout(){
        // account.clear();
    }
}