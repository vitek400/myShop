package Ru.retail.discounts;

public class DiscountPromo extends Discounts{
    private int idPromoGoods;
    private int promokodForANewProduct;

    public DiscountPromo ( int idPromoGoods, int promokodForANewProduct){
        this.idPromoGoods = idPromoGoods;
        this.promokodForANewProduct = promokodForANewProduct;
    }
    public void setPromokodForANewProduct(int promokodForANewProduct) {
        this.promokodForANewProduct = promokodForANewProduct;
    }
}