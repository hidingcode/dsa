package entity;

public class Menu {
    private String MenuID;
    private String MenuName;
    private String MenuDesc;
    private String InvCode;
    private double MenuPrice;

    public Menu(){

    }

    public Menu(String MenuID, String MenuName, String MenuDesc, String InvCode, double MenuPrice){
        this.MenuID = MenuID;
        this.MenuName = MenuName;
        this.InvCode = InvCode;
        this.MenuPrice = MenuPrice;
    }

    public String getMenuID() {
        return MenuID;
    }
    public String getMenuName() {
        return MenuName;
    }
    public String getMenuDesc() {
        return MenuDesc;
    }
    public String getInvCode() {
        return InvCode;
    }
    public double getMenuPrice() {
        return MenuPrice;
    }
    public void setMenuID(String menuID) {
        this.MenuID = menuID;
    }
    public void setMenuName(String menuName) {
        this.MenuName = menuName;
    }
    public void setMenuDesc(String menuDesc) {
        this.MenuDesc = menuDesc;
    }
    public void setInvCode(String invCode) {
        InvCode = invCode;
    }
    public void setMenuPrice(double MenuPrice) {
        this.MenuPrice = MenuPrice;
    }
}
