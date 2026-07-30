package edu.daniell.challenge;

public class Library {

    public static void main(String[] Args) {

        //variables
        String[] books = new String[5];
        int option = 0;
        
        //variables values
        books[0] = "Diarios de um Banana";
        books[1] = "Harry Poter, e a Pedra Filosofal";
        books[2] = "Blue Lock";
        books[3] = "One Piece";
        books[4] = "HP lovecraft";

        //call book with our name
        String callBook = 
            (option == 1) ? books[0] 
                : (option == 2) ? books[1]
                    : (option == 3) ? books[2]
                        : (option == 4) ? books[3]
                            : (option == 5) ? books[4]
                                : "Choose a book to read";
                            
        //library list
        /*
        for (int i = 0; i < books.length; i++) {
            System.out.println((i + 1) + ": " + books[i]);
        }
        */
        System.out.println("===== Library List =====");
        System.out.println("1: ".concat(books[0]));
        System.out.println("2: ".concat(books[1]));
        System.out.println("3: ".concat(books[2]));
        System.out.println("4: ".concat(books[3]));
        System.out.println("5: ".concat(books[4]));
        System.out.println("========================");

        //book toked
        System.out.println("===== Book Picked =====");
        System.out.println("Book: ".concat(callBook));
        System.out.println("=======================");
    }

}
