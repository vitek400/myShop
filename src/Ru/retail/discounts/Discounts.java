package Ru.retail.discounts;

public  class Discounts {
    private String dateOfStart;
    private String dateOfTheEnd;
    private String kindOfDiscount;

    public Discounts(String dateOfStart, String dateOfTheEnd, String kindOfDiscount) {
    }

    public Discounts() {

    }

    public String getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(String dateOfStart) {
        this.dateOfStart = String.valueOf(dateOfStart);
    }

    public String getDateOfTheEnd() {
        return dateOfTheEnd;
    }

    public void setDateOfTheEnd(String dateOfTheEnd) {
        this.dateOfTheEnd = dateOfTheEnd;
    }

    public String getKindOfDiscount() {
        return kindOfDiscount;
    }

    public void setKindOfDiscount(String kindOfDiscount) {
        this.kindOfDiscount = kindOfDiscount;
    }
}
