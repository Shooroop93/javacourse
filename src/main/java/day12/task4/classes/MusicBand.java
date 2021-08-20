package day12.task4.classes;

import java.util.List;
import java.util.StringJoiner;

public class MusicBand {

    private String name;
    private int year;
    private List<String> members;

    public MusicBand(String name, int year, List<String> members ) {
        this.name = name;
        this.year = year;
        this.members = members;
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

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public static void transferMembers ( MusicBand a, MusicBand b) {

        for(String members : a.getMembers()) {
            b.getMembers().add(members);
        }

        a.getMembers().clear();
    }

    public void printMembers() {
        System.out.println(this.members);
    }

    public void removeMembers(String name) {
        this.members.remove(name);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", MusicBand.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("year=" + year)
                .add("members='" + members + "'")
                .toString();
    }
}
