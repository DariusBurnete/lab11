package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Alex");
        names.add("Ion");
        names.add("Vasile");

        //List<String> filteredNames = names
        //        .stream()
        //        .filter(name -> name.length() >= 6)
        //        .toList();

        //List<String> filteredNames_ = names
        //        .stream()
        //        .filter(name -> name.length() <= 4)
        //        .map(name -> name)
        //        .toList();

        //String filteredNames__ = names
        //        .stream()
        //        .map(name -> name)
        //        .reduce((a,b) -> a + " " + b)
        //        .get();

        names
                .stream()
                .filter(name -> name.length() >= 6)
                .forEach(name -> System.out.println());
        names
                .stream()
                .filter(name -> name.length() <= 4)
                .forEach(name -> System.out.println());
        names
                .stream()
                .reduce((a, b) -> a + " " + b)
                .ifPresent(name -> System.out.println());
    }
}