package Ru.retail.product;

public class Uneatable extends Product {
   private String country;

   public Uneatable(String name, String state, int id, double price) {
      super(name, state, id, price);
      this.country = country;
   }
   public void setCountry(String country) {
      this.country = country;
   }
}