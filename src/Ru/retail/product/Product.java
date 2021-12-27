package Ru.retail.product;

public class Product {
    // public String name;
    // public String state;
    // public int id;
    // public double price;

    public static void main(String[] args) {
        //  int i//позиция в корзине
        //  int j//кол-во шт 1 позиции в корзине
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 5; j++){
                int multiplay = i*j;//-кол-во товара в корзине
                System.out.println(multiplay);
            }
        }
    }
}

