package OOP.InheritenceWarehouseEx8;

public class Warehouse {
    private double capacity;
    private double balance;

    public Warehouse(double capacity) {
        if (capacity > 0.0) {
            this.capacity = capacity;
        } else {
            this.capacity = 0.0;
        }
        this.balance = 0.0;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double howMuchSpaceLeft(){
        return this.capacity-this.balance;
    }

    public void addToWareHouse(double amount){
        if(amount<0){
            return;
        }if (amount<=howMuchSpaceLeft()){
            this.balance = this.balance + amount;
        }else{
            this.balance = this.capacity;
        }
    }
    public double takeFromWareHouse(double amount){
        if (amount < 0){
            return 0.0;
        }
        if (amount > this.balance){
            double allThatWeCan = this.balance;
            this.balance = 0.0;
            return allThatWeCan;
        }
        this.balance = this.balance - amount;
        return amount;
    }

}
