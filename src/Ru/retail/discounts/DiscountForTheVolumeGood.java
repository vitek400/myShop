package Ru.retail.discounts;

public class DiscountForTheVolumeGood extends  Discounts {
    private  int minSum;
    private  int maxSum;
    private  String listOfPromo;

    public DiscountForTheVolumeGood (int minSum, int maxSum, String listOfPromo){
        this.minSum = minSum;
        this.maxSum = maxSum;
        this.listOfPromo = listOfPromo;
    }
    public void setListOfPromo(){
    }
}