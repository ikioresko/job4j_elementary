package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int rsl = 0;
        for (int y = 0; y < array.length; y++) {
            for (int x = 0; x < array[y].length; x++) {
                rsl = rsl + array[y][x];
            }
        }
        return rsl;
    }
}
