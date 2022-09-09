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
        accList.add(new Staff(1001, "nengfu14", "nengfu14", 2, 201));
        accList.add(new Staff(1002, "quack", "quack", 2, 202));
        accList.add(new Customer(1003, "ctj", "ctj", 1, 123, "GAY"));
        accList.add(new Customer(1004, "ykp", "ykp", 1, 123,"GAY"));
        accList.add(new Customer(1005, "ywy", "ywy", 1, 123, "GAY"));
    
    }

    public String login(String logUsername, String logPassword){
        System.out.print("Login Details \n");
        System.out.print("Username: ");
        String loginUsername = input.nextLine();
        System.out.print("\nPassword: ");
        String loginPassword = input.nextLine();

        return null;
    }

    public String register(String regUsername, String regPassword, int regPhoneNo, String regAddress){
        System.out.print("Register Details \n");
        System.out.print("Username: ");
        String registerUsername = input.nextLine();
        System.out.print("\nPassword: ");
        String registerPassword = input.nextLine();
        System.out.print("\nPhone Number: ");
        int registerPhoneNo = input.nextInt();
        System.out.print("\nHome Addresses: ");
        String registerAddress = input.nextLine();

        return null;
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