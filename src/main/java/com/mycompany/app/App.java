package com.mycompany.app;

/**
 * Hello world!
 */
public class App {


    private final String message = "Hello World!";

    public App(){};

    public static void main(String[] args) {
        try {
            System.out.println(new App().getMessage());
        } catch (Exception ex) {
            throw new RuntimeException("Boo");
        }
    }

    private final String getMessage() {
        return message;
    }

}
