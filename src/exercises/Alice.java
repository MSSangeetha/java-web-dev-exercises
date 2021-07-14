package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Alice {

    public static void main(String[] args) {
        String sentance = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        sentance = sentance.toLowerCase();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word to search in the sentance :");
        String word = input.nextLine();
        word = word.toLowerCase();

        System.out.println("The sentance contains the word : " + sentance.contains(word));

        System.out.println("The index of the word entered is :" + sentance.indexOf(word));
        Integer index = sentance.indexOf(word);

        System.out.println("The length of the word entered is :" + word.length());
        Integer length = word.length();

        String modifiedSentance = sentance.replace(word,"");
        System.out.println("After removing the word from the sentance :" + modifiedSentance);
    }

}
