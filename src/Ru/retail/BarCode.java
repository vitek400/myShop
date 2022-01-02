package Ru.retail;

public class BarCode {
     private int id;
     private int price;

     public BarCode(int id,int price){
         this.id = id;
         this.price = price;
     }
    public void setPrice(int price) {this.price = price;}
}