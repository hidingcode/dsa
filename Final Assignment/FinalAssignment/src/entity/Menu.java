package entity;

public class Menu {
    private String MenuID;
    private String MenuName;
    private String MenuDesc;
    private String InvCode;
    private double MenuPrice;
    private int qty;
    private boolean status;

    public Menu(){

    }

    public Menu(String MenuID, String MenuName, String MenuDesc, String InvCode, double MenuPrice){
        this.MenuID = MenuID;
        this.MenuName = MenuName;
        this.MenuDesc = MenuDesc;
        this.InvCode = InvCode;
        this.MenuPrice = MenuPrice;
    }

    public Menu(String MenuID, String MenuName, String MenuDesc, String InvCode, double MenuPrice, int qty, boolean status){
        this.MenuID = MenuID;
        this.MenuName = MenuName;
        this.MenuDesc = MenuDesc;
        this.InvCode = InvCode;
        this.MenuPrice = MenuPrice;
        this.qty = qty;
        this.status = status;
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

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setMenuID(String menuID) {
        this.MenuID = menuID;
    }
    public void setMenuName(String menuName) {
        this.MenuName = menuName;
    }
    public void setMenuDesc(String menuDesc) {
        MenuDesc = menuDesc;
    }
    public void setInvCode(String invCode) {
        InvCode = invCode;
    }
    public void setMenuPrice(double MenuPrice) {
        this.MenuPrice = MenuPrice;
    }
}
