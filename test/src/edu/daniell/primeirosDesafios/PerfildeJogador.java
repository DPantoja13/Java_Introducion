package edu.daniell.primeirosDesafios;

public class PerfildeJogador {

    public static void main(String[] args) {

        //reqisitos 1
        String name;
        int age;
        float height;
        char rank;
        boolean likesJava;
        final String DREAM_COUNTRY;

        //reqisitos 2
        name = "Daniel";
        age = 19;
        height = 1.79f;
        rank = 'A';
        likesJava = true;
        DREAM_COUNTRY = "Japan";

        //barra superior de comentário
        System.out.println("===== Player Profile =====");

        //identificação do jogador
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " meters");
        System.out.println("Rank: " + rank);
        System.out.println("Likes Java: " + likesJava);
        System.out.println("Dream Country: " + DREAM_COUNTRY);

        //barra inferior de comentário
        System.out.println("===========================");

    }
    
}
