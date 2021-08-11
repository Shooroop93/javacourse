package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city;
        boolean flag = true;

        while (flag){
            city = scanner.nextLine();

            if (city.equals("Stop")){
                flag = false;
            }

            switch (city){
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Россия");
                    return;
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Италия");
                    return;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Англия");
                    return;
                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                    System.out.println("Германия");
                    return;
                default:
                    System.out.println("Неизвестная страна");
                    return;
            }

        }
    }
}
