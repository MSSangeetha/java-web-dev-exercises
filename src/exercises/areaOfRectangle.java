package exercises;

import java.util.Scanner;

public class areaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, what is the length of the Rectangle:");
        double length = input.nextDouble();
        System.out.println("Length of the Rectangle entered is :" + length);

        System.out.println("Hello, what is the width of the Rectangle:");
        double width = input.nextDouble();
        System.out.println("Width of the Rectangle entered is :" + width);

        double area = length * width ;
        System.out.println("The Area of the Rectangle is :" + area);

    }
}
