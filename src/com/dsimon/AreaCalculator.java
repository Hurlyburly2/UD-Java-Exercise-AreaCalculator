package com.dsimon;

public class AreaCalculator {
    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }
        return radius * radius * Math.PI;
    }

    public static double area(double x, double y) {
        //  If either method is negative return -1
        //  Return the area of the rectangle
        if (x < 0 || y < 0) {
            return -1;
        }
        return x * y;
    }
}
