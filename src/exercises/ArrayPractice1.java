package exercises;

import java.util.Arrays;

public class ArrayPractice1 {
    public static void main(String[] args) {
        //1
        int[] numbersArray = {1, 1, 2, 3, 5, 8};

        //2
        for (int i : numbersArray) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }

        //3
        String seuss = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";

        String[] newSeuss = seuss.split("\\.");

        System.out.println(Arrays.toString(newSeuss));

    }
}
