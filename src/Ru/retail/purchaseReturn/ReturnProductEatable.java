package Ru.retail.purchaseReturn;

 public class ReturnProductEatable extends DefectiveGoods {
     private String changingTheTasteOfProduct;
     private String productShelfLife;
     public ReturnProductEatable(String name, String productCondition, int idProduct) {
         super(name, productCondition, idProduct);
         this.changingTheTasteOfProduct = changingTheTasteOfProduct;
         this.productShelfLife = productShelfLife;
     } public void setProductShelfLife(String productShelfLife) {
         this.productShelfLife = productShelfLife;
     } public void returnTheGoods(){
     }
 }
