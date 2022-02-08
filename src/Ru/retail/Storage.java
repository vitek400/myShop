package Ru.retail;

public class Storage {
    private String name;
    private String taskExists;

    public Storage(String name){
        this.name = name;
        this.taskExists = taskExists;
    }
    Storage storage = new Storage("Склад");

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public static String getName(String name){return name;}
    public void setTaskExists(String taskExists) {
        this.taskExists = taskExists;
        System.out.println("Товар" + this.name + "зарезервирован на складе");
    }
  }
