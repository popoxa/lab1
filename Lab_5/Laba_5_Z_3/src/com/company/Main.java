package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        System.out.print("Введите координату центра окружности х: ");
        double x = in.nextDouble();
        System.out.print("Введите координату центра окружности y: ");
        double y = in.nextDouble();
        System.out.print("Введите радиус окружности r: ");
        double r = in.nextDouble();
        if(r <= 0 ){
            System.exit(0);
        }
        Circle inp = new Circle(x,y,r);
        inp.output();

    }
}
