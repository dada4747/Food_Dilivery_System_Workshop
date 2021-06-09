package com.bridgelabz;
import java.util.ArrayList;
import java.util.Scanner;

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

    public void deleteFoodItem(String item) {
        for (int i = 0; i < foodStoreArray.size(); i++){
            String matcher = foodStoreArray.get(i).getFoodName();
            if (matcher.equalsIgnoreCase(item)){
                foodStoreArray.remove(i);
                System.out.println("Item removed Successfuly");
            }else {
                System.out.println("Name Not Found");
            }
        }
        /*for (FoodItem foodItem : foodStoreArray) {
            String matcher = foodItem.getFoodName();
            if (matcher.equalsIgnoreCase(item)){
                foodStoreArray.remove(foodItem);
                System.out.println("Item removed successfully");
            }else
            {
                System.out.println("Name not found");
            }
        }*/
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


    public void addFoodItems() {
        Scanner sc = new Scanner(System.in);
        FoodItem foodItem = new FoodItem();
        System.out.println("Enter the Name of Food:");
        String foodName = sc.nextLine();
        foodItem.setFoodName(foodName);

        System.out.println("Enter the Price of Food:");
        float foodPrice = sc.nextFloat();
        foodItem.setPrice(foodPrice);
        sc.nextLine();

        System.out.println("Enter the Type of Food:");
        System.out.println("Select food type from below ");
        System.out.println("1. Veg");
        System.out.println("2. Non-Veg");
        System.out.println("Enter your choice:");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                foodItem.setFoodType(FoodType.VEG);
                break;
            case 2:
                foodItem.setFoodType(FoodType.NON_VEG);
                break;

            default:
                System.out.println("Wrong Choice");
        }
        sc.nextLine();
        System.out.println("Enter the Category of Food:");
        System.out.println("Select food Category from below ");
        System.out.println("1. Starter");
        System.out.println("2. Main-Course");
        System.out.println("3. Juice");
        System.out.println("Enter your choice:");
        int choice1 = sc.nextInt();
        switch (choice1){
            case 1:
                foodItem.setFoodCategories(FoodCategories.STARTER);
                break;
            case 2:
                foodItem.setFoodCategories(FoodCategories.MAIN_COURSE);
                break;
            case 3:
                foodItem.setFoodCategories(FoodCategories.JUICE);
                break;
            default:
                System.out.println("Wrong Choice");
        }
        sc.nextLine();
        System.out.println("Enter Food Taste");
        System.out.println("Select Food taste from below");
        System.out.println("1. Sweet");
        System.out.println("2. Spicy");
        System.out.println("3. Medium Spicy");
        System.out.println("4. Less Spicy");
        System.out.println("5. Salty");
        System.out.println("Enter your choice:");
        int choice3 = sc.nextInt();
        switch (choice3){
            case 1:
                foodItem.setTaste(Taste.SWEET);
                break;
            case 2:
                foodItem.setTaste(Taste.SPICY);
                break;
            case 3:
                foodItem.setTaste(Taste.MEDIUM_SPICY);
                break;
            case 4:
                foodItem.setTaste(Taste.LESS_SPICY);
                break;
            case 5:
                foodItem.setTaste(Taste.SALTY);
                break;
            default:
                System.out.println("Wrong Choice");
        }
        sc.nextLine();
        foodStoreArray.add(foodItem);
    }
}
