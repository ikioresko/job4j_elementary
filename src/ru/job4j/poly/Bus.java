package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void ride() {
        System.out.println("куда то едет");
    }

    @Override
    public void passenger(int passenger) {
        System.out.println("Количество пассажиров: " + passenger);
    }

    @Override
    public int tankcost(int fuel) {
        int cost = fuel * 50;
        return cost;
    }
}