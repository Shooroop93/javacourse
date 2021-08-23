package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        String path = "src\\main\\java\\day14\\file\\TestText.txt";

        File file = new File(path);

        printSumDigits(file);

    }

    public static void printSumDigits(File file) {

        try {
            Scanner scanner = new Scanner(file);
            List<Integer> nums = new ArrayList<>();
            int sumNumbers = 0;

            String[] numbers = scanner.nextLine().split(" ");

//            if (numbers.length != 10) {
//                System.out.println("Некорректный входной файл");    Можно пользоваться таким способом ? или лучше выкидывать исключение ?
//                                                                      Я понимаю, что исключение легче обрабатывать и не будет повторение кода.
//                System.exit(0);
//            }

            if (numbers.length != 10) {
                throw new IllegalArgumentException();
            }

            for (String number : numbers){
                nums.add(Integer.parseInt(number));
            }

            for (Integer num : nums) {
                sumNumbers += num;
            }

                scanner.close();
                System.out.println(sumNumbers);


        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }

    }
}
