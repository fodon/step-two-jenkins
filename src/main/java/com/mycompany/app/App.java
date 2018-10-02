package com.mycompany.app;


import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.servlet.ServletHandler;

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
