package Ru.retail;

import Ru.retail.product.Product;
import Ru.retail.purchaseReturn.PurchaseReturns;

public class Order implements PurchaseReturns {
    private String productList;
    private String state;
    private String client;
    private String payment;
    private String  deliveryDate;
    private String deliveryAdress;

    public Order(String productList,String state,String client,String payment,String  deliveryDate,String deliveryAdress){
        this.productList = productList;
        this.state = state;
        this.client = client;
        this. payment = payment;
        this.deliveryDate = deliveryDate;
        this.deliveryAdress = deliveryAdress;
    }

    public String getProductList() {return productList;}
    public void setProductList(String productList) {
        this.productList = productList;
    } public String getState() {return state;}
    public void setState(String state) {this.state = state;}
    public String getClient() {return client;}
    public void setClient(String client) {this.client = client;}
    public String getPayment() {return payment;}
    public void setPayment(String payment) {this.payment = payment;}
    public String getDeliveryDate() {return deliveryDate;}
    public void setDeliveryDate(String deliveryDate) {this.deliveryDate = deliveryDate;}
    public String getDeliveryAdress() {return deliveryAdress;}
    public void setDeliveryAdress(String deliveryAdress) {this.deliveryAdress = deliveryAdress;}
    public void transferDelivery(){
        System.out.println("Заказ"+ " "+ getProductList()+ " "+ "передан в доставку");}
    public void delivery(){
        System.out.println("Заказ"+ " "+ getProductList() + " "+ "доставлен покупателю"+ " "+getClient()+ " "+"по адресу:" + " "+getDeliveryAdress());
    }
    @Override
    public void returnTheProduct() {
        System.out.println("Был произведен возврат покупки");
    }
    @Override
    public void exchangeForAnaloG() {
        System.out.println("Была произведена замена товара на аналогичный");
    }
    @Override
    public void repairOfProduct() {
        System.out.println("Возвращенный товар был отправлен в сервис-центр");
    }

}