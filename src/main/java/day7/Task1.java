package day7;

import day7.classes.Airplane;

public class Task1 {
    public static void main(String[] args) {

        Airplane airplane1 = new Airplane("boeng",2021,4000, 50000);
        Airplane airplane2 = new Airplane("neBoeng", 2020, 6000, 40000);

        Airplane.compareAirplanes(airplane1, airplane2);
    }
}