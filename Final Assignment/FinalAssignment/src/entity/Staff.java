package entity;

public class Staff<T> extends Account {
    private int staffID;

    // Empty constructor
    public Staff(){

    }

    // AccountControl used for login
    public Staff(String username, String password){
        super(username, password);
    }

    // AccountControl used for add new array
    public Staff(int accountID, String username, String password, int access, int staffID){ 
        super(accountID, username, password, access);
        this.staffID = staffID;
    }
    
    // getter and setter
    public int getStaffID(){
        return staffID;
    }
    
    // getter and setter
    public void setStaffID(int staffID){
        this.staffID = staffID;
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
        return String.format("%-15s %-15s %-15s %-7s %-10s", getAccountID(), getUsername(), getPassword(), getAccess(), getStaffID());
    }
}
