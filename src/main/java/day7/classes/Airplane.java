package day7.classes;

public class Airplane {

    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;



    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public String getProducer() {
        return producer;
    }

    public int getYear() {
        return year;
    }

    public int getLength() {
        return length;
    }

    public int getWeight() {
        return weight;
    }

    public int getFuel() {
        return fuel;
    }

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public int fillUp (int n) {
        fuel += n;
        return fuel;
    }

    public void info() {
        System.out.printf("Изготовитель: %s, год выпуска: %d, длина: %d, вес: %d, количество топлива в баке: %d\n", producer, year, length, weight, fuel);
    }

    public static void compareAirplanes (Airplane airplane1, Airplane airplane2){

        if (airplane1.length > airplane2.length) {
            System.out.printf("Первый самолет длиннее\n");
        } else if (airplane1.length == airplane2.length) {
            System.out.println("Длины самолетов равны");
        } else {
            System.out.printf("Второй самолет длиннее\n");
        }

    }
}
