package entity;

public class Customer extends Account{
    private int phoneNo;
    private int point;
    private String address;
    
    Customer(){
        
    }
    
    Customer(String username, String password){
        super(username, password);
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
