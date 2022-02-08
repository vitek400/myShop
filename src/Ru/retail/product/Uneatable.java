package Ru.retail.product;

public class Uneatable extends Product {
   private String country;

   public Uneatable(String name, String state, String id, String price,String barcode,String storage) {
      super(name,state,id, price,barcode,storage);
      this.country = country;
   }


   public void setCountry(String country) {
      this.country = country;
   }
}