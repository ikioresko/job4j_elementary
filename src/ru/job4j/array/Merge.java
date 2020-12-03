package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int x = 0;
        int y = 0;
        for (int i = 0; i < rsl.length; i++) {
            if (x > left.length - 1) {
                int r = right[y];
                rsl[i] = r;
                y++;
            } else if (y > right.length - 1) {
                int r = left[x];
                rsl[i] = r;
                x++;
            } else if (left[x] > right[y]) {
                int r = right[y];
                rsl[i] = r;
                y++;
            } else {
                int r = left[x];
                rsl[i] = r;
                x++;
            }
            }
         return rsl;
    }
}