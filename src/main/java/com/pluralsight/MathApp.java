package com.pluralsight;

public class MathApp {
    public static void main (String [] args) {
        // Question 1:
        // declare variables here
        // then code solution
        // then use System.out.println () to display results
        // ex: System.out.println ("The answer is " + answer);

        // REPEAT FOR NEXT EXERCISE

        //QUESTION 1:
 int bobSalary = 25000;
 int garySalary = 35000;
 int highestSalary = Math.max (bobSalary, garySalary);
 System.out.println ("The highest salary is " + highestSalary);

        //QUESTION 2:
 int carPrice = 30000;
 int truckPrice = 50000;
 int lowestPrice = Math.min(carPrice, truckPrice);
 System.out.println ("The lowest price is " + lowestPrice);

        //QUESTION 3:
double radius = 7.25;
double areaOfCircle = Math.PI * Math.pow(radius, 2);

System.out.println ("Area of a circle with " + radius + " is " + areaOfCircle);

    }
}
