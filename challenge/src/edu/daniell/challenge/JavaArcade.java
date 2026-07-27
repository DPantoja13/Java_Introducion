package edu.daniell.challenge;

public class JavaArcade {
    
    public static void main(String[] args) {
    
        //variables
        int i;

        //arrays
        String[] games = {"Minecraft", "Terraria", "Hollow Knigt", "Fortinite", "Bralw Stars"};

        for (i = 0; i < games.length; i++) {

            System.out.println(games[i]);

        }

        for (String game : games) {

            System.out.println(game);

        }
    }
}
