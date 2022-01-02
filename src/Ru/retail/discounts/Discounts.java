package Ru.retail.discounts;

public class Discounts {
    private int idProduct;
    private int dateOfStart;
    private int dateOfTheEnd;
    private String kindOfDiscount;

    public Discounts (int idProduct, int dateOfStart,int dateOfTheEnd, String kindOfDiscount){
        this.idProduct = idProduct;
        this.dateOfStart = dateOfStart;
        this.dateOfTheEnd = dateOfTheEnd;
        this.kindOfDiscount = kindOfDiscount;
    }
    public Discounts() {
    }
}