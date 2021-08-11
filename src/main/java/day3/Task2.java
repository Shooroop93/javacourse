package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double delimoe ;
        double delitelb;
        boolean flag = true;

        while(flag){
            delimoe = scanner.nextDouble();
            delitelb = scanner.nextDouble();

            if(delitelb == 0){
                flag = false;
                break;
            }

            System.out.println(delimoe / delitelb);

        }
    }
}
