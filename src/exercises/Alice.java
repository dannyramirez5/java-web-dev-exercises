package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String oldSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?'";

        String sentence = oldSentence.toLowerCase();

        System.out.println("What term should I search? ");
        String term = input.nextLine().toLowerCase();

        if (sentence.contains(term)) {
            System.out.println("It's there!");
        }
        else {
            System.out.println("It's NOT there!");
        }

        Integer termIndex = sentence.indexOf(term);
        System.out.println(termIndex);

        Integer termLength = term.length();
        System.out.println(termLength);

        String firstHalf = oldSentence.substring(0, (termIndex-1));
        String secondHalf = oldSentence.substring(termIndex+termLength);

        String allHalves = firstHalf + secondHalf;

        System.out.println(allHalves);
    }
}
