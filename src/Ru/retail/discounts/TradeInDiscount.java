package Ru.retail.discounts;

public class TradeInDiscount extends  Discounts{
    private String name;
    private String productCondition;

    public TradeInDiscount(String name,String productCondition){
        this.name = name;
        this.productCondition = productCondition;
    }
    public void setProductCondition(String productCondition) {
        this.productCondition = productCondition;
    }

}