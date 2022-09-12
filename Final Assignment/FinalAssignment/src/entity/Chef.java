// Lim Yong Chien
package entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Chef{
    private String chefID;
    private String chefName;
    private String date;
    private Date currentDate = new Date(System.currentTimeMillis());

    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss"); 

    public Chef(){
        
    }

    public Chef(String chefID, String chefName){
        this.chefName = chefName;
        this.chefID = chefID;
        date = dateFormat.format(currentDate);
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
