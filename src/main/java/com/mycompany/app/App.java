package com.mycompany.app;

/**
 * Hello world!
 * First commit
 */
public class App
{

    private final String message = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
        System.out.println("jenkins");
        System.out.println("jenkins2");
    }

    private final String getMessage() {
        return message;
    }

}
