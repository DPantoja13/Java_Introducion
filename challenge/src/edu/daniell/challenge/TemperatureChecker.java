package edu.daniell.challenge;

public class TemperatureChecker {

    public static void main(String[] Args) {

        //variables
        int temperature;
        final String CITY;
        boolean isRaining;

        //variables values
        temperature = 25;
        CITY = "Rio de Janeiro";
        isRaining = false;

        //if conditions
        String result =
            (temperature > 25 && !isRaining) 
            ? "Warm" 
                : (temperature >= 15 && temperature <= 25 && !isRaining) 
                ? "Mild" 
                    : "Cold";

        //print
        System.out.println("==== Weather Report ====");

        System.out.println("Temperature: " + temperature + "°C");
        System.out.println("Condition: " + result);

        System.out.println("========================");
    }
}

