package Ru.retail.purchaseReturn;

public class PurchaseReturn {
    private String name;
    private String productCondition;
    private int idProduct;

    public PurchaseReturn(String name,String productCondition,int idProduct){
        this.name = name;
        this.productCondition = productCondition;
        this.idProduct = idProduct;
    }public void setProductCondition(String productCondition) {
        this.productCondition = productCondition;
    }public void returnTheGoods(){
        System.out.println("возврат товара");
    } public void exchangeForAnaloG(){
    } public void repairOfGoods(){
    }
}
