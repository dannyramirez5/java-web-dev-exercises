package exercises;

import java.util.Scanner;

public class GasConsumed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven? ");
        Double miles = input.nextDouble();

        System.out.println("Hot much gas has been consumed (in gallons): ");
        Double gas = input.nextDouble();

        System.out.println("Miles per Gallon: " + (miles/gas));
    }
}
