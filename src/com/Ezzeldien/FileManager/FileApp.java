package com.Ezzeldien.FileManager;

public class FileApp implements UiEventHandler{
    FileManager fm = null;
    FileApp() {
        this.fm = new FileManager();
    }

    @Override
    public void onList(String Path) {
        this.fm.listFiles(Path);
    }

    @Override
    public void onCreate(String Path) {
        this.fm.createDirectory(Path);
    }

    @Override
    public void onDelete(String Path) {
        this.fm.deleteFileOrDirectory(Path);
    }


    //main
    public static void main(String[] args) {
        UserInterface ui = new TextBasedInterface();
        ui.subscribe(new FileApp());

        ui.start();

        ui.display("File Manager");
    }

}
