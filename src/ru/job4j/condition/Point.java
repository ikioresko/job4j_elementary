package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {
    private double x;
    private double y;
    private double z;

    public Point(double first, double second) {
        this.x = first;
        this.y = second;
    }

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        System.out.println(dist);

        Point a2 = new Point(0, 0, 1);
        Point b2 = new Point(1, 4, 2);
        double dist3d = a2.distance3d(b2);
        System.out.println(dist3d);
    }
}