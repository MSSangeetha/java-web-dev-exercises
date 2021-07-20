package exercises;

import java.util.Arrays;

public class ChapterTwoFirstPart {
    public static void main(String[] args) {
        int[] arrayPractice = {1, 1, 2, 3, 5, 8};

        //Loop through an array and print all numbers
//        for (int i : arrayPractice) {
//            System.out.println(i);
//        }

        //Loop through array and print only odd numbers
        for (int i : arrayPractice) {
            if(i%2!=0){
                System.out.println(i);
            }
        }

        //String Spliting with spaces
        String sentance = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
       String[] NewSentance = sentance.split(" ");
        System.out.println(Arrays.toString(NewSentance));

        //String Spliting with .
        String[] AnotherSentance = sentance.split("\\.");
        System.out.println(Arrays.toString(AnotherSentance));

    }

}
