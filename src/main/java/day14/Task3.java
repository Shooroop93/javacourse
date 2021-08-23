package day14;

import day14.classes.Person;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        File file = new File("src/main/java/day14/file/People.txt");

        System.out.println(parseFileToObjList(file));

    }

    public static List<Person> parseFileToObjList(File file) {

        try {
            Scanner scanner = new Scanner(file);
            List<Person> array = new ArrayList<>();

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] num = line.split(" ");

                if (Integer.parseInt(num[1]) < 0) {
                    throw new IllegalArgumentException();
                }

                Person person = new Person(num[0], Integer.parseInt(num[1]));
                array.add(person);

            }

            scanner.close();

            return array;

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
            return null;
        }

        return null;

    }
}
