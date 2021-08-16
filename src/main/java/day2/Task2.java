package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a >= b ){
            System.out.println("Некорректный ввод");
        } else {
            for (int i = a; b > i ; i++){
                if (i % 5 == 0 && i % 10 != 0 && a != i){
                    System.out.print(i+ " ");
                }
            }
        }
    }
}
