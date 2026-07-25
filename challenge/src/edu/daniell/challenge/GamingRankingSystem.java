package edu.daniell.challenge;

public class GamingRankingSystem {

    public static void main (String[] args) {

    //variables
    String playerName;
    int level;
    float winRate;
    char rank;
    boolean premium;
    final String GAME_NAME;

    //create variable values
    playerName = "Daniel";
    level = 25;
    winRate = 82.5f;
    rank = 'A';
    premium = true;
    GAME_NAME = "Minecraft";

    //Ranking title sistem
    String title =
        (winRate >= 90)
            ? "Legendary"
            : (winRate >= 75)
                ? "Master"
                : (winRate >= 50)
                    ? "Advanced"
                    : "Beginner";


    /*
    Body
    header
    main
    footer
    */
    
    //header
    System.out.println("=============================");
    System.out.println("    Gaming Ranking System    ");
    System.out.println("=============================");

    //main
    System.out.println("Player: " + playerName);
    System.out.println("Game: " + GAME_NAME);
    System.out.println("Level: " + level);
    System.out.println("Win Rate: " + winRate + "%");
    System.out.println("Rank: " + rank);
    System.out.println("Premiun: " + premium);
    System.out.println("Title: " + title);

    //footer
    System.out.println("=============================");
    }
    
}
