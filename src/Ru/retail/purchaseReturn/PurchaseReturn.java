package Ru.retail.purchaseReturn;

public  class PurchaseReturn {
    private String name;
    private String productCondition;
    private int idProduct;

    public PurchaseReturn(String name,String productCondition,int idProduct){
        this.name = name;
        this.productCondition = productCondition;
        this.idProduct = idProduct;
    }public void setProductCondition(String productCondition) {
        this.productCondition = productCondition;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductCondition() {
        return productCondition;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }
}
