package exercises;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Triangle Length: ");
        Double length = input.nextDouble();

        System.out.println("Triangle Width: ");
        Double width = input.nextDouble();

        System.out.println((length * width)/2);
    }
}
