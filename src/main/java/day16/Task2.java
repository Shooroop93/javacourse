package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Task2 {
    public static void main(String[] args) {

        String file1 = "src/main/java/day16/file/file1.txt";
        String file2 = "src/main/java/day16/file/file2.txt";

        File text1 = new File(file1);
        File text2 = new File(file2);

        text1.getParentFile().mkdirs();
        text2.getParentFile().mkdirs();

        writeRandomNumbersInFile1(text1);
        writeNumbersInFile2(text1, text2);
        printResult(text2);
        
    }
    public static void writeRandomNumbersInFile1 (File file) {

        Random random = new Random();

        try {
            PrintWriter printWriter1 = new PrintWriter(file);

            for (int i = 0; i < 1000; i ++) {

                printWriter1.print(random.nextInt(101) + " ");

            }

            printWriter1.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void writeNumbersInFile2(File file1, File file2) {

        try {
            List<Integer> list = new ArrayList<>();
            Scanner scanner = new Scanner(file1);
            PrintWriter printWriter = new PrintWriter(file2);
            int count = 0;
            int sumNumbers = 0;

            while (scanner.hasNextInt()){

                sumNumbers += scanner.nextInt();
                count += 1;

                if (count == 20){
                    count = 0;
                    sumNumbers = sumNumbers / 20;
                    list.add(sumNumbers);
                    sumNumbers = 0;
                }

            }

            for (Integer num : list) {

                printWriter.print(num + " ");

            }

            printWriter.close();

            scanner.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void printResult (File file){

        try {
            Scanner scanner = new Scanner(file);

            double sumNumbers = 0;

            String[] numbers = scanner.nextLine().split(" ");

            for(String num : numbers) {

                sumNumbers += Double.parseDouble(num);

            }

            System.out.println((int)sumNumbers);

            scanner.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
