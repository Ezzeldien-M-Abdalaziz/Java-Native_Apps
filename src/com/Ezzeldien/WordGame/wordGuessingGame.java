package com.Ezzeldien.WordGame;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class wordGuessingGame {

    private String wordToGuess;
    private char[] guessedLetters;
    private int attempts = 10;
    private List<String> guessedWords;

    public wordGuessingGame(String[] wordList, int maxAttempts, List<String> guessedWords) {
        this.guessedWords = guessedWords;
        this.attempts = maxAttempts;

        Random rand = new Random();

        // pick a new word that wasn’t used before
        do {
            wordToGuess = wordList[rand.nextInt(wordList.length)];
        } while (guessedWords.contains(wordToGuess));

        guessedWords.add(wordToGuess);

        guessedLetters = new char[wordToGuess.length()];
        for (int i = 0; i < guessedLetters.length; i++) {
            guessedLetters[i] = '_';
        }
    }

    public void play() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hint for testing: " + wordToGuess);

        while (attempts > 0) {
            System.out.println("Attempts: " + attempts);
            System.out.println("Word: " + String.valueOf(guessedLetters));
            System.out.print("Guess a letter: ");

            String input = sc.nextLine();
            if (input.isEmpty()) { System.out.println("Enter a letter."); continue; }

            char letter = input.charAt(0);

            if (!Character.isLetter(letter)) {
                System.out.println("Invalid.");
                continue;
            }

            if (wordToGuess.contains(String.valueOf(letter))) {

                for (int i = 0; i < wordToGuess.length(); i++) {
                    if (wordToGuess.charAt(i) == letter) {
                        guessedLetters[i] = letter;
                    }
                }

                if (new String(guessedLetters).equals(wordToGuess)) {
                    System.out.println("You guessed it! -> " + wordToGuess);
                    return;
                }

            } else {
                System.out.println("Wrong letter.");
            }

            attempts--;
        }

        System.out.println("Out of attempts! Word was: " + wordToGuess);
    }
}
