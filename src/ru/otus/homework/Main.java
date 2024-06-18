package ru.otus.homework;

public class Main {
    public static void main(String[] args) {

        Cat[] cats = {
                new Cat("Барсик", true),
                new Cat("Max", false),
                new Cat("Misha", true)
        };
        Plate plate = new Plate(100);

        for(Cat cat : cats){
            cat.eat(plate);
            System.out.println(plate);
        }
        System.out.println(plate);
    }
}