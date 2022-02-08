package Ru.retail.discounts;

public class AccumDiscount extends Discounts{
    private  int minSum;
    private  int maxSum;

    public AccumDiscount(String dateOfStart, String dateOfTheEnd, String kindOfDiscount) {
        super(dateOfStart, dateOfTheEnd, kindOfDiscount);
        this.minSum = minSum;
        this.maxSum = maxSum;
    }public void setMaxSum(int maxSum) {
        this.maxSum = maxSum;
    }
    }