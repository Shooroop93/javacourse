package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

        Random random = new Random();

        int m = 12;
        int n = 8;
        int [] maxNum = new int[m];
        int index = 0;
        int max = maxNum[0];


        int[][] numbers = new int[m][n];

        for(int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                numbers[i][j] = random.nextInt(50);
            }
        }

        for ( int a = 0; a < numbers.length; a ++){
            int sum = 0;
            for (int b = 0; b < numbers[a].length; b ++){
                sum += numbers[a][b];
            }
            if (numbers[a].length == n){
                maxNum[a] = sum;
            }
        }

        for ( int c = 1; c < maxNum.length; c++){
            if (max < maxNum[c]){
                max = maxNum[c];
                index = c;
            }
        }

        System.out.printf("Ответ : %d (индекс строки, сумма чисел в которой максимальна ", index);



//        for (int h = 0; h < numbers.length; h++){
//            for (int g = 0; g < numbers[h].length;g ++){
//                System.out.print(numbers[h][g] + " ");
//            }
//            System.out.println();
//        }

//        System.out.println(Arrays.toString(maxNum));

    }
}
