package edu.daniell.challenge;

public class RPGCharacterSystem {

    public static void main(String[] Args) {

        //variables
        String characterName;
        int characterLevel;
        int chracterStrength;
        int characterMagic;
        boolean isPremiumMember;
        char characterRank;

        //variables values
        characterName = "Arthas";
        characterLevel = 26;
        chracterStrength = 60;
        characterMagic = 15;
        isPremiumMember = true;
        characterRank = 'C';

        //if conditions
        String characterClass =
            (characterMagic >= 80 && chracterStrength >= 80)
            ? "Paladin"
                : (characterMagic >= 80)
                ? "Wizard"
                    : (chracterStrength >= 80)
                    ? "Warrior"
                        : "Adventurer";

        //print
        System.out.println("===== Character Sheet =====");

        System.out.println("Name: ".concat(characterName));
        System.out.println("Level: " + characterLevel);
        System.out.println("Strength: " + chracterStrength);
        System.out.println("Magic: " + characterMagic);
        System.out.println("Class: " + characterClass);
        System.out.println("Premium: " + isPremiumMember);
        System.out.println("Rank: " + characterRank);

        System.out.println("===========================");


    }
    
}
