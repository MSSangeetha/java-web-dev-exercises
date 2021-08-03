package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ChapterTwoArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        ArrayList<String> words = new ArrayList<>(Arrays.asList("Louis","London","America","Apple","Beard"));
//        numbers.add(1);   
//        numbers.add(2);
//        numbers.add(3);
//        numbers.add(4);
//        numbers.add(5);
//        numbers.add(6);
//        numbers.add(7);
//        numbers.add(8);
//        numbers.add(9);
//        numbers.add(10);

        System.out.println("The numbers in the ArrayList are " + numbers);
        System.out.println("The total of the numbers is " + sumEven(numbers));

//        System.out.println("The words in the ArrayList are " + words);
//        System.out.println("The words with exactly 5 letters are " + fiveLetters(words));
//        fiveLetters(words);

        String sentance = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] NewSentance = sentance.split(" ");
        ArrayList<String> newWords = new ArrayList<>(Arrays.asList(NewSentance));
        System.out.println("The New Words in the ArrayList are " + newWords);
        fiveLetters(newWords);
    }

    //Static method to find total of numbers
    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

    //Static method to find 5 letter words
    public static void fiveLetters(ArrayList<String> arr) {
//        String[] names = {};
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, Enter a word length to search :");
        int search = input.nextInt();

       for (String word : arr) {
           if (word.length()==search) {
               System.out.println(word);
//               names.add(word);
           }
        }
//        return names;
    }

}
