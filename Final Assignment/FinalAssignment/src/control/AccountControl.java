// package control;

// import entity.Account;
// import entity.Customer;
// import entity.Staff;
// import adt.ArrayListInterface;
// import adt.ArrayList;

// import adt.SortedArrayListInterface;
// import adt.SortedArrayList;
// import entity.Inventory;

// import java.util.Scanner;
// import java.util.Iterator;

// public class AccountControl {

//     Scanner input = new Scanner(System.in);

//     ArrayListInterface<Customer> clogList = new ArrayList<Customer>();
//     ArrayListInterface<Staff> slogList = new ArrayList<Staff>();

//     public void main(Staff staff, Customer customer, ArrayListInterface<Staff> staffList, ArrayListInterface<Customer> cusList, ArrayListInterface<Customer> clogList, ArrayListInterface<Staff> slogList){
//         System.out.println("(1) Login \n"
//                         +  "(2) Register ");
//         System.out.println("---------------------------------");
//         System.out.print("Enter the number to proceed: ");
//         int log = input.nextInt();
//         switch(log){
//             case 1:
//                 login(staff, customer, staffList, cusList, clogList, slogList);
//                 break;
//             case 2:
//                 register(customer, cusList); 
//                 break;
//             case 3:
//                 Iterator<Customer> cusIterator = cusList.getIterator();
//                 Iterator<Staff> staffIterator = staffList.getIterator();

//                 // display all users account
//                 while(cusIterator.hasNext()){
//                     Customer clogList = cusIterator.next();
//                     clogList.add(customer = new Customer<>(cusList.getUsername(), cusList.getPassword()));
//                     System.out.println(clogList.getUsername());
//                 }   
//                 while(staffIterator.hasNext()){
//                     Staff slogList = staffIterator.next();
//                     slogList.add(staff = new Staff<>(staffList.getUsername(), staffList.getPassword()));
                    
//                 }        
//                 break;
//         }
//     }

//     // isEmpty
//     public void login(Staff staff, Customer customer, ArrayListInterface<Staff> staffList, ArrayListInterface<Customer> cusList, ArrayListInterface<Customer> clogList, ArrayListInterface<Staff> slogList){
//         System.out.print("[--- Login Details ---]\n");
//         System.out.print("\nUsername: ");
//         String loginUsername = input.next();
//         System.out.print("Password: ");
//         String loginPassword = input.next();

//         if(loginUsername.isEmpty() || loginPassword.isEmpty()){
//             System.out.println("Please enter your username and password!");
//             login(staff, customer, staffList, cusList, clogList, slogList);
//         } else {
//             System.out.println("Login Successfully!");
//         }
//     }

//     // add // getEntry // isEmpty
//     public boolean register(Customer customer, ArrayListInterface<Customer> cusList){
//         System.out.print("[--- Register Details ---]\n");
//         int registerAccID = 0;
//         int registerAccess = 1;
//         System.out.print("Username: ");
//         String registerUsername = input.next();
//         System.out.print("Password: ");
//         String registerPassword = input.next();
//         System.out.print("Phone Number: ");
//         int registerPhoneNo = input.nextInt();
//         System.out.print("Home Address: ");
//         String registerAddress = input.next();

//         System.out.println("\nRegister Successfully!");
//         return (cusList.add(customer = new Customer<>(registerAccID, registerUsername, registerPassword, registerAccess, registerPhoneNo, registerAddress)));
//     }    

//     // getEntry
//     public String userProfile(Customer customer, ArrayListInterface<Customer> cusList, int accID, int accAccess){
//         // display the users accountID array except accountID and account access

//         System.out.println("(1) Edit Username \n"
//                         +  "(2) Edit Password \n"
//                         +  "(3) Edit Phone Number\n"
//                         +  "(4) Edit Home Address \n");
//         System.out.print("Enter your choice: ");
//         int choice = input.nextInt();

//         // account.edit(choice, ?) 
//         // display the lastest users account information

//         return null;
//     }

//     // Staff edit users account by remove and add back to the position
//     // Staff can view all users account
//     public String accountDB(Staff staff, Customer customer, ArrayListInterface<Staff> staffList, ArrayListInterface<Customer> cusList, int validAccountID, int validStaffID, int validAccAccess){
//         Iterator<Customer> cusIterator = cusList.getIterator();

//         // display all users account
//         while(cusIterator.hasNext()){
//             Customer customerList = cusIterator.next();
//             System.out.println(customerList.getUsername());
//         }     
//         // display all staff account

//         return null;
//     }

//     // clear all account
//     public void logout(){
//         // account.clear();
//     }

//     // public void update(ArrayListInterface<Account> accList, SortedArrayListInterface<Account> invList){
//     //     Iterator<Account> accIterator = invList.getIterator();
//     //     while(accIterator.hasNext()){
//     //         Account acc = accIterator.next();
//     //         System.out.println(acc.getUsername());
//     //     }
//     // }
// }