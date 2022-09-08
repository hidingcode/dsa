package entity;

public class Chef{
    private String chefID;
    private String chefName;

    public Chef(String chefID, String chefName){
        this.chefName = chefName;
        this.chefID = chefID;
    }

    public void setChefName(String chefName) {
        this.chefName = chefName;
    }

    public String getChefName() {
        return chefName;
    }

    public void setChefID(String chefID) {
        this.chefID = chefID;
    }

    public String getChefID() {
        return chefID;
    }
}
