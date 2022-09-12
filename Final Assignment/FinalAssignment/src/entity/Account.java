package entity;

import java.util.Scanner;

public class Account {
    private int accountID;
    private String username;
    private String password;
    private int access;
    
    Scanner input = new Scanner(System.in);

    Account(){

    }
    
    Account(String username, String password){
        this.username = username;
        this.password = password;
    }

    Account(int accountID, String username, String password, int access){
        this.accountID = accountID;
        this.username = username;
        this.password = password;
        this.access = access;
    }
    
    public int getAccountID(){
        return accountID;
    }
    
    public String getUsername(){
        return username;
    }
    
    public String getPassword(){
        return password;
    }
    
    public int getAccess(){
        return access;
    }
    
    public void setAccountID(int accountID){
        this.accountID = accountID;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public void setAccess(int access){
        this.access = access;
    }

    @Override
    public String toString(){
        return getAccountID() + getUsername() + getPassword() + getAccess() ;
    }
}
