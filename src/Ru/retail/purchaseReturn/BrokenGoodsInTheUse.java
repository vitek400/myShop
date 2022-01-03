package Ru.retail.purchaseReturn;

public class BrokenGoodsInTheUse extends PurchaseReturn{
    private String kindOfBreakage;
    public BrokenGoodsInTheUse(String name, String productCondition, int idProduct) {
        super(name, productCondition, idProduct);
        this.kindOfBreakage = kindOfBreakage;
    } public void setKindOfBreakage(String kindOfBreakage) {
        this.kindOfBreakage = kindOfBreakage;
    }public void sendingToServiceCentre(){
    }
}