package Ru.retail.purchaseReturn;

public class DefectiveGoods extends PurchaseReturn{
    private String defectCategory;
    private String regradingOfGoods;
    private String incompleteGoods;
    private String inconsistencyOfAppearance;


    public DefectiveGoods(String name, String productCondition, int idProduct) {
        super(name, productCondition, idProduct);
        this.defectCategory = defectCategory;
        this.regradingOfGoods = regradingOfGoods;
        this.incompleteGoods = incompleteGoods;
        this.inconsistencyOfAppearance = inconsistencyOfAppearance;
    }

    public void setDefectCategory(String defectCategory) {
        this.defectCategory = defectCategory;
    }
    public void discountSale(){
    }
    public void disposalOfGoodsForScrap(){
    }
}
