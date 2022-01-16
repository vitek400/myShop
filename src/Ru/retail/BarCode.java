package Ru.retail;

public class BarCode {
     private int id;
     private float price;

     public BarCode(int id,float price){
         this.id = id;
         this.price = price;
     }
    public void setPrice(float price) {this.price = price;}

    public float getPrice() { return price;}
}