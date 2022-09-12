package entity;

public class Customer<T> extends Account{
    private String phoneNo;
    private String address;

    public Customer(){

    }

    public Customer(String username, String password){
        super(username, password);
    }

    public Customer(int accountID, String username, String password, int access, String phoneNo, String address){
        super(accountID, username, password, access);
        this.phoneNo = phoneNo;
        this.address = address;
    }
    
    public String getPhoneNo(){
        return phoneNo;
    }

    public String getAddress(){
        return address;
    }
    
    public void setPhoneNo(String phoneNo){
        this.phoneNo = phoneNo;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    @Override
    public String toString(){
        return String.format("%-15s %-15s %-15s %-7s %-15s %-30s", getAccountID(), getUsername(), getPassword(), getAccess(), getPhoneNo(), getAddress());
    }
}
