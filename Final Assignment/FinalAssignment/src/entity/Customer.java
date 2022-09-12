package entity;

public class Customer<T> extends Account{
    private String phoneNo;
    private String address;

    // Empty constructor
    public Customer(){

    }

    // AccountControl used for login
    public Customer(String username, String password){
        super(username, password);
    }

    // AccountControl used for register
    public Customer(int accountID, String username, String password, int access, String phoneNo, String address){
        super(accountID, username, password, access);
        this.phoneNo = phoneNo;
        this.address = address;
    }
    
    // getter and setter
    public String getPhoneNo(){
        return phoneNo;
    }

    // getter and setter
    public String getAddress(){
        return address;
    }
    
    // getter and setter
    public void setPhoneNo(String phoneNo){
        this.phoneNo = phoneNo;
    }
    
    // getter and setter
    public void setAddress(String address){
        this.address = address;
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
        return String.format("%-15s %-15s %-15s %-7s %-15s %-30s", getAccountID(), getUsername(), getPassword(), getAccess(), getPhoneNo(), getAddress());
    }
}
