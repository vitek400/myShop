package Ru.retail.product;

public class Eatable extends Product {
    private int experationDate;

    public Eatable(String name, String state, int id, double price) {
        super(name, state, id, price);
        this.experationDate = experationDate;
    }
    public void setExperationDate(int experationDate) {
        this.experationDate = experationDate;
    }
}