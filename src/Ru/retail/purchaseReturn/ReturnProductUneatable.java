package Ru.retail.purchaseReturn;

public class ReturnProductUneatable extends DefectiveGoods{
    private String inconsistencyTechnicalCharacteristics;
    public ReturnProductUneatable(String name, String productCondition, int idProduct) {
        super(name, productCondition, idProduct);
        this.inconsistencyTechnicalCharacteristics = inconsistencyTechnicalCharacteristics;
    } public void setInconsistencyTechnicalCharacteristics(String inconsistencyTechnicalCharacteristics) {
        this.inconsistencyTechnicalCharacteristics = inconsistencyTechnicalCharacteristics;
    } public void examinationOfGoods(){
    }
}
