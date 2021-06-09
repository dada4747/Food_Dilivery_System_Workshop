package com.bridgelabz;

enum Taste{
    SWEET, SPICY, MEDIUM_SPICY, LESS_SPICY, SALTY;
}
enum FoodType{
    VEG, NON_VEG, DRINK;
}
enum FoodCategories{
    STARTER, MAIN_COURSE, JUICE;
}

public class FoodItem {
    private String foodName;
    private FoodType foodType;
    private float price;
    private Taste taste;
    private FoodCategories foodCategories;

    public String getFoodName(String muttonCurry) {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Taste getTaste() {
        return taste;
    }

    public void setTaste(Taste taste) {
        this.taste = taste;
    }

    public FoodCategories getFoodCategories() {
        return foodCategories;
    }

    public void setFoodCategories(FoodCategories foodCategories) {
        this.foodCategories = foodCategories;
    }

    @Override
    public String toString() {
        return "FoodItem{" +
                "foodName='" + foodName + '\'' +
                ", foodType=" + foodType +
                ", price=" + price +
                ", taste=" + taste +
                ", foodCategories=" + foodCategories +
                '}';
    }
}
