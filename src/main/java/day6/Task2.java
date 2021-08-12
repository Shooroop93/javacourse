package day6;

import day6.classes.Airplane;

public class Task2 {
    public static void main(String[] args) {

        Airplane airplane = new Airplane("boeng",2021, 2000, 4000);

        airplane.info();
        airplane.fillUp(500);
        airplane.info();
        airplane.fillUp(100);
        airplane.info();

    }
}
