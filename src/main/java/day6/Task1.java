package day6;

import day6.classes.Car;
import day6.classes.Motorbike;

public class Task1 {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setYear(2021);
        car1.setColor("Red");
        car1.setModel("Mustang");

        car1.info();
        System.out.println(car1.yearDifference(1980));

        Motorbike bike1 = new Motorbike(2021, "black", "yamaha");

        bike1.info();
        System.out.println(bike1.yearDifference(1940));


    }
}
