package edu.daniell.challenge;

public class GameMenu {
    
    public static void main(String[] args) {

        //variables
        int option;
        String mensagem;

        //variable values
        option = 3;

        //looping
        switch (option) {
            case 1:
                mensagem = ("Start Game");
                break;
            case 2:
                mensagem = ("Settings");
                break;
            case 3:
                mensagem = ("Credits");
                break;
            case 4:
                mensagem = ("Exit");
                break;
            default:
                mensagem = ("Invalid Option");
                break;
        }

        //output
        System.out.println("===== Game Menu =====");
        System.out.println("Selected Option: " + option);
        System.out.println(mensagem);
        System.out.println("=====================");
    }

}
