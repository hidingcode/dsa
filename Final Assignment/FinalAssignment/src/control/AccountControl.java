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
    public void loginProcess(){
        System.out.print("[--- Login Details ---]");
        System.out.print("\nUsername: ");
        String loginUsername = input.nextLine();
        System.out.print("\nPassword: ");
        String loginPassword = input.nextLine();

        login(loginUsername, loginPassword);
    }

    public void login(String logUsername, String logPassword){

    }

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
        System.out.print("\nHome Addresses: ");
        String registerAddress = input.nextLine();

        register(registerAccID, registerUsername, registerPassword, registerAccess, registerPhoneNo, registerAddress);
    }    

    public String register(int regAccID, String regUsername, String regPassword, int regAccess, int regPhoneNo, String regAddress){
        

        return null;// (account = new AccountControl<>(registerUsername, registerPassword, registerPhoneNo, registerAddress));
    }

    public String userProfile(int accID, int accAccess){

        return null;
    }

    public String accountDB(int validAccountID, int validStaffID, int accAccess){

        return null;
    }

    public void logout(){

    }
}