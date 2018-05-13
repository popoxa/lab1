package com.company;

public class Circle {
    public double x,y,r;




    public Circle(double a, double b, double c) {
        x = a;
        y = b;
        r = c;
        }

     public double longcircle() {
       return (Math.PI*2*r);
    }
}

