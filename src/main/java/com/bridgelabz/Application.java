package com.bridgelabz;

import java.util.Scanner;

public class Application {
    FoodStore foodStore = FoodStore.getInstance();
    public void createSystemMenu() {


        System.out.println("1. Print  Starters");
        System.out.println("2. Print Main Course");
        System.out.println("3. Print Juices");
        System.out.println("4. Prepare Food");
        System.out.println("5. Deliver Food");
        System.out.println("Enter Your Choice:");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Starters are : ");
                foodStore.printStarterItems();
                break;
            case 2:
                System.out.println("Main Courses are :");
                foodStore.printMainCourseItems();
                break;
            case 3:
                System.out.println("Juices are : ");
                foodStore.printJuicesItems();
                break;
            case 4:
                break;
            case 5:
                break;
            default:

        }


    }



    public static void main(String[] args) {
        System.out.println("-------------Welcome to the Food Delivery System------------");
        FoodStore foodStore = FoodStore.getInstance();



        Dal dal = new Dal();
        dal.setPrice(250);
        dal.setTaste(Taste.MEDIUM_SPICY);

        MuttonCurry muttonCurry = new MuttonCurry();
        muttonCurry.setPrice(500);
        muttonCurry.setTaste(Taste.SPICY);

        ChickenTikka chickenTikka = new ChickenTikka();
        chickenTikka.setPrice(450);
        chickenTikka.setTaste(Taste.SPICY);

        PaneerTikka paneerTikka = new PaneerTikka();
        paneerTikka.setPrice(300);
        paneerTikka.setTaste(Taste.MEDIUM_SPICY);

        MasalaPapad masalaPapad = new MasalaPapad();
        masalaPapad.setPrice(150);
        masalaPapad.setTaste(Taste.SALTY);

        SoyabinChilli soyabinChilli = new SoyabinChilli();
        soyabinChilli.setPrice(200);
        soyabinChilli.setTaste(Taste.SPICY);

        MangoJuice mangoJuice = new MangoJuice();
        mangoJuice.setPrice(80);
        mangoJuice.setTaste(Taste.SWEET);

        foodStore.prepare(paneerTikka);
        foodStore.prepare(chickenTikka);
        foodStore.prepare(muttonCurry);
        foodStore.prepare(dal);
        foodStore.prepare(masalaPapad);
        foodStore.prepare(soyabinChilli);
        foodStore.prepare(mangoJuice);

        Application application = new Application();
        application.createSystemMenu();
       // foodStore.printStarterItems();

        // foodStore.printFoodStore();
        /*
        System.out.println("Following foods are available");
        foodStore.printFoodStore();
        foodStore.deliver(paneerTikka);
        System.out.println();
        System.out.println("after the deliver Paneer Tikka remains following items");
        foodStore.printFoodStore();*/
    }
}
