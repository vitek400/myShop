package Ru.retail;

public class Main {
    public static void main(String[] args) {
        int [] stock = new int[10]; //запас товара на складе
        for(int i=0; i<10; i++){
            stock[i] = i+1;
            System.out.println(stock[i]);
        }
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
//}