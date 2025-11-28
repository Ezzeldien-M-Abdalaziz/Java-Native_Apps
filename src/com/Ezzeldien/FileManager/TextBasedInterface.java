package com.Ezzeldien.FileManager;

import java.util.Scanner;

public class TextBasedInterface implements UserInterface{

   private UiEventHandler handler = null;

    @Override
    public void start() {

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("File Manager Menu: ");
            System.out.println("1- List All Files");
            System.out.println("2- create New directory");
            System.out.println("3- Delete a file or directory");
            System.out.println("4- Exit program");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter Path: ");
                    String pathToList = scanner.nextLine();
                    handler.onList(pathToList);
                    break;
                case 2:
                    System.out.println("Enter Path: ");
                    String pathToCreate = scanner.nextLine();
                    handler.onCreate(pathToCreate);
                    break;
                case 3:
                    System.out.println("Enter Path to delete: ");
                    String pathToDelete = scanner.nextLine();
                    handler.onDelete(pathToDelete);
                    break;
                case 4:
                    System.out.println("Exit program");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }

    }

    @Override
    public void subscribe(UiEventHandler handler) {
        if(this.handler == null){
            this.handler = handler;
        }
    }

    @Override
    public void display(String message) {
        System.out.println(message);
    }
}
