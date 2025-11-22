package com.Ezzeldien.Dice;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Simulator {

    public static void main(String[] args) {

        boolean appCompleted = false;
        do {
            try {
                DiceLogic();
                appCompleted = true;

            } catch (InputMismatchException e) {
                System.out.println("Please enter a number");
            }
        }while (!appCompleted);
        }


    static void DiceLogic(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Dice Simulator , How many times you want to roll?");
        int numberOfDice = sc.nextInt();
        System.out.println("About to roll the dice of " + numberOfDice + " dice");

        Random rand = new Random();
        for (int i = 0; i < numberOfDice; i++) {
            int rolledNumber = rand.nextInt(6) + 1;   //from 1 -> 6
            System.out.println(display(rolledNumber));
        }
    }

    static String display(int value){
        return switch (value) {
            case 1 -> "---------\n|       |\n|   o   |\n|       |\n---------";
            case 2 -> "---------\n| o     |\n|       |\n|     o |\n---------";
            case 3 -> "---------\n| o     |\n|   o   |\n|     o |\n---------";
            case 4 -> "---------\n| o    o |\n|        |\n| o    o |\n---------";
            case 5 -> "---------\n| o    o |\n|   o    |\n| o    o |\n---------";
            case 6 -> "---------\n| o    o |\n| o    o |\n| o    o |\n---------";
            default -> "";
        };
    }

}
