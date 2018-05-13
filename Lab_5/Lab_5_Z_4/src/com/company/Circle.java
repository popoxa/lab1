package com.company;

public class Circle {
    public double x,y,r;

    public Circle(double a, double b, double s){
        x = a;
        y = b;
        r = s;
    }

    public double rast (Circle a){
        double rast = Math.sqrt(Math.pow(x - a.x,2) + Math.pow(y - a.y,2));
        return rast;
    }

}
