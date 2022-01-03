package Ru.retail.purchaseReturn;

public class GoodQualityProduct extends PurchaseReturn{
    private String unopenedProductPackaging;
    private int returnPeriod;
    public GoodQualityProduct(String name, String productCondition, int idProduct) {
        super(name, productCondition, idProduct);
        this.unopenedProductPackaging = unopenedProductPackaging;
        this.returnPeriod = returnPeriod;
    } public void setReturnPeriod(int returnPeriod) {
        this.returnPeriod = returnPeriod;
    } public void refundMoney(){
    }
}
