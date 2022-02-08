package Ru.retail;

import Ru.retail.discounts.Discount;
import Ru.retail.product.Product;

public  class Client implements Discount {
    private String name;
    private String order;
    private String bankAccount;

    public Client(String name, String order, String bankAccount) {
        this.name = name;
        this.order = order;
        this.bankAccount = bankAccount;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getOrder() {return order;}
    public void setOrder(String order) {this.order = order;
        System.out.println("Заказу присвоен номер"+ " " + order);}
    public String getBankAccount() {return bankAccount;}
    public void setBankAccount(String bankAccount) {this.bankAccount = bankAccount;}
    public void putInBasket(Product product) {
        System.out.println("Покупатель" + " " + name + " "+ "положил товар" + " "+ product.getName()+ " " + "в корзину");
        product.setState("Зарезервировано");
    }
    public void payOrder(String state,String client,String paymentType){
        System.out.println("Заказ оплачен в городе" + " " +  state+ " "+  "клиентом" +" "+  client + ","+ "вид оплаты" + " " + paymentType);
    }
    @Override
    public void accumDiscount() {
        System.out.println("Покупателю" + " " + getName()+ " "+ "была оформлена дисконтная карта с накопительной скидкой");

    }
    }