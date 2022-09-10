package entity;

public class Menu {
    private int MenuID;
    private String MenuName;
    private String MenuDesc;
    private int InvQuantity;
    private float price;

    Menu(int MenuID, String MenuName, String MenuDesc, String InvQuantity, float price){
        this.MenuID = MenuID;
        this.MenuName = MenuName;
        this.InvQuantity = InvQuantity;
        this.price = price;
    }
}
