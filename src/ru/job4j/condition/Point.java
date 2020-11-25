package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double first = Math.pow((x2-x1), 2);
        double second = Math.pow((y2-y1), 2);
        double rsl = Math.sqrt(first+second);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        double result2 = Point.distance(1, 1, 4, 3);
        double result3 = Point.distance(12, 21, 34, 43);
        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println("result (1, 1) to (4, 3) " + result2);
        System.out.println("result (12, 21) to (34, 43) " + result3);
    }
}
