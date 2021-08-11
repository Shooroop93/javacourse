package day5;


public class Task2 {
    public static void main(String[] args) {

        Motorbike yamaha = new Motorbike(2021, "black", "mt-10 sp");
        System.out.println(yamaha.getYear());
        System.out.println(yamaha.getColor());
        System.out.println(yamaha.getModel());

    }
}

class Motorbike {

    private int year;
    private String color;
    private String model;

    public int getYear(){
        return year;
    }

    public String getColor(){
        return color;
    }

    public String getModel(){
        return model;
    }

    public Motorbike(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }
}
