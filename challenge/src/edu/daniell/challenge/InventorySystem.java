package edu.daniell.challenge;

public class InventorySystem {

    public static void main(String[] Args) {

        //variabes
        int selectedItem;
        int i;

        //array of items
        String[] items = {
            "Sword", 
            "Shield", 
            "Potion", 
            "Bow", 
            "Arrow"
        };

        //variable values
        selectedItem = 0;

        //IF CONDITION
        String result = 
            (selectedItem == 1) 
            ? items[0] 
                : (selectedItem == 2) 
                ? items[1]
                    : (selectedItem == 3) 
                    ? items[2]
                        : (selectedItem == 4) 
                        ? items[3]
                            : (selectedItem == 5) 
                            ? items[4]
                                : "Choose an item";
        
        System.out.println("===== Inventory =====");

        for (i = 0; i < items.length; i++) {
            System.out.println((i + 1) + "- " + items[i]);
        }

        System.out.println("=====================");

        System.out.println("");

        System.out.println("Selected Item: " + result);

    }
}

