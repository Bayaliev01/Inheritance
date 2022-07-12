package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println("Programmer");
        Programmer programmer = new Programmer("Адилет", "Директор компании", "Амазон");
        programmer.learn();
        programmer.walk();
        programmer.eat();
        programmer.coding();
        System.out.println(programmer + "\n");

        System.out.println("Dancer");
        Dancer dancer = new Dancer("Жони", "Тренер", "Бий тобу");
        dancer.learn();
        dancer.walk();
        dancer.eat();
        dancer.dancing();
        System.out.println(dancer + "\n");

        System.out.println("Singer");
        Singer singer = new Singer("Тимати", "Репер ", "БлексТар");
        singer.learn();
        singer.walk();
        singer.eat();
        singer.singing();
        singer.playGitar();
        System.out.println(singer);

    }
}