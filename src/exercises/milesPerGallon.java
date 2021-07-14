package exercises;

import java.util.Scanner;

public class milesPerGallon {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of miles driven:");
        double milesDriven = input.nextDouble();

        System.out.println("Please enter the amount of gas consumed (in gallons):");
        double gas = input.nextDouble();

        double milesCalculation = milesDriven / gas ;
        System.out.println("The Miles Per Gallon is :" + milesCalculation);

    }

}
