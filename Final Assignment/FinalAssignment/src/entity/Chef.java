package entity;

public class Chef{
    private String chefName;
    private String chefID;
    private String chefPosition;

    public Chef(String chefName, String chefID, String chefPosition){
        this.chefName = chefName;
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

    public void setChefPosition(String chefPosition) {
        this.chefPosition = chefPosition;
    }

    public String getChefPosition() {
        return chefPosition;
    }
}
