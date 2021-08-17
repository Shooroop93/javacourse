package day11.task1;

import day11.task1.interfaceAndClasses.Picker;
import day11.task1.interfaceAndClasses.Warehouse;
import day11.task1.interfaceAndClasses.Worker;

public class Task1 {
    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();
        Picker picker1 = new Picker(warehouse);
        Picker picker2 = new Picker(warehouse);

        businessProcess(picker1);
        picker2.bonus();

        System.out.println(picker1);
        System.out.println(picker2);

        Warehouse warehouse2 = new Warehouse();
        Picker picker = new Picker(warehouse2);
        picker.bonus();
        System.out.println(picker);

    }

    public static void businessProcess(Worker worker) {

        for (int i = 0; i <= 10000; i ++) {

            worker.doWork();

        }

        worker.bonus();

    }
}
