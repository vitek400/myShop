package Ru.retail;

public class Payment {
    private String paymentType;
    private int order;
    private int sum;
    private String state;

    public Payment(String paymentType,int order, int sum,String state){
        this.paymentType = paymentType;
        this.order = order;
        this.sum = sum;
        this.state = state;
    }public void setState(String state) {
        this.state = state;
    }
}