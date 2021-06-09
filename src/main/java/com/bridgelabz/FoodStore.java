package com.bridgelabz;
import java.util.ArrayList;

public class FoodStore {
    ArrayList<FoodItem> foodStoreArray = new ArrayList<>();
    static FoodStore instance;
    private FoodStore() {
    }
    static FoodStore getInstance() {
        if (instance == null){
            instance = new FoodStore();
        }
        return instance;
    }


    public void prepare(FoodItem foodItem){
        foodStoreArray.add(foodItem);
    }

    public void deliver(FoodItem foodItem) {
        foodStoreArray.remove(foodItem);
    }

    void printStarterItems() {
        for (FoodItem foodItem : foodStoreArray) {
            if (foodItem.getFoodCategories()==(FoodCategories.STARTER)){
            System.out.println(foodItem);
            }
        }
    }

    public void printMainCourseItems() {
        for (FoodItem foodItem : foodStoreArray){
            if (foodItem.getFoodCategories() == (FoodCategories.MAIN_COURSE)){
                System.out.println(foodItem);
            }
        }
    }
    public void printJuicesItems() {
        for (FoodItem foodItem : foodStoreArray){
            if (foodItem.getFoodCategories() == (FoodCategories.JUICE)){
                System.out.println(foodItem);
            }
        }
    }

    public void printFoodStore(){
        for (Object obj : foodStoreArray) {
            System.out.println(obj);
        }
    }


}
