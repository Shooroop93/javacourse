package day9.Task2;

import day9.Task2.classes.Circle;
import day9.Task2.classes.Figure;
import day9.Task2.classes.Rectangle;
import day9.Task2.classes.Triangle;

public class TestFigures {
    public static void main(String[] args) {

        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };

        System.out.println(calculateRedPerimeter(figures));
        System.out.println(calculateRedArea(figures));

    }

    public static double calculateRedPerimeter(Figure[] figures) {
        double sum = 0;

        for (Figure figure : figures) {
            if ("Red".equals(figure.getColor())){
                sum += figure.perimeter();
            }
        }

        return sum;

    }

    public static double calculateRedArea(Figure[] figures) {
        double sum = 0;

        for (Figure figure : figures) {
            if ("Red".equals(figure.getColor())) {
                sum += figure.area();
            }
        }
        return sum;
    }
}
