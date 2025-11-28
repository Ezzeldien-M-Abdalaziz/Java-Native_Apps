package com.Ezzeldien.FileManager;

public interface UserInterface {

    public void start();
    public void subscribe(UiEventHandler handler);
    public void display(String message);
}
