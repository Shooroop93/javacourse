package day12.task4;

import day12.task4.classes.MusicBand;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {

        List<String> membersGroup1 = new ArrayList<>();
        membersGroup1.add("Ivanov");
        membersGroup1.add("Pypkin");
        membersGroup1.add("Cudopov");

        MusicBand group1 = new MusicBand("Aaa",1990, membersGroup1);


        List<String> membersGroup2 = new ArrayList<>();
        membersGroup2.add("Sergeev");
        membersGroup2.add("Durnev");
        membersGroup2.add("Dypakov");

        MusicBand group2 = new MusicBand("Bbb", 2000, membersGroup2);

        group1.printMembers();
        group2.printMembers();

        MusicBand.transferMembers(group1, group2);

        group1.printMembers();
        group2.printMembers();

        group2.removeMembers("Sergeev");

        group2.printMembers();

    }
}
