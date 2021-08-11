package day5;

public class Task1 {
    public static void main(String[] args) {

        Car ford = new Car();

        ford.setYear(2021);
        ford.setColor("Red");
        ford.setModel("Mustang");

        System.out.printf("Год выпуска %d, цвет машины %s, марка модели %s",ford.getYear(),ford.getColor(),ford.getModel());


    }
}

    class Car{

        private int year;
        private String color;
        private String model;


        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }
    }

