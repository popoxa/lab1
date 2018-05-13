package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Circle o1 = new Circle(0,0,0);
        System.out.print("Введите радиус окружности: ");
        Scanner in = new Scanner(System.in);
        o1.r = in.nextDouble();
        if(o1.r <= 0){
            System.exit(0);
        }
        System.out.print("Длинна окружности равна " + o1.longcircle());

    }
}
