package entity;

public class Order {
    String orderNo;
    String MenuID;
    double price;
    double TotalPrice;
    
    Order(String orderNo,String MenuID, double price, double TotalPrice){
        this.orderNo = orderNo;
        this.MenuID = MenuID;
        this.price = price;
        this.TotalPrice = TotalPrice;
    }

    public String getOrderNo() {
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
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
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
