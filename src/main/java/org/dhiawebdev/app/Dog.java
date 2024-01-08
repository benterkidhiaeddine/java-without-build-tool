package org.dhiawebdev.app;

public class Dog extends User {
    public Dog(String name, int age) {
        super(name, age);
    }

    public String toString() {
        return this.name + " is aged " + this.age;
    }
}
