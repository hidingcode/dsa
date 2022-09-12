package entity;

public class Account<T> {
    private int accountID;
    private String username;
    private String password;
    private int access;

    // Empty constructor
    Account(){

    }
    
    // For login
    Account(String username, String password){
        this.username = username;
        this.password = password;
    }

    // For register
    Account(int accountID, String username, String password, int access){
        this.accountID = accountID;
        this.username = username;
        this.password = password;
        this.access = access;
    }
    
    // getter and setter
    public int getAccountID(){
        return accountID;
    }
    
    // getter and setter
    public String getUsername(){
        return username;
    }
    
    // getter and setter
    public String getPassword(){
        return password;
    }
    
    // getter and setter
    public int getAccess(){
        return access;
    }
    
    // getter and setter
    public void setAccountID(int accountID){
        this.accountID = accountID;
    }
    
    // getter and setter
    public void setUsername(String username){
        this.username = username;
    }
    
    // getter and setter
    public void setPassword(String password){
        this.password = password;
    }
    
    // getter and setter
    public void setAccess(int access){
        this.access = access;
    }

    // Override the equals
    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return getAccountID() + getUsername() + getPassword() + getAccess() ;
    }
}
