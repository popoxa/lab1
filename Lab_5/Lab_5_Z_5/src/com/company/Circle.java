package com.company;

public class Circle {
    public double x,y,r;

    public Circle(double a, double b, double s){
        x = a;
        y = b;
        r = s;
    }

    public double rast (Circle a){
        double rast = Math.sqrt(Math.pow(x - a.x,2)+Math.pow(y-a.y,2));
        return rast;
    }

    public boolean kasan(Circle a) {
        double rast = rast(a);
        if (rast == r + a.r){
            return true;
        }
            else if (r > a.r && rast == r - a.r){
                return true;
            }
                else if (a.r > r && rast == a.r - r) {
                    return true;
                }
                    else{
            return false;
        }
        }

    }





