package entity;

public class Menu {
    private int MenuID;
    private String MenuName;
    private String MenuDesc;
    private int InvQuantity;
    private double price;

    public Menu(){

    }

    public Menu(int MenuID, String MenuName, String MenuDesc, double price){
        this.MenuID = MenuID;
        this.MenuName = MenuName;
        this.price = price;
    }

    public Menu(int MenuID, String MenuName, String MenuDesc, int InvQuantity, double price){
        this.MenuID = MenuID;
        this.MenuName = MenuName;
        this.InvQuantity = InvQuantity;
        this.price = price;
    }

    public int getMenuID() {
        return MenuID;
    }
    public String getMenuName() {
        return MenuName;
    }
    public String getMenuDesc() {
        return MenuDesc;
    }
    public int getInvQuantity() {
        return InvQuantity;
    }
    public double getPrice() {
        return price;
    }
    public void setMenuID(int menuID) {
        this.MenuID = menuID;
    }
    public void setMenuName(String menuName) {
        this.MenuName = menuName;
    }
    public void setMenuDesc(String menuDesc) {
        this.MenuDesc = menuDesc;
    }
    public void setInvQuantity(int invQuantity) {
        this.InvQuantity = invQuantity;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
