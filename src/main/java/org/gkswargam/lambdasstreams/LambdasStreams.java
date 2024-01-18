package org.gkswargam.lambdasstreams;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class LambdasStreams {
    public static void main(String[] args) {
//        q1();
//        q2();
//        q3();
//        q4();
//        q5();
//        q6();
//        q7();
//        q8();
//        q9();
//        q10();
//        q11();
//        q12();
//        q13();
        q14();
    }

    // For the list of integers, iterate over it and print the square of each number.
    public static void q1() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers
                .stream()
                .map(x -> x * x)
                .forEach(System.out::println);
    }

    //  For the list of integers, find all the even numbers. Then, iterate over the even numbers and print each number.
    public static void q2() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers
                .stream()
                .filter(x -> x % 2 == 0)
                .forEach(System.out::println);
    }

    // For a list of integers, return a list of the squares of each number.
    public static void q3() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> list = numbers
                .stream()
                .map(x -> x * x)
                .toList();
        System.out.println(list);
    }

    // For a list of strings, return a list of the length of each string.
    public static void q4() {
        List<String> names = List.of("Tantia Tope", "Rani Lakshmibai", "Mangal Pandey", "Nana Sahib");
        List<Integer> list = names
                .stream()
                .map(String::length)
                .toList();
        System.out.println(list);
    }

    // For a list of strings, filter out the strings which do not start with the letter T
    // and then uppercase the remaining strings.
    public static void q5() {
        List<String> names = List.of("Tantia Tope", "Rani Lakshmibai", "Mangal Pandey", "Nana Sahib");
        names
                .stream()
                .filter(s -> !s.startsWith("T"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

    // For a list of strings, filter out the strings which do not start with the letter T,
    // then uppercase the remaining strings and then sort them.
    public static void q6() {
        List<String> names = List.of("Tantia Tope", "Rani Lakshmibai", "Mangal Pandey", "Nana Sahib");
        names
                .stream()
                .filter(s -> !s.startsWith("T"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }

    // For a list of integers, find the sum of all the numbers.
    public static void q7() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = numbers
                    .stream()
                    .reduce(0, Integer::sum);
        System.out.println(sum);
    }

    // For a list of integers, find the sum of the squares of all the numbers.
    public static void q8() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = numbers
                    .stream()
                    .map(x -> x * x)
                    .reduce(0, Integer::sum);
        System.out.println(sum);
    }

    // For a list of integers, find the sum of the squares of all the even numbers.
    public static void q9() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = numbers
                    .stream()
                    .filter(x -> x % 2 == 0)
                    .map(x -> x * x)
                    .reduce(0, Integer::sum);
        System.out.println(sum);
    }

    // Given a list of numbers, find the maximum number in the list.
    public static void q10() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int maxVal = numbers
                        .stream()
                        .reduce(0, (x, y) -> x > y ? x : y);
        System.out.println(maxVal);
    }

    // Given a list of numbers with duplicates, find the distinct numbers in the list.
    public static void q11() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5);
        List<Integer> list = numbers
                                .stream()
                                .distinct()
                                .toList();
        System.out.println(list);
    }

    // Given a list of numbers, find the average of all the numbers.
    public static void q12() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        double avg = (double) numbers
                        .stream()
                        .reduce(0, Integer::sum) / numbers.size();
        System.out.println(avg);
    }

    // Give a list of strings, find the average length of all the strings.
    public static void q13() {
        List<String> names = List.of("Tantia Tope", "Rani Lakshmibai", "Mangal Pandey", "Nana Sahib");
        OptionalDouble avg = names
                .stream()
                .mapToInt(String::length)
                .average();
        System.out.println(avg.getAsDouble());
    }

    // Given a list of strings, find the first string that is longer than 10 characters.
    public static void q14() {
        List<String> names = List.of("Tantia Tope", "Rani Lakshmibai", "Mangal Pandey", "Nana Sahib");
        Optional<String> name = names
                                    .stream()
                                    .filter(s -> s.length() > 10)
                                    .findFirst();
        System.out.println(name);
    }
}
