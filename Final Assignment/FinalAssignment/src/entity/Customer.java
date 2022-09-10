package entity;

public class Customer<T> extends Account{
    private int phoneNo;
    private int point;
    private String address;

    public Customer(){

    }

    public Customer(String username, String password){
        super(username, password);
    }

    public Customer(int accountID, String username, String password, int access, int phoneNo, String address){
        super(accountID, username, password, access);
        this.phoneNo = phoneNo;
        this.address = address;
    }
    
    public int getPhoneNo(){
        return phoneNo;
    }

    public String getAddress(){
        return address;
    }
    
    public void setPhoneNo(int phoneNo){
        this.phoneNo = phoneNo;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    @Override
    public String toString(){
        return "None";
    }
}
