package com.Ezzeldien.WordGame;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        String[] words = {"java", "apps", "programming", "method", "computer", "screen"};

        int wordsToGuess = 3;
        List<String> guessedWords = new ArrayList<>();

        while (wordsToGuess > 0) {
            wordGuessingGame game = new wordGuessingGame(words, 10, guessedWords);
            game.play();
            wordsToGuess--;
        }

        System.out.println("Game finished! You solved " + guessedWords.size() + " words.");
    }
}
