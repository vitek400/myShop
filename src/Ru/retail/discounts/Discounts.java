package Ru.retail.discounts;

public abstract class Discounts {
    private int idProduct;
    private int dateOfStart;
    private int dateOfTheEnd;
    private String kindOfDiscount;

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public int getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(int dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public int getDateOfTheEnd() {
        return dateOfTheEnd;
    }

    public void setDateOfTheEnd(int dateOfTheEnd) {
        this.dateOfTheEnd = dateOfTheEnd;
    }

    public String getKindOfDiscount() {
        return kindOfDiscount;
    }

    public void setKindOfDiscount(String kindOfDiscount) {
        this.kindOfDiscount = kindOfDiscount;
    }

    public Discounts (int idProduct, int dateOfStart, int dateOfTheEnd, String kindOfDiscount){
        this.idProduct = idProduct;
        this.dateOfStart = dateOfStart;
        this.dateOfTheEnd = dateOfTheEnd;
        this.kindOfDiscount = kindOfDiscount;
    }
    public Discounts() {
    }
}