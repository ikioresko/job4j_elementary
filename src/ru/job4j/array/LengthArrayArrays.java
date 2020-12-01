package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] array = {{1}, {2, 3}, {4, 5, 6}, {7, 8, 9, 0}};
        for (int i = 0; i < array.length; i++) {
            System.out.println("Размер вложенного массива с индесом " + i + " равен: " + array[i].length);
        }
    }
}
