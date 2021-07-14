package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius of the circle:");
        Double radius = input.nextDouble();
//        double pi = 3.14;
//        double area = pi * radius * radius;
//        System.out.println("The Area of the Rectangle is :" + area);

        double area = Circle.getArea(radius);
//        System.out.println(Circle.getArea(radius));
        System.out.println("Area of the circle is " + area);

    }
}
