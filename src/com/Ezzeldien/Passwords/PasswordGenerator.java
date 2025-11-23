package com.Ezzeldien.Passwords;

import java.util.HashMap;
import java.util.Random;

public class PasswordGenerator {

    String generatedPassword(int length , boolean useLowercase, boolean useUppercase, boolean useSymbols  , boolean useNumbers) {
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String symbols = "~!@#$%^&*()_+-={}[]\\|;:'\",./<>?";
        String numbers = "0123456789";

        HashMap<Integer, String> map = new HashMap<>();
        map.put(0 , lowerCase);
        map.put(1 , upperCase);
        map.put(2 , symbols);
        map.put(3 , numbers);


        StringBuilder password = new StringBuilder();
        Random rand1 = new Random();
        Random rand = new Random();

        for (int i = 0; i < length; i++) {
          String value =  map.get(rand1.nextInt(4));
            char nextLetter = value.charAt(rand.nextInt(value.length()));
            password.append(nextLetter);
        }

        return password.toString();
    }
}
