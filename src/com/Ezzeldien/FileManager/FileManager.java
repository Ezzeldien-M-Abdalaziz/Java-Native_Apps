package com.Ezzeldien.FileManager;

import java.io.File;

public class FileManager {

    public void listFiles(String directoryPath) {
        File directory = new File(directoryPath);  //file class helper used for file or directory\
        if(directory.exists() && directory.isDirectory()) {  //check if it exists and if it's a dir not a file
            File[] contents = directory.listFiles();   //get all files inside the dir

            if(contents != null) {
                for(File file : contents) {
                    if(file.isDirectory()){
                        System.out.println("[DIR]: " + file.getName());
                    }else{
                        System.out.println("[FILE]: " + file.getName());
                    }
                }
            }else{
                System.out.println("Directory is empty.");
            }
        }else{
            System.out.println("Invalid directory path.");
        }
    }

    public void createDirectory(String directoryPath) {
        File directory = new File(directoryPath);

        if(directory.mkdir()) {   //inside an if because it returns a boolean value
            System.out.println("Directory created.");
        }else{
            System.out.println("Directory could not be created.");
        }
    }

    public void deleteFileOrDirectory(String directoryOrFilePath) {
        File file = new File(directoryOrFilePath);
        if(file.delete()) {  //inside an if because it returns a boolean value
            System.out.println("File deleted.");
        }else{
            System.out.println("File could not be deleted.");
        }
    }
}
