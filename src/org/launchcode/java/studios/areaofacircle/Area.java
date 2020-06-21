package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a radius: ");

        Double newRadius = input.nextDouble();

        while (newRadius < 0) {
            System.out.println("Radius cannot be negative.");
            System.out.println("Enter a radius: ");
            newRadius = input.nextDouble();
        }


        Double radius = newRadius;

        Double area = Circle.getArea(radius);

        System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }
}
