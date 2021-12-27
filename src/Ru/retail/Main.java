package Ru.retail;

public class Main {
    public static void main(String[] args) {
        boolean productPaidFor = true;
        boolean productNotPaid = false;
        if(productPaidFor()) {
            System.out.println("При доставке товара отдаем кассовый чек");
        } else if(productNotPaid()) {
            System.out.println("При доставке товара принимаем оплату и отдаем кассовый чек");
        } else {
            System.out.println("Не отдаем товар покупателю");
        }
    }
    private static boolean productNotPaid() {
        return false;
    }
    private static boolean productPaidFor() {
        return true;
    }
}




