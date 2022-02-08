package Ru.retail.product;

import static java.lang.System.*;

public   class Product {
    private String name;
    private String state;
    private String id;
    private String price;
    private String barcode;
    private String storage;

    public Product(String name, String state, String  id, String price,String barcode,String storage) {
        this.name = name;
        this.state = state;
        this.id = id;
        this.price = price;
        this.barcode= barcode;
        this.storage= storage;
    }

    public String getName() {return name;}

    public void setState(String state) {
        this.state = state;
        out.println("Товару" + "  "+ this.name +"  " + "присвоен статус" + "  "+ state);
    }
public void setName(String name){this.name = name;}

    public String getState() {return state;}

    public void setBarcode(String barcode) {
        this.barcode = barcode;
        out.println("Товару" + "  " + this.name + "  "  + "присвоен баркод" + "  " + barcode);
    }
    public String getPrice(){return price;}
    public void setPrice(String price) {
        this.price = price;
        out.println("Товару" + "  " + getName()+ "  " + "установлена цена" + " " + getPrice());
    }

    public void setOrder(String s) {
    }
    public void acceptProduct(String склад) {
        out.println("Произведен прием товара" +" "+  name + " " + "на складе");
    }
    }

