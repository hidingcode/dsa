package entity;

public class Customer extends Account{
    private int phoneNo;
    private int point;
    private String address;

    public Customer(String username, String password){
        super(username, password);
    }

    public Customer(int accountID, String username, String password, int access, int phoneNo, int point, String address){
        super(accountID, username, password, access);
        this.phoneNo = phoneNo;
        this.point = point;
        this.address = address;
    }
    
    public int getPhoneNo(){
        return phoneNo;
    }
    
    public int getPoint(){
        return point;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setPhoneNo(int phoneNo){
        this.phoneNo = phoneNo;
    }
    
    public void setPonit(int point){
        this.point = point;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    @Override
    public String toString(){
        return "None";
    }
}
