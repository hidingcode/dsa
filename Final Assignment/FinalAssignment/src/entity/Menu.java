package entity;

public class Menu {
    private String MenuID;
    private String MenuName;
    private String MenuDesc;
    private String InvCode;
    private int InvQuantity;
    private double price;

    public Menu(){

    }

    public Menu(String MenuID, String MenuName, String MenuDesc, String InvCode, int InvQuantity, double price){
        this.MenuID = MenuID;
        this.MenuName = MenuName;
        this.InvCode = InvCode;
        this.InvQuantity = InvQuantity;
        this.price = price;
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
    public int getInvQuantity() {
        return InvQuantity;
    }
    public double getPrice() {
        return price;
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
    public void setInvQuantity(int invQuantity) {
        this.InvQuantity = invQuantity;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
