package Ru.retail;

public class Delivery {
    private int id;
    private int deliveryDate;
    private String deliveryAdress;

    public Delivery(int id, int deliveryDate, String deliveryAdress, int money){
        this.id = id;
        this.deliveryDate = deliveryDate;
        this.deliveryAdress = deliveryAdress;
    }
    public void setDeliveryAdress(String deliveryAdress) {
        this.deliveryAdress = deliveryAdress;
    }
}