package Ru.retail;

public class Client {
    private String name;
    private int order;
    private String bankAccount;

    public  Client(String name,int order,String bankAccount) {
        this.name = name;
        this.order = order;
        this.bankAccount = bankAccount;
    }public void setOrder(int order) {
        this.order = order;
    }public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }
}