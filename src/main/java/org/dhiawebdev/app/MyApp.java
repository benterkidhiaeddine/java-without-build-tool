package org.dhiawebdev.app;

import java.lang.System;

import org.dhiawebdev.app.service.Service;

public class MyApp {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("You must provide two numbers, Usage : command <number1> <number2>");
            System.exit(1);
        }

        System.out.println("Hello world");

        User dhia = new User("dhia", 25);
        System.out.println(dhia);
        Dog spike = new Dog("spike", 7);
        System.out.println(spike);

        Service service = new Service();
        int result2 = service.addNumber(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        System.out
                .println(String.format("the result of the computation: of %s and %s is %d", args[0], args[1], result2));
    }
}