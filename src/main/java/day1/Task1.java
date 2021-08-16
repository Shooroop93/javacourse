package day1;

public class Task1 {
    public static void main(String[] args) {
        int count = 0;
        boolean flag = true;
        while (flag){
            System.out.print("JAVA ");
            count ++;
            if (count == 10){
                break;
            }
        }
        System.out.println();

        for (int i = 0; i < 10; i ++) {
            System.out.print("JAVA ");
        }
    }
}
