package day11.task1.interfaceAndClasses;

import java.util.StringJoiner;

public class Courier implements Worker {

    private static final int SALARY_COURIER = 100;
    private static final int SALARY_BONUS = 50000;
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean getIsPayed() {
        return isPayed;
    }

    public void setIsPayed(boolean isPayed) {
        this.isPayed = isPayed;
    }


    @Override
    public String toString() {
        return new StringJoiner(", ", Courier.class.getSimpleName() + "[", "]")
                .add("salary=" + salary)
                .add("isPayed=" + isPayed)
                .toString();
    }

    @Override
    public void doWork() {

        salary += SALARY_COURIER;
        warehouse.incrementDeliveryOrders();

    }

    @Override
    public void bonus() {

        if (warehouse.getCountDeliveredOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
            return;
        }

        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }

        salary += SALARY_BONUS;
        isPayed = true;

    }
}
