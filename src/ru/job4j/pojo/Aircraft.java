package ru.job4j.pojo;

public class Aircraft implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " Летит со скоростью 700 км/ч");
    }

    @Override
    public void fuelUsed() {
        System.out.println(getClass().getSimpleName() + " Летает на керосине");
    }
}
