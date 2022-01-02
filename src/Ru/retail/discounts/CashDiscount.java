package Ru.retail.discounts;

public class CashDiscount extends Discounts{
    private int summa;

    public CashDiscount(int idProduct, int dateOfStart, int dateOfTheEnd, String kindOfDiscount) {
        super(idProduct, dateOfStart, dateOfTheEnd, kindOfDiscount);
        this.summa = summa;
    }
    public void GetId() {
    }
}