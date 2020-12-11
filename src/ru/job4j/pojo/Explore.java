package ru.job4j.pojo;

public class Explore {
    public static void main(String[] args) {
        Aircraft a1 = new Aircraft();
        Train t1 = new Train();
        Bus b1 = new Bus();
        Vehicle a2 = a1;
        Vehicle t2 = t1;
        Vehicle b2 = b1;
        Vehicle[] array = {a2, t2, b2};
        for (int i = 0; i < array.length; i++) {
            array[i].fuelUsed();
        }
        System.out.println();
        Vehicle air = new Aircraft();
        Vehicle train = new Train();
        Vehicle bus = new Bus();
        Vehicle[] array2 = {air, train, bus};
        for (Vehicle x : array2) {
            x.move();
        }
    }
}
