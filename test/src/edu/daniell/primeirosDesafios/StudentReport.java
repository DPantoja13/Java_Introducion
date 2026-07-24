package edu.daniell.primeirosDesafios;

public class StudentReport {

    public static void main(String[] args) {
        // Requisitos
        String name;
        int age;
        float grade;
        boolean approved;
        final String COURSE = "Java Development";

        // variables initialization
        name = "Daniel";
        age = 19;
        grade = 8.5f;

        //classification based on the grade
        if (grade >= 7.0) {
            approved = true;
        } else {
            approved = false;
        }

        //header
        System.out.println("===== Student Report =====");

        //main information
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Course: " + COURSE);
        System.out.println("Status: " + (approved ? "Approved" : "Not Approved"));

        //footer
        System.out.println("===========================");

        }

    }

