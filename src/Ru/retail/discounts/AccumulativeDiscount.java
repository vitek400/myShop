package Ru.retail.discounts;

public class AccumulativeDiscount extends Discounts{
    private  int minSum;
    private  int maxSum;

    public AccumulativeDiscount(int idProduct, int dateOfStart, int dateOfTheEnd, String kindOfDiscount) {
        super(idProduct, dateOfStart, dateOfTheEnd, kindOfDiscount);
        this.minSum = minSum;
        this.maxSum = maxSum;
    }
    public AccumulativeDiscount() {super();}
    public void setMaxSum(int maxSum) {
        this.maxSum = maxSum;
    }
}