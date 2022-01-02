package Ru.retail;

public class Order {
    private String productList;
    private String state;
    private String client;
    private String payment;
    private int deliveryDate;
    private String deliveryAdress;

    public Order(String productList,String state,String client,String payment,int deliveryDate,String deliveryAdress){
        this.productList = productList;
        this.state = state;
        this.client = client;
        this. payment = payment;
        this.deliveryDate = deliveryDate;
        this.deliveryAdress = deliveryAdress;
    }public void setProductList(String productList) {
        this.productList = productList;
    }
}