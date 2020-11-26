package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static void main(String[] args) {
        int rslt = Max.max(1, 5);
        System.out.println(rslt);
        rslt = Max.max(8, 5);
        System.out.println(rslt);
    }
}
