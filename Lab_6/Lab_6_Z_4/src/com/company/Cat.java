package com.company;

public class Cat extends Pet {
    private String Name;
    private double ves;
    private String pol;
    private int voz;

    public Cat(){
        Name = "Андрей";
        ves = 2;
        pol = "Мужской";
        voz = 4;
    }

    public void xar(){
        System.out.println("Имя кота: " + Name);
        System.out.println("Вес кота: " + ves);
        System.out.println("Пол кота: " + pol);
        System.out.println("Возраст кота: " + voz);
        System.out.println();
    }
}
