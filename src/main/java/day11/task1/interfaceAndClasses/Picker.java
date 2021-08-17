package day11.task1.interfaceAndClasses;

import java.util.StringJoiner;

public class Picker implements Worker {

    private static final int SALARY_PICKER = 80;
    private static final int SALARY_BONUS = 70000;
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;


    public Picker(Warehouse warehouse) {
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
        return new StringJoiner(", ", Picker.class.getSimpleName() + "[", "]")
                .add("salary=" + salary)
                .add("isPayed=" + isPayed)
                .toString();
    }

    @Override
    public void doWork() {
        salary += SALARY_PICKER;
        warehouse.incrementPickedOrders();
    }

    @Override
    public void bonus() {

        if (warehouse.getCountPickedOrders() < 10000) {
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
