package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Neil Alishev
 */
public class Task2 {
    public static void main(String[] args) {

        String text = "src/main/resources/numbers19.txt";
        int count = 0;

        Set<Integer> hashSet = new HashSet<>();

        try {
            File file = new File(text);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextInt()){

                hashSet.add(scanner.nextInt());
                count ++;

            }

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        for(Integer list : hashSet){

            if (list >= 500000000 && list <= 600000000) {
                count ++;
            }
        }

        System.out.println(count);

    }
}
