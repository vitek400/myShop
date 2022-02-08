package Ru.retail.product;

public class Eatable extends Product {
    private int experationDate;

    public Eatable(String name, String state, String  id, String  price,String barcode,String storage) {
        super(name, state, id, price, barcode, storage);
        this.experationDate = experationDate;
    }
    public void setExperationDate(int experationDate) {
        this.experationDate = experationDate;
    }
}