package com.snakeladder;

import java.util.Random;

public class Uc3_SnakeAndLadder {


    public static void main(String[] args) {
        int playerPosition = 0;


        Random random = new Random();
        int diceNumber = random.nextInt(6) + 1;
        System.out.println("Dice Number is = " + diceNumber);

        int move = random.nextInt(3);

        switch (move) {
            case 0:
                System.out.println("No move");break;
            case 1:
                System.out.println("Ladder");
                playerPosition = playerPosition + diceNumber;break;
            default:
                System.out.println("Snake");
                playerPosition = playerPosition - diceNumber;break;
        }
        System.out.println("Player position is " + playerPosition);
    }
}
