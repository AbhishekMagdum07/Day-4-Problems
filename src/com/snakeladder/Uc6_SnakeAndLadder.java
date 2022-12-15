package com.snakeladder;

import java.util.Random;

public class Uc6_SnakeAndLadder {
    public static void main(String[] args) {

        int playerPosition = 0;
        int count = 0;
        Random random = new Random();

        while (playerPosition < 100) {
            count ++;
            int diceNumber = random.nextInt(6) + 1;
            int move = random.nextInt(3);


            switch (move) {
                case 0:
                    System.out.println("No move");
                    break;
                case 1:
                    System.out.println("Ladder");
                    playerPosition = playerPosition + diceNumber;
                    if (playerPosition > 100) {
                        playerPosition = 100;
                    }
                    break;
                default:
                    System.out.println("Snake");
                    playerPosition = playerPosition - diceNumber;
                    if (playerPosition < 0) {
                        playerPosition = 0;
                    }
                    break;
            }

            System.out.println("Player position is " + playerPosition);

        }
        System.out.println("Number of Times dice was played to win the game = " + count);
    }
}
