package org.gkswargam.generics;

import org.gkswargam.models.Person;

public class GenericMethods {
    public static void main(String[] args) {
        print("Hello world");
        print(123);
        print(1.2);
        print(new Person("Steve", "Jobs"));

        print("Hello world", 1);
    }
    public static <T> void print(T t) {
        System.out.println(t);
    }

    public static <T, U> void print(T t, U u) {
        System.out.println(t + " " + u);
    }
}
