package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        List<String> auto = new ArrayList<>();
        auto.add("audi");
        auto.add("bmw");
        auto.add("ford");
        auto.add("lada");
        auto.add("toyota");

        System.out.println(auto);

        auto.add(3, "kia");
        auto.remove(0);

        for (String a : auto) {
            System.out.print(a + " ");
        }

    }
}
