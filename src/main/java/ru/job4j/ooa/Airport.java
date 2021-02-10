package ru.job4j.ooa;

public class Airport {
    public static void main(String[] args) {
        new Aircraft().printModel();
        Airbus airbus = new Airbus("A320");
        airbus.printModel();
        airbus.printCountEngine();
        System.out.println();
        airbus.setName("A380");
        airbus.setCountEngine(4);
        airbus.printModel();
        airbus.printCountEngine();
    }
}
