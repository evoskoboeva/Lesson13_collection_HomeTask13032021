package com.companyCat;

import java.util.ArrayList;
import java.util.Objects;

public class Food extends ArrayList<String> {
    private String nameFood;
    ArrayList<String> ingridients;
    private String descriptionFood;
    private Integer calories;
    private Integer cookingTimeFood;




    @Override
    public String toString() {
        return "Food{" +
                "nameFood='" + nameFood + '\'' +
                ", ingridients=" + ingridients +
                ", descriptionFood='" + descriptionFood + '\'' +
                ", calories=" + calories +
                ", cookingTimeFood=" + cookingTimeFood +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Food)) return false;
        Food food = (Food) o;
        return getNameFood().equals(food.getNameFood()) && getIngridients().equals(food.getIngridients()) && Objects.equals(getDescriptionFood(), food.getDescriptionFood()) && getCalories().equals(food.getCalories()) && getCookingTimeFood().equals(food.getCookingTimeFood());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNameFood(), getIngridients(), getDescriptionFood(), getCalories(), getCookingTimeFood());
    }

    public String getNameFood() {
        return nameFood;
    }

    public void setNameFood(String nameFood) {
        this.nameFood = nameFood;
    }

    public ArrayList<String> getIngridients() {
        return ingridients;
    }

    public void setIngridients(ArrayList<String> ingridients) {
        this.ingridients = ingridients;
    }

    public String getDescriptionFood() {
        return descriptionFood;
    }

    public void setDescriptionFood(String descriptionFood) {
        this.descriptionFood = descriptionFood;
    }

    public Integer getCalories() {
        return calories;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }

    public Integer getCookingTimeFood() {
        return cookingTimeFood;
    }

    public void setCookingTimeFood(Integer cookingTimeFood) {
        this.cookingTimeFood = cookingTimeFood;
    }
        public Food (Food food){
        this.nameFood = food.nameFood;
        this.ingridients = food.ingridients;
        this.descriptionFood = food.descriptionFood;
        this.calories = food.calories;
        this.cookingTimeFood = food.cookingTimeFood;

    }
    public Food(String nameFood, ArrayList<String> ingridients, String descriptionFood, Integer calories, Integer cookingTimeFood) {
        this.nameFood = nameFood;
        this.setIngridients(ingridients) ;

        this.descriptionFood = descriptionFood;
        this.calories = calories;
        this.cookingTimeFood = cookingTimeFood;
    }
    public Food(String nameFood, String descriptionFood, Integer calories,Integer cookingTimeFood,
                String...ingridients ) {
        this.nameFood = nameFood;
        this.ingridients = new ArrayList<String>();
        for (String ingridient:ingridients){
            this.ingridients.add(ingridient);
        }
        this.descriptionFood = descriptionFood;
        this.calories = calories;
        this.cookingTimeFood = cookingTimeFood;
    }
}
