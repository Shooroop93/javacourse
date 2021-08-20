package day12.task5;

import day12.task5.classes.MusicArtist;
import day12.task5.classes.MusicBand;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {

    List<MusicArtist> members1 = new ArrayList<>();

    members1.add(new MusicArtist("Ivanov", 1990));
    members1.add(new MusicArtist("Sergeev", 1993));

    List<MusicArtist> members2 = new ArrayList<>();
    members2.add(new MusicArtist("Sidorov",2000));
    members2.add(new MusicArtist("Pypkin", 1995));

    MusicBand group1 = new MusicBand("Aaa", 2021, members1);
    MusicBand group2 = new MusicBand("Bbb", 2020, members2);

        System.out.println(group1);
        System.out.println(group2);
        System.out.println();
        group1.printMembers();
        group2.printMembers();

        MusicBand.transferMembers(group1, group2);
        System.out.println();

        System.out.println(group1);
        System.out.println(group2);
        System.out.println();
        group1.printMembers();
        group2.printMembers();
    }
}
