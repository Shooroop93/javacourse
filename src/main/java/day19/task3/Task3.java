package day19.task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task3 {
    public static void main(String[] args) {

        String text = "src/main/resources/taxi_cars.txt";

        HashMap<Integer, Point> hashMap = new HashMap<>();

        File file = new File(text);

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()){

                int id = scanner.nextInt();
                int x = scanner.nextInt();
                int y = scanner.nextInt();

                hashMap.put(id, new Point(x,y));

            }

            scanner.close();

            Scanner scanner1 = new Scanner(System.in);

            List<Integer> answer = new ArrayList<>();

            int x1 = scanner1.nextInt();
            int y1 = scanner1.nextInt();
            int x2 = scanner1.nextInt();
            int y2 = scanner1.nextInt();

            for (Map.Entry<Integer, Point> list : hashMap.entrySet() ){
                if (x1 > list.getValue().getX() && y1 > list.getValue().getY() && x2 < list.getValue().getX() && y2 < list.getValue().getY()) {
                        answer.add(list.getKey());
                }
            }

            System.out.println(answer.size());

            scanner1.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

    }
}