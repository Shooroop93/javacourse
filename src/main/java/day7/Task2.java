package day7;

import day7.classes.Player;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

    Player player1 = new Player(randomNum(100,90));



    Player.info();


    }

    static int randomNum (int max, int min) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
}
