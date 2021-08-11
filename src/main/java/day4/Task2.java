package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        int maxNum = 0;
        int minNum = 0;
        int countNum0 = 0;
        int sumCountNum0 = 0;

        Random random = new Random();

        int[] numbers = new int[100];

        for (int i = 0; i <100; i++){
            numbers[i] = random.nextInt(10000);
        }

        for (Integer num : numbers){
            if (num % 10 == 0){
                countNum0 ++ ;
                sumCountNum0 += num ;
            }
        }

        for (Integer max : numbers){
            if (max > maxNum){
                maxNum = max;
            }
        }



        System.out.printf("Наибольший элемент массива: %d\n",maxNum);
        System.out.printf("Наибольший элемент массива: %d\n",Arrays.stream(numbers).max().hashCode());
        System.out.printf("Наименьший элемент массива: %d\n",Arrays.stream(numbers).min().hashCode());
        System.out.printf("Количество элементов массива, оканчивающихся на 0: %d\n",countNum0);
        System.out.printf("Сумма элементов массива, оканчивающихся на 0: %d\n",sumCountNum0);
        System.out.println(Arrays.toString(numbers));
    }
}
