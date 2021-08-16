package day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        int countNumBol8 = 0;
        int countNum1 = 0;
        int countChetNum = 0;
        int countNeChetNum = 0;
        int sumAllNum = 0;

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[scanner.nextInt()];

        for (int i = 0; i <=9; i++){
            numbers[i] = random.nextInt(10);
        }

        for (Integer num : numbers) {
            if (num > 8) {
                countNumBol8++;
            }
            if (num == 1) {
                countNum1++;
            }
            if (num % 2 == 0){
                countChetNum++;
            }else {
                countNeChetNum++;
            }
            sumAllNum = sumAllNum + num;
        }

        System.out.printf("Длина массива: %d\n",numbers.length);
        System.out.printf("Количество чисел больше 8: %d\n", countNumBol8);
        System.out.printf("Количество чисел равных 1: %d\n", countNum1);
        System.out.printf("Количество четных чисел: %d\n", countChetNum);
        System.out.printf("Количество нечетных чисел: %d\n", countNeChetNum);
        System.out.printf("Сумма всех элементов массива: %d\n", sumAllNum);

    }
}
