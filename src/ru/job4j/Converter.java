package ru.job4j;

public class Converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60; /* формула перевода рублей в доллары. */
        return rsl;
    }

    public static void main(String[] args) {
        int in = 140;
        int expectedEuro = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = out == expectedEuro;
        System.out.println(passed);

        int in2 = 180;
        int expectedUsd = 3;
        int out2 = Converter.rubleToDollar(in2);
        boolean passedUsd = out2 == expectedUsd;
        System.out.println(passedUsd);

        int euro = Converter.rubleToEuro(140);
        // System.out.println("140 rubles are " + euro + " euro.");
        int usd = Converter.rubleToDollar(180);
       // System.out.println("180 rubles are " + usd + " usd." );
    }
}
