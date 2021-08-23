package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        File outText = new File("src/main/resources/shoes.csv");
        File writeText = new File("src/main/resources/missing_shoes.txt");

        writeText.getParentFile().mkdirs();

        try {
            PrintWriter printWriter = new PrintWriter(writeText);

            Scanner scanner = new Scanner(outText);

            while (scanner.hasNextLine()) {

                String a = scanner.nextLine();

                String[] line = a.split(";");

                if (Integer.parseInt(line[2]) == 0){

                    a = String.join(" ", line);

                    printWriter.println(a);

                }
            }

            printWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

    }
}
