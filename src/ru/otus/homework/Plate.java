package ru.otus.homework;

public class Plate {

    private int foodAmount;

    public Plate(int foodAmount){
        this.foodAmount = foodAmount;
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void setFoodAmount(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    public int takeFood(int amount){
        foodAmount -= amount;
        return amount;
    }


    @Override
    public String toString() {
        return "Plate{" + "foodAmount = " + foodAmount + '}';
    }
}