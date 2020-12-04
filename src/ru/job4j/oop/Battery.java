package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public void exchange(Battery another) {
        another.load = another.load + this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery first = new Battery(5);
        Battery second = new Battery(10);
        System.out.println("Заряд первой батареи: " + first.load + ". Заряд второй батареи: " + second.load);
        first.exchange(second);
        System.out.println("Заряд первой батареи: " + first.load + ". Заряд второй батареи: " + second.load);
    }
}
