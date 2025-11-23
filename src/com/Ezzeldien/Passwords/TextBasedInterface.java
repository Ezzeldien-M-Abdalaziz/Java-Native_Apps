package com.Ezzeldien.Passwords;

import java.util.Scanner;
public class TextBasedInterface implements UserInterface{

    private Scanner scanner;

    public TextBasedInterface() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public int getPasswordLength() {
        System.out.println("Enter password length: ");
        return scanner.nextInt();
    }

    @Override
    public boolean useLowercase() {
        System.out.println("would you like to use lowercase? (Y/N): ");
        return scanner.next().equalsIgnoreCase("y");
    }

    @Override
    public boolean useUppercase() {
        System.out.println("would you like to use upperCase? (Y/N): ");
        return scanner.next().equalsIgnoreCase("y");
    }

    @Override
    public boolean useNumbers() {
        System.out.println("would you like the password to have numerical chars? (Y/N): ");
        return scanner.next().equalsIgnoreCase("y");
    }

    @Override
    public boolean useSymbols() {
        System.out.println("would you like the password to have symbols? (Y/N): ");
        return scanner.next().equalsIgnoreCase("y");
    }

    @Override
    public void displayPassword(String password) {
        System.out.println("Here is the Password: " + password);
    }
}
