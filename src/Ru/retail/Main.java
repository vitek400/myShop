package Ru.retail;

import Ru.retail.discounts.AccumDiscount;
import Ru.retail.product.Uneatable;

public class Main {
    public static void main(String[] args) {
        Uneatable toy = new Uneatable("Радиоуправляемый вертолет","Пхеньян","73023","3000","8547","склад");
        Uneatable washingPowder = new Uneatable("Персил","Мехико","74258","680","369874","склад");
        Client sergey = new Client("Сергей", "первый", "201");
        Order order = new Order("радиоуправляемый вертолет, персил","Одесса","Сергей","безналичная оплата","03.03.2022","г.Одесса,ул.Школьная,д.2");
        toy.acceptProduct("склад");
        toy.setBarcode("8547");
        toy.setPrice("3000");
        toy.setState("В наличии");
        washingPowder.acceptProduct("склад");
        washingPowder.setBarcode("369874");
        washingPowder.setPrice("680");
        washingPowder.setState("в наличии");
        sergey.putInBasket(toy);
        sergey.putInBasket(washingPowder);
        sergey.setOrder("первый");
        sergey.payOrder("Одесса", "Сергей", "оплата по карте");
        sergey.accumDiscount();
        order.transferDelivery();
        order.delivery();
    }
}

















  //      boolean productPaidFor = true;
 //       boolean productNotPaid = false;
  //      if(productPaidFor()) {
 //          System.out.println("При доставке товара отдаем кассовый чек");
 //       } else if(productNotPaid()) {
 //           System.out.println("При доставке товара принимаем оплату и отдаем кассовый чек");
 //       } else {
 //           System.out.println("Не отдаем товар покупателю");


  //  private static boolean productNotPaid() {
 //       return false;
 //   }
 //   private static boolean productPaidFor() {
  //      return true;
  //  }
