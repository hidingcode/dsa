package control;

import entity.Account;
import entity.Customer;
import entity.Staff;
import adt.ArrayListInterface;
import adt.ArrayList;
import java.util.Scanner;

public class AccountControl {

    ArrayListInterface<Account> accList = new ArrayList<Account>();

    public void accountLists(){

        accList.add(new Staff(1001, "nengfu14", "nengfu14", 2, 201));
        accList.add(new Staff(1002, "quack", "quack", 2, 202));
        accList.add(new Customer(1003, "ctj", "ctj", 1, 123, 100, "GAY"));
        accList.add(new Customer(1004, "ykp", "ykp", 1, 123, 123, "GAY"));
        accList.add(new Customer(1005, "ywy", "ywy", 1, 123, 123, "GAY"));
    }
}