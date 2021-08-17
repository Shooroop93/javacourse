package day11.task1.interfaceAndClasses;

import java.util.StringJoiner;

public class Warehouse {

    private int countPickedOrders;
    private int countDeliveredOrders;


    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public void setCountPickedOrders(int countPickedOrders) {
        this.countPickedOrders = countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public void setCountDeliveredOrders(int countDeliveredOrders) {
        this.countDeliveredOrders = countDeliveredOrders;
    }

    public void incrementPickedOrders() {
        countPickedOrders += 1;
    }

    public void incrementDeliveryOrders () {
        countDeliveredOrders +=1;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Warehouse.class.getSimpleName() + "[", "]")
                .add("countPickedOrders=" + countPickedOrders)
                .add("countDeliveredOrders=" + countDeliveredOrders)
                .toString();
    }

}
