package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        System.out.print("Введите координату центра первой окружности х: ");
        double x = in.nextDouble();
        System.out.print("Введите координату центра первой окружности y: ");
        double y = in.nextDouble();
        System.out.print("Введите радиус первой окружности r: ");
        double r = in.nextDouble();
        if(r <= 0 ){
            System.exit(0);
        }
        Circle a = new Circle(x,y,r);

        System.out.print("Введите координату центра второй окружности х: ");
        double x1 = in.nextDouble();
        System.out.print("Введите координату центра второй окружности y: ");
        double y1 = in.nextDouble();
        System.out.print("Введите радиус второй окружности r: ");
        double r1 = in.nextDouble();
        if(r <= 0 ){
            System.exit(0);
        }
        Circle a1 = new Circle(x1,y1,r1);
        System.out.print("Расстояние между центрами двух окружностей равно: " + a.rast(a1));
    }

}
