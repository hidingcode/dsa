package control;

import entity.Account;
import entity.Customer;
import entity.Staff;
import adt.ArrayListInterface;
import adt.ArrayList;

import java.util.Scanner;
import java.util.Iterator;

public class AccountControl<T> {

    Scanner input = new Scanner(System.in);

    // first program to be execute to get input from user for login or register
    public void main(Staff staff, Customer customer, ArrayListInterface<Staff> staffList, ArrayListInterface<Customer> cusList){

        System.out.println("(1) Login \n"
                        +  "(2) Register ");
        System.out.println("---------------------------------");
        System.out.print("Enter the number to proceed: ");
        int log = input.nextInt();
        switch(log){
            case 1:
                // call login function
                login(staff, customer, staffList, cusList);
                break;
            case 2:
                // call register, then login function
                register(customer, cusList); 
                login(staff, customer, staffList, cusList);
                break;     
        }
    }

    // login 
    public void login(Staff staff, Customer customer, ArrayListInterface<Staff> staffList, ArrayListInterface<Customer> cusList){
        // declare and initialize
        int currentAccount = 0;
        String currUsername = "";
        String currPassword = "";
        String currPhoneNo = "";
        String currAddress = "";

        // get input from user
        System.out.print("\n[--- Login Details ---]\n");
        System.out.print("Username: ");
        String loginUsername = input.next();
        System.out.print("Password: ");
        String loginPassword = input.next();

        // call getIterator
        Iterator<Customer> cusIterator = cusList.getIterator();
        Iterator<Staff> staffIterator = staffList.getIterator();  

        // check isCustomer
        boolean cusAccount = false;
        while(cusIterator.hasNext()){
            Customer customerList = cusIterator.next();
            // if username and password are equals
            if(loginUsername.equals(customerList.getUsername())){
                if(loginPassword.equals(customerList.getPassword())){
                    // get the number of the account
                    currentAccount =  cusList.getIndexNumber(customerList) + 1;
                    
                    // use the number of the account to get all the account information from array list
                    currUsername = cusList.getEntry(currentAccount).getUsername();
                    currPassword = cusList.getEntry(currentAccount).getPassword();
                    currPhoneNo = cusList.getEntry(currentAccount).getPhoneNo();
                    currAddress = cusList.getEntry(currentAccount).getAddress();
                    cusAccount = true;
                }
            }
        }
        // check isStaff
        boolean staffAccount = false;
        while(staffIterator.hasNext()){   
            Staff staffsList = staffIterator.next();
            // if username and password are equals
            if(loginUsername.equals(staffsList.getUsername())){
                if(loginPassword.equals(staffsList.getPassword())){
                    staffAccount = true;
                }
            }
        }    
       
        // isCustomer
        if(cusAccount){
            System.out.println("Login Successfully!");
            // call the userProfile function
            userProfile(staff, customer, staffList, cusList, currentAccount, currUsername, currPassword, currPhoneNo, currAddress);
        // isStaff
        } else if (staffAccount) {
            System.out.println("Login Successfully!");
            // call the accountDB function
            accountDB(staff, customer, staffList, cusList);
        // Not customer and not staff print error message
        } else {
            System.out.println("Username or password error!");
            // call back to login function to re-login
            login(staff, customer, staffList, cusList);
        }
    }

    // register
    public void register(Customer customer, ArrayListInterface<Customer> cusList){
        Iterator<Customer> cusIterator = cusList.getIterator();

        System.out.print("[--- Register Details ---]\n");

        // get the last accountID number
        int registerAccID = cusList.getEntry(cusList.getNumberOfEntries()-1).getAccountID();
        registerAccID = registerAccID +1;
        registerAccID++;

        // get user input
        System.out.print("Username: ");
        String registerUsername = input.next();
        System.out.print("Password: ");
        String registerPassword = input.next();
        System.out.print("Phone Number: ");
        String registerPhoneNo = input.next();
        System.out.print("Home Address: ");
        String registerAddress = input.next();

        // check input is null
        if(registerUsername == null && registerPassword == null){
            System.out.println("Username or password are required!");
            // re-register
            register(customer, cusList);
        } 
        // add into arraylist 
        cusList.add(customer = new Customer<>(registerAccID, registerUsername, registerPassword, 1, registerPhoneNo, registerAddress));
        System.out.println("\nRegister Successfully!");
    }    

    // userProfile
    public void userProfile(Staff staff, Customer customer, ArrayListInterface<Staff> staffList, ArrayListInterface<Customer> cusList, int currAccount, String accUsername, String accPassword, String accPhoneNo, String accAddres){
        System.out.println("AccountID: " + currAccount);
        // display the users accountID array except accountID and account access
        System.out.println("\n[--- User Profile ---]");
        System.out.println("Username: " + accUsername +"\n"
                        +  "Password: " + accPassword +"\n"
                        +  "Phone Number: " + accPhoneNo +"\n"
                        +  "Home Address: " + accAddres +"\n"); 

        // option select for user to continue
        System.out.println("(1) Edit Profile\n" 
                        +  "(2) Logout");

        System.out.print("\nEnter: ");
        int profileChoice = input.nextInt();
        switch(profileChoice){
            // edit profile
            case 1:
                System.out.println("\n(1) Edit Username \n"
                +  "(2) Edit Password \n"
                +  "(3) Edit Phone Number\n"
                +  "(4) Edit Home Address \n");
                System.out.print("Enter your choice: ");
                int choice = input.nextInt();
        
                switch(choice){
                    // edit username and replace 
                    case 1:    
                        System.out.print("\nEnter new username: ");
                        String newUsername = input.next();
                        customer = new Customer(currAccount, newUsername, accPassword, 1, accPhoneNo, accAddres);
                        cusList.replace(currAccount, customer);
                        userProfile(staff, customer, staffList, cusList, currAccount, accUsername, accPassword, accPhoneNo, accAddres);
                        break;
                    // edit password and replace 
                    case 2:
                        System.out.print("\nEnter new password: ");
                        String newPassword = input.next();
                        customer = new Customer(currAccount, accUsername, newPassword, 1, accPhoneNo, accAddres);
                        cusList.replace(currAccount, customer);
                        userProfile(staff, customer, staffList, cusList, currAccount, accUsername, accPassword, accPhoneNo, accAddres);
                        break;
                    // edit phone number and replace 
                    case 3:
                        System.out.print("\nEnter new phone-number: ");
                        String newPhoneNo = input.next();
                        customer = new Customer(currAccount, accUsername, accPassword, 1, newPhoneNo, accAddres);
                        cusList.replace(currAccount, customer);
                        userProfile(staff, customer, staffList, cusList, currAccount, accUsername, accPassword, accPhoneNo, accAddres);
                        break;
                    // edit home address and replace 
                    case 4:
                        System.out.print("\nEnter new home-address: ");
                        String newAddress = input.next();
                        customer = new Customer(currAccount, accUsername, accPassword, 1, accPhoneNo, newAddress);
                        cusList.replace(currAccount, customer);
                        userProfile(staff, customer, staffList, cusList, currAccount, accUsername, accPassword, accPhoneNo, accAddres);
                        break;
                }
                break;
            case 2:
                // call logout function
                logout(staff, customer, staffList, cusList);
                break;
        }
    }

    // Staff edit users account by remove and add back to the position
    // Staff can view all users account
    // accountDB
    public void accountDB(Staff staff, Customer customer, ArrayListInterface<Staff> staffList, ArrayListInterface<Customer> cusList){
        int staffDecision = 0;

        // option select for staff
        System.out.println("\n(1) User List\n" 
                         + "(2) Staff List");

        System.out.print("\nEnter: ");
        int staffChoice = input.nextInt();

        switch(staffChoice){
            // view all user list
            case 1:
                System.out.println("[--- User List ---]\n");
                System.out.println("Account-ID\tUsername\tPassword\tAccess\tPhone-Number\tHome-Address");
                cusList.getAllEntry();
                System.out.println("\n(1) Edit\n"
                +  "(2) Remove\n"
                +  "(3) Add");
                System.out.print("\nEnter: ");
                staffDecision = input.nextInt();
                switch(staffDecision){
                    // edit selected user details
                    case 1:
                        System.out.print("\nAccount-ID: ");
                        int inputAccID = input.nextInt();
                        System.out.print("Current Username: " + cusList.getEntry(inputAccID).getUsername() 
                                        +  "New username: ");
                        String newUsername = input.next();
                        System.out.print("Current Password: " + cusList.getEntry(inputAccID).getPassword() 
                                        +  "New username: ");
                        String newPassword = input.next();
                        System.out.print("Current Phone-Number: " + cusList.getEntry(inputAccID).getPhoneNo() 
                                        +  "New username: ");
                        String newPhoneNo = input.next();
                        System.out.print("Current Home-Address: " + cusList.getEntry(inputAccID).getAddress() 
                                        +  "New username: ");
                        String newAddress = input.next();

                        customer = new Customer(inputAccID, newUsername, newPassword, 1, newPhoneNo, newAddress);                       
                        cusList.replace(inputAccID, customer);

                        System.out.println("[--- User List ---]\n");
                        System.out.println("Account-ID\tUsername\tPassword\tAccess\tPhone-Number\tHome-Address");
                        cusList.getAllEntry();
                        break;
                    // remove selected user from array list
                    case 2:
                        System.out.println("Select the account to remove: ");
                        int selectedAcc = input.nextInt();
                        cusList.remove(selectedAcc);
                        System.out.println();

                        System.out.println("[--- User List ---]\n");
                        System.out.println("Account-ID\tUsername\tPassword\tAccess\tPhone-Number\tHome-Address");
                        cusList.getAllEntry();
                        break;
                    // add new user into array list
                    case 3:
                        System.out.println("[--- Add new User Account ---]\n");
                        int cusAccID = cusList.getEntry(cusList.getNumberOfEntries()-1).getAccountID();
                        cusAccID = cusAccID +1;
                        cusAccID++;
                        System.out.print("Username: ");
                        String customerUsername = input.next();
                        System.out.print("Password: ");
                        String customerPassword = input.next();
                        System.out.print("Phone-Number: ");
                        String customerPhoneNo = input.next();
                        System.out.print("Home-Address: ");
                        String customerAddress = input.next();
                        cusList.add(customer = new Customer<>(cusAccID, customerUsername, customerPassword, 1, customerPhoneNo, customerAddress));

                        System.out.println("[--- User List ---]\n");
                        System.out.println("Account-ID\tUsername\tPassword\tAccess\tPhone-Number\tHome-Address");
                        cusList.getAllEntry();
                        break;
                    }
                break;
            // view all staff list
            case 2:
                System.out.println("[--- Staff List ---]\n");
                System.out.println("Account-ID\tUsername\tPassword\tAccess\tStaffID");
                staffList.getAllEntry();
                System.out.println("\n(1) Edit\n"
                +  "(2) Remove\n"
                +  "(3) Add");
                System.out.print("\nEnter: ");
                staffDecision = input.nextInt();
                switch(staffDecision){
                    // edit selected staff details
                    case 1:
                        System.out.print("Account-ID: ");
                        int inputAccID = input.nextInt();
                        System.out.print("Current Username: " + staffList.getEntry(inputAccID).getUsername() 
                                        +  "New username: ");
                        String newUsername = input.next();
                        System.out.print("Current Password: " + staffList.getEntry(inputAccID).getPassword() 
                                        +  "New username: ");
                        String newPassword = input.next();

                        staff = new Staff(inputAccID, newUsername, newPassword, staffList.getEntry(inputAccID).getAccess(), staffList.getEntry(inputAccID).getStaffID());
                        staffList.replace(inputAccID, staff);

                        System.out.println("[--- Staff List ---]\n");
                        System.out.println("Account-ID\tUsername\tPassword\tAccess\tStaffID\n");
                        staffList.getAllEntry();
                        break;
                    // remove selected staff from array list
                    case 2:
                        System.out.println("Select the account to remove: ");
                        int selectedAcc = input.nextInt();
                        staffList.remove(selectedAcc);

                        System.out.println("[--- Staff List ---]\n");
                        System.out.println("Account-ID\tUsername\tPassword\tAccess\tStaffID\n");
                        staffList.getAllEntry();
                        break;
                    // add new staff into array list
                    case 3:
                        System.out.println("\n[--- Add new Staff Account ---]\n");
                        int staffAccID = staffList.getEntry(staffList.getNumberOfEntries() - 1).getAccountID();
                        staffAccID = staffAccID +1;
                        staffAccID++;
                        int staffID = staffList.getEntry(staffList.getNumberOfEntries() - 1).getAccountID();
                        staffID = staffID +1;
                        staffID++;
                        System.out.print("Username: ");
                        String staffUsername = input.next();
                        System.out.print("Password: ");
                        String staffPassword = input.next();
                        staffList.add(staff = new Staff<>(staffAccID, staffUsername, staffPassword, 2, staffID));

                        System.out.println("[--- Staff List ---]\n");
                        System.out.println("Account-ID\tUsername\tPassword\tAccess\tStaffID\n");
                        staffList.getAllEntry();
                        break;
                    }
                break;
        }   
        // option select for staff after view list
        System.out.println("(1) Back to Account List\n" 
                        +  "(2) Logout");

        System.out.print("\nEnter: ");
        int staffPageChoice = input.nextInt();
        switch(staffPageChoice){
            case 1:
                // call back to accountDB function
                accountDB(staff, customer, staffList, cusList);
                break;
            case 2:
                // call back to login function
                login(staff, customer, staffList, cusList);
                break;
        }
        
    }   

    // logout
    public void logout(Staff staff, Customer customer, ArrayListInterface<Staff> staffList, ArrayListInterface<Customer> cusList){
        System.out.println("Back to Login Page.");
        // call back to login function
        login(staff, customer, staffList, cusList);
    }
}