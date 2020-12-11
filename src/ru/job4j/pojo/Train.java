package ru.job4j.pojo;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " Плавно едет по рельсам");
    }

    @Override
    public void fuelUsed() {
        System.out.println(getClass().getSimpleName() + " Ездит на электричестве");
    }
}
