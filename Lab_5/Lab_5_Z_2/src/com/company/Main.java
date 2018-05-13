package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Circle dl = new Circle(0,0,0);
        dl.Cbox();
        System.out.println("Координаты центра окружности после смещения " + "(" + dl.x + ";" + dl.y + ")" );

    }
}
