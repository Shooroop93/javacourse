package day12.task3.classes;

import java.util.List;
import java.util.StringJoiner;

public class MusicBand {

    private String name;
    private int year;

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
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
        return new StringJoiner(", ", MusicBand.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("year=" + year)
                .toString();
    }
}
