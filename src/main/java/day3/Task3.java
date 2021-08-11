package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        double delimoe;
        double delitelb;
        int count = 0;

        Scanner scanner = new Scanner(System.in);

        while (count < 5){
            count ++;
            delimoe = scanner.nextDouble();
            delitelb = scanner.nextDouble();

            if (delitelb == 0){
                System.out.println("Деление на 0");
                continue;
            }

            System.out.println(delimoe / delitelb);

        }

    }
}
