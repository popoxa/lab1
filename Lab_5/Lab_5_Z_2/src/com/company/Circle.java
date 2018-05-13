package com.company;

public class Circle {
    public double x,y,r;


    public Circle(double a , double b , double с){
        x = a;
        y = b;
        r = с;
        }

        public void Cbox(){
            x = x + (int) (Math.random()*199-99);
            y = y + (int) (Math.random()*199-99);
            }

}
