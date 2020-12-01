package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int y = 1; y <= size; y++) {
            for (int x = 1; x <= size; x++) {
                table[y - 1][x - 1] = y * x;
            }
        }
        return table;
    }
}
