package com.Ezzeldien.Passwords;

public class App {

    public static void main(String[] args) {
        UserInterface ui = new TextBasedInterface();

        int length = ui.getPasswordLength();
        boolean useLowercase = ui.useLowercase();
        boolean useUppercase = ui.useUppercase();
        boolean useNumbers = ui.useNumbers();
        boolean useSymbols = ui.useSymbols();

        PasswordGenerator pg = new PasswordGenerator();
        String password = pg.generatedPassword(length , useLowercase , useUppercase , useSymbols , useNumbers );
        ui.displayPassword(password);
    }
}
