package Ru.retail;

public class BarCode {
     private String id;
     private double price;

     public BarCode(String id, double price){
         this.id = id;
         this.price = price;
     }
    public void setPrice(double price) {this.price = price;}

    public double getPrice() { return price;}
    public String  getId() {return id;}

    public void changePrice(double delta){
     double oldPrice = price;
        price *= 1.2;
        System.out.println("Изменена цена товара"+ id + "," + "старая цена = " + oldPrice + "," + "новая цена = " + price);
    }
}