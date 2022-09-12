package entity;

public class Staff<T> extends Account {
    private int staffID;

    public Staff(String username, String password){
        super(username, password);
    }

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

    @Override
    public String toString(){
        return String.format("%-15s %-15s %-15s %-7s %-10s", getAccountID(), getUsername(), getPassword(), getAccess(), getStaffID());
    }
}
