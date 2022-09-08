package entity;

public class Staff extends Account {
    private int staffID;

    public Staff(int accountID, String username, String password, int access, int staffID){ 
        super(accountID, username, password, access);
        this.staffID = staffID;
    }
    
    public int getStaffID(){
        return staffID;
    }
    
    public void setStaffID(int staffID){
        this.staffID = staffID;
    }
}
