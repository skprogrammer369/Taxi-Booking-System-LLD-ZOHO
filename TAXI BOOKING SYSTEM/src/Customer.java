public class Customer {
    private int customerId;
    private char pickup;
    private char drop;
    private int pickTime;

    Customer(int customerId, char pickup, char drop, int pickTime) {
        this.customerId = customerId;
        this.pickup = pickup;
        this.drop = drop;
        this.pickTime = pickTime;
    }
        
    public int getcustomerId() {
        return customerId;
    }

    public char getPickup() {
        return pickup;
    }

    public char getDrop() {
        return drop;
    }

    public int getPickTime() {
        return pickTime;
    }


}
