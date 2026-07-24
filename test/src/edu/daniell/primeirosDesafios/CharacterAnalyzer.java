package edu.daniell.primeirosDesafios;

public class CharacterAnalyzer {

    public static void main(String[] args) {

        // variables
        char letter = 'D';
        int ascii = letter;
        boolean uppercase;

        //if conditions
        if (ascii >= 65 && ascii <= 90) {
            uppercase = true;
        } else {
            uppercase = false;
        }

        //result
        String result = (uppercase) ? "uppercase Letter" : "not an uppercase letter";

        //print
        System.out.println("Letter: " + letter);
        System.out.println("ASCII: " + ascii);
        System.out.println(result);



    }
    
}
