package edu.daniell.challenge;

public class EmployeeEvaluation {

    public static void main(String[] args) {

        //variables
        String employee;
        float performance;
        boolean employed;

        //declaring/create variables
        employee = "Daniel";
        performance = 7.5f;
        employed = true;
        final String COMPANI = "OpenAI";

        //nested4
        String result =
            (performance >= 9)
                ? "Exelent"
                : (performance >= 7)
                    ? "Good"
                    : (performance >= 5)
                        ? "Regular"
                        : "Needs Improvement";


        //Exit body
        /*
        header
        main
        footer
        */

        //Exit
        System.out.println("===== Employee Report =====");

        System.out.println("Employee: " + employee);
        System.out.println("Company: " + COMPANI);
        System.out.println("Performance: " + performance);
        System.out.println("Status: " + result);
        System.out.println("Currently Employed: " + employed);

        System.out.println("==========================");



    }
    
}
