package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius of the circle:");
        double radius = input.nextDouble();
//        double pi = 3.14;
//        double area = pi * radius * radius;
//        System.out.println("The Area of the Circle is :" + area);
        if(radius < 0){
            System.err.print("Invalid input");
              }
        else{
            double area = Circle.getArea(radius);
            System.out.println("Area of the circle is " + area);

        }

        //        System.out.println(Circle.getArea(radius));


    }
}
