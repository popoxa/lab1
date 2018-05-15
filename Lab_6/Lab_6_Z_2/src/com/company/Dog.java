package com.company;

public class Dog extends Pet {
    String Name;
    public Dog(){
        Name = "Тузик";
        ves = 5.6;
        pol = "Мужской";
        voz = 3;
    }
    public void xar (){
        System.out.println("Имя собаки: " + Name);
        System.out.println("Вес собаки: " + ves);
        System.out.println("Пол собаки: " + pol);
        System.out.println("Возраст собаки: " + voz);
    }
}
