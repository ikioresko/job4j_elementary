package ru.job4j.pojo;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " Собирает все кочки в деревне");
    }

    @Override
    public void fuelUsed() {
        System.out.println(getClass().getSimpleName() + " Ездит на бензине, дизеле или газе");
    }
}
