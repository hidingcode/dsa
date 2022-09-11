package entity;

public class Order {
    int orderNo = 0;
    String MenuID;
    double price;
    double TotalPrice;
    
    public Order(){

    }

    public Order(String MenuID, double price, double TotalPrice){
        this.MenuID = MenuID;
        this.price = price;
        this.TotalPrice = TotalPrice;
    }

    public int getOrderNo() {
        return orderNo;
    }
    public String getMenuID() {
        return MenuID;
    }
    public double getPrice() {
        return price;
    }
    public double getTotalPrice() {
        return TotalPrice;
    }
    public void setOrderNo(int orderNo) {
        this.orderNo += 1;
    }
    public void setMenuID(String menuID) {
        MenuID = menuID;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setTotalPrice(double totalPrice) {
        TotalPrice = totalPrice;
    }
}
