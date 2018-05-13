package com.company;

public class Circle {
    public double x, y, r;

    public Circle(double a, double b, double s) {
        x = a;
        y = b;
        r = s;
    }

    public void output() {
        System.out.println("Окружность с центром (" + x + ";" + y + ") и радиусом " + r);
    }
}
