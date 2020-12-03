package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int row = 0;
        int column = 0;
        for (int i = 0; i < rsl.length; i++) {
            if (row > left.length - 1) {
                int temp = right[column];
                rsl[i] = temp;
                column++;
            } else if (column > right.length - 1) {
                int temp = left[row];
                rsl[i] = temp;
                row++;
            } else if (left[row] > right[column]) {
                int temp = right[column];
                rsl[i] = temp;
                column++;
            } else {
                int temp = left[row];
                rsl[i] = temp;
                row++;
            }
            }
         return rsl;
    }
}