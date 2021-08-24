package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        String path = "src/main/java/day16/file/TestText.txt";

        File file = new File(path);

        printResult(file);

    }

    public static void printResult(File file) {

        try {
            Scanner scanner = new Scanner(file);
            int sumNumbers = 0;

            String[] nums = scanner.nextLine().split(" ");

            for (String num : nums) {
                sumNumbers += Integer.parseInt(num);
            }

            double fullNum = sumNumbers / (double)nums.length;
            double neFullNum = sumNumbers / (double)nums.length;

            System.out.print(fullNum);
            System.out.print(" --> ");
            System.out.printf("%.3f",neFullNum);

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

    }
}

