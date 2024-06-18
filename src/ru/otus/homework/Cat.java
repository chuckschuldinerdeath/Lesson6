package ru.otus.homework;

public class Cat {

    private String name;

    private boolean hungry;


    public Cat (String name, boolean hungry){
        this.name = name;
        this.hungry = hungry;
    }


    public void eat(Plate plate){
        if(hungry){
            plate.takeFood(10);
            System.out.println(name + " поел");
            hungry = false;
        } else {
            System.out.println(name + " сыт");
        }
    }
}