package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Restaurant {

    public static void main(String[] args) {

        MenuItem item1 = new MenuItem(9.99, "CJ Burger", "Main Course", true);
        MenuItem item2 = new MenuItem(4.49, "Chum Bucket", "Appetizer", false);
        MenuItem item3 = new MenuItem(6.99, "Fries", "Side", true);


        ArrayList<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(item1);
        menuItems.add(item2);
        menuItems.add(item3);

        Date currentDate = new Date();
        Menu menu = new Menu(currentDate, menuItems);


        System.out.println("Full Menu:");
        printMenu(menu);


        System.out.println("\nIndividual Menu Item:");
        printMenuItem(item1);


        menuItems.remove(item2);
        menu.setItems(menuItems);


        System.out.println("\nUpdated Menu:");
        printMenu(menu);
    }


    public static void printMenu(Menu menu) {
        System.out.println("Last Updated: " + menu.getLastUpdated());
        for (MenuItem item : menu.getItems()) {
            System.out.println("Price: " + item.getPrice());
            System.out.println("Description: " + item.getDescription());
            System.out.println("Category: " + item.getCategory());
            System.out.println("New: " + item.isNew());
            System.out.println();
        }
    }


    public static void printMenuItem(MenuItem item) {
        System.out.println("Price: " + item.getPrice());
        System.out.println("Description: " + item.getDescription());
        System.out.println("Category: " + item.getCategory());
        System.out.println("New: " + item.isNew());
    }
}

