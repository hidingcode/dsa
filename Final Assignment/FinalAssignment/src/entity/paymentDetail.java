package entity;

public class PaymentDetail {
    private String customerName;
    private String orderStuff;
    private float total;

    public paymentDetail()
    {

    }

    public paymentDetail(String customerName, String orderStuff, float total)
    {
        this.customerName = customerName;
        this.orderStuff = orderStuff;
        this.total = total;        
    }

    public String getCustomerName()
    {
        return customerName;
    }

    public String getOrderStuff()
    {
        return orderStuff;
    }

    public float getTotal()
    {
        return total;
    }

    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    public void setOrderStuff(String orderStuff)
    {
        this.orderStuff = orderStuff;
    }

    public void  setTotal(float total)
    {
        this.total = total;
    }

}
