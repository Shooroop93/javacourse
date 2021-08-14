package day8;

public class Task1 {
    public static void main(String[] args) {

        String number = "";

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 20001; i++ ){
            number = number + i + " ";
        }
        long stopTime = System.currentTimeMillis();

        System.out.println(number);


        StringBuilder line = new StringBuilder();

        long startTime2 = System.currentTimeMillis();
        for (int j = 0; j < 20001; j++) {
            line.append(j+" ");
        }
        long stopTime2 = System.currentTimeMillis();

        System.out.println(line);

        System.out.println("Длительность работы String, в мс: "+ (stopTime - startTime));
        System.out.println("Длительность работы StringBuilder, в мс: "+ (stopTime2 - startTime2));
    }
}
