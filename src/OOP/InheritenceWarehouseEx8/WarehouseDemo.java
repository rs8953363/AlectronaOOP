package OOP.InheritenceWarehouseEx8;

public class WarehouseDemo {
    public static void main(String[] args) {
        ProductWarehouse juice = new ProductWarehouse("Juice", 1000.0);
        juice.addToWareHouse(1000.0);
        juice.takeFromWareHouse(11.3);
        System.out.println(juice.getProductName());//juice
        juice.addToWareHouse(1.0);
        System.out.println(juice);
    }
}
