package com.Ezzeldien.Passwords;

import java.util.HashMap;
import java.util.Random;

public class PasswordGenerator {

    private boolean hasOverLap(String s1 , String s2){
        for(char c : s1.toCharArray()){
            if(s2.contains(String.valueOf(c))){
                return true;
            }
        }
        return false;
    }

    String generatedPassword(int length , boolean useLowercase, boolean useUppercase, boolean useSymbols  , boolean useNumbers) {
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String symbols = "~!@#$%^&*()_+-={}[]\\|;:'\",./<>?";
        String numbers = "0123456789";

        StringBuilder charsOptions = new StringBuilder();

        if (useLowercase) charsOptions .append(lowerCase);
        if (useUppercase) charsOptions.append(upperCase);
        if (useSymbols) charsOptions.append(symbols);
        if (useNumbers) charsOptions.append(numbers);

        String allChars = charsOptions.toString();

        while(true) {
            boolean PasswordIsValid = true;
            StringBuilder password = new StringBuilder();
            Random rand = new Random();
            for (int i = 0; i < length; i++) {
                char nextLetter = allChars.charAt(rand.nextInt(allChars.length()));
                password.append(nextLetter);
            }

            String generatedPassword = password.toString();

            if( useLowercase && !hasOverLap(generatedPassword,lowerCase)){
                PasswordIsValid = false;
            };
            if( useUppercase && !hasOverLap(generatedPassword,upperCase)){
                PasswordIsValid = false;
            };
            if( useSymbols && !hasOverLap(generatedPassword,symbols)){
                PasswordIsValid = false;
            };
            if( useNumbers && !hasOverLap(generatedPassword,numbers)){
                PasswordIsValid = false;
            };


            if( PasswordIsValid){
                return generatedPassword;
            }else{
                System.out.println( "Generated password doesn't meet the requirments " + generatedPassword + ", trying again");
            }
        }
    }
}
