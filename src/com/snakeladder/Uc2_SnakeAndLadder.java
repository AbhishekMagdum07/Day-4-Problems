package com.snakeladder;

import java.util.Random;

public class Uc2_SnakeAndLadder {

    /*
     The player roll the die to get number between 1 to 6 .
     */

    public static void main(String[] args) {

        Random random = new Random();
        int dice = random.nextInt(6)+1;
        System.out.println("Dice Number is = " + dice);
    }
}
