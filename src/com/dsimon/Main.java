package com.dsimon;

public class Main {

    public static void main(String[] args) {
        System.out.println(AreaCalculator.area(5.0) == 78.53981633974483);
        System.out.println(AreaCalculator.area(-1) == -1);
        System.out.println(AreaCalculator.area(5.0, 4.0) == 20.0);
        System.out.println(AreaCalculator.area(-1.0, 4.0) == -1);
    }
}
