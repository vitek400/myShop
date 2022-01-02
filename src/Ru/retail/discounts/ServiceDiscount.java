package Ru.retail.discounts;

public class ServiceDiscount extends Discounts{
    private byte servicePeriod;

    public ServiceDiscount(byte servicePeriod){
        this.servicePeriod = servicePeriod;
    }

    public void setServicePeriod(byte servicePeriod) {
        this.servicePeriod = servicePeriod;
    }
}