package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */

public class Task1 {
    public static void main(String[] args) {

        String text = "src/main/resources/dushi.txt";

        HashMap<String, Integer> list = new HashMap<>();

        try {
            File file = new File(text);
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter("[.,:;()?!\"\\s–»…<>«„\\]\\[^\\d.]+"); // регулярка без мусора
//            scanner.useDelimiter("[.,:;()?!\"\\s–»…<>«„\\]\\[^\\d.^[а]^[ых]^[е]^[у]]+");  поиск чичиков

            while (scanner.hasNext()) {

                String a = scanner.next().toLowerCase(Locale.ROOT);

                if (!list.containsKey(a)){
                    list.put(a, 1);
                } else {
                    list.put(a, list.get(a) + 1);
                }
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        for (Map.Entry<String, Integer> a : list.entrySet()){

//            if (a.getValue() > 0 ) {
//                System.out.println(a.getKey());
//            }

            if(a.getKey().contains("чичиков")) {
                System.out.println(a);
            }

        }
//        чичиков=608
//        чичиковых=1
//        чичиковым=12
//        чичикове=4
//        чичикова=89
//        чичиковы=1
//        чичикову=57
    }
}