package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int count = a;

        if (a >= b){
            System.out.println("Некорректный ввод");
        }else {
            while ( count <= b){
                if (count % 5 == 0){
                    if (count % 10 != 0){
                        if(count != a) {
                            if (count != b){
                                System.out.print(count+" ");
                            }
                        }
                    }
                }
                count++;
            }
        }
    }
}
