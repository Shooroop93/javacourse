package day12.task3;

import day12.task3.classes.MusicBand;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        List<MusicBand> group = new ArrayList<>();
        group.add(new MusicBand("Aaa", 1990));
        group.add(new MusicBand("Bbb", 1992));
        group.add(new MusicBand("Ccc", 1994));
        group.add(new MusicBand("Ddd", 1996));
        group.add(new MusicBand("Fff", 1998));
        group.add(new MusicBand("Ggg", 2000));
        group.add(new MusicBand("Hhh", 2002));
        group.add(new MusicBand("Jjj", 2004));
        group.add(new MusicBand("Kkk", 2006));
        group.add(new MusicBand("Lll", 2008));

        System.out.println(group);

        Collections.shuffle(group);

        System.out.println(group);

        System.out.println(groupsAfter2000(group));

    }

    public static List<MusicBand> groupsAfter2000 (List<MusicBand> bands) {
        List<MusicBand> re = new ArrayList();
        for (MusicBand musicBand : bands) {
            if (musicBand.getYear() >= 2000){
                re.add(musicBand);
            }
        }
        return re;
    }
}
