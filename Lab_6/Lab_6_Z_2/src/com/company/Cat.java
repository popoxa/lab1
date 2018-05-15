package com.company;

public class Cat extends Pet {
    String Name;
    public Cat(){
        Name = "Кузя";
        ves = 3.4;
        pol = "Мужской";
        voz = 2;
    }
    public void xar (){
        System.out.println("Имя кота: " + Name);
        System.out.println("Вес кота: " + ves);
        System.out.println("Пол кота: " + pol);
        System.out.println("Возраст кота: " + voz);
        System.out.println();
    }
}
