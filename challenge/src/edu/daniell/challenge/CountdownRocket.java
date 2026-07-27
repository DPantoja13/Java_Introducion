package edu.daniell.challenge;

public class CountdownRocket {

    public static void main(String[] args) {

        //variables
        String rocketName;
        int countdown;

        //creating values for variables
        rocketName = "Falcon 9";
        countdown = 10;

        //looping
        while (countdown > 0) {
            System.out.println(countdown);
            countdown--;
        }

        //launch
        System.out.println("Launch!");
        System.out.println("Rocket: ".concat(rocketName));
    }
}
