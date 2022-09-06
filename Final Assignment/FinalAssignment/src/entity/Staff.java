package entity;

public class Staff extends Account {
    private int staffID;
    
    Staff(){
        
    }
    
    Staff(String username, String password){
        super(username, password);
    }
    
    public int getStaffID(){
        return staffID;
    }
    
    public void setStaffID(int staffID){
        this.staffID = staffID;
    }
}
