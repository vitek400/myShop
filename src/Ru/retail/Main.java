package Ru.retail;

import Ru.retail.discounts.AccumDiscount;
import Ru.retail.product.Product;
import Ru.retail.product.Uneatable;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Client> clients = new ArrayList<Client>();
        clients.add( new Client("Петр",     "258741", "741852") );
        clients.add( new Client("Иванко",   "258571", "123654") );
        clients.add( new Client("Валентин", "274181", "741852") );
        clients.add( new Client("Денис",    "528964", "789624") );
        clients.add( new Client("Сергей",   "первый", "201"   ) );
        
        Uneatable toy = new Uneatable("Радиоуправляемый вертолет","Пхеньян","73023","3000","8547","склад");
        toy.acceptProduct("склад");
        toy.setBarcode("8547");
        toy.setPrice("3000");
        toy.setState("В наличии");
        
        Uneatable washingPowder = new Uneatable("Персил","Мехико","74258","680","369874","склад");
        washingPowder.acceptProduct("склад");
        washingPowder.setBarcode("369874");
        washingPowder.setPrice("680");
        washingPowder.setState("в наличии");
        
        clients.get(4).putInBasket(toy);
        clients.get(4).putInBasket(washingPowder);
        clients.get(4).setOrder("первый");
        clients.get(4).payOrder("Одесса", "Сергей", "оплата по карте");
        clients.get(4).accumDiscount();
        
        Order order = new Order("радиоуправляемый вертолет, персил","Одесса","Сергей","безналичная оплата","03.03.2022","г.Одесса,ул.Школьная,д.2");
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
