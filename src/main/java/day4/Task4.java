package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {

        Random random = new Random();

        int randomNum = 10000;
        int lengthArray = 100;
        int maxNumsThree = 0;
        int index = 0;

        int[] numbers = new int[lengthArray];

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(randomNum);
        }

        for (int a = 0; a < numbers.length; a++){
            int maxNums = 0;
            int num1 = 0;
            int num2 = 0;
            int num3 = 0;

            num1 = numbers[a];
            if ((a+1)<numbers.length) {
                num2 = numbers[a + 1];
            }
            if ((a+2)<numbers.length) {
                num3 = numbers[a + 2];
            }

            maxNums = num1+num2+num3;

            if (maxNumsThree < maxNums){
                maxNumsThree = maxNums;
                index = a;
            }
        }

        System.out.println(index);

    }
}
