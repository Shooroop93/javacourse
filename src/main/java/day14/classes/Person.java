package day14.classes;

import java.util.StringJoiner;

public class Person {

    private String name;
    private int year;

    public Person(String name, int age) {
        this.name = name;
        this.year = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", "{", "}")
                .add("name='" + name + "'")
                .add("year=" + year)
                .toString();
    }
}
