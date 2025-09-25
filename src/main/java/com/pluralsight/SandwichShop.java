package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
//        double regBase = 5.45;
//        double largeBase = 8.95;
//        double pretotal = 0;
//        double total = 0;
//        int age = 66;
//        double student = (int) (pretotal * .90);
//        double senior = (int) (pretotal * .80);
//
//        if(age >= 66) {
//            total = senior;
//        } else if(age >= 17) {
//            total = student;
//        }
//
//        double testOrder1 = (regBase * 2);
//        double testOrder2 = ((regBase * 2) + (largeBase * 4));
//
//        System.out.printf("Your total is %d", total);

        Scanner scanner = new Scanner(System.in);
        double regBase = 5.45;
        double largeBase = 8.95;
        double pretotal = 0;
        double total = 0;
        int age = 0;

        System.out.println("What kind of sandwich would you like? 1.) Regular or 2.) Large?");
        int choice = Integer.parseInt(scanner.nextLine());

        if(choice == 1) {
            pretotal = regBase;
        } else if(choice == 2) {
            pretotal = largeBase;
        }

        System.out.println("How old are you?");
        age = Integer.parseInt(scanner.nextLine());

        if(age >= 65) {
            total = pretotal * .80;
        } else if(age <= 17) {
            total = pretotal * .90;
        }

        System.out.printf("Your total before discount is %f and your total after discount is %f", pretotal, total);
    }
}
