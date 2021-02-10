package ru.job4j.array;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        for (int y = 0; y < array.length; y++) {
            for (int x = 0; x < array.length; x++) {
                if (array[y][x] < 0) {
                    array[y][x] = 0;
                }
            }

        }
        return array;
    }
}
