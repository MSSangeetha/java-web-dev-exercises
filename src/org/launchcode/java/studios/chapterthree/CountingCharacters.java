package org.launchcode.java.studios.chapterthree;

import java.util.*;

public class CountingCharacters {
    public static void main(String[] args) {
        String sentance = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String userSentance = input.nextLine();
        //Remove the non alphabetic characters and coverts them to lowercase
        userSentance = userSentance.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int count =0;
//        System.out.println(sentance.charAt(1));

        //declaring Hashmap Data Structure
        HashMap<Character,Integer> counter = new HashMap<>();

        //converting the String to an Array
        char[] charactersInString = userSentance.toCharArray();

        //Loop through an array
        for (char letter : charactersInString) {
            if(counter.containsKey(letter)){
                counter.put(letter, counter.get(letter)+1);
            }
            else{
                counter.put(letter, 1);
            }
        }

        //To print the key value pairs in the HashMap
        for (Map.Entry<Character, Integer> student : counter.entrySet()) {
            System.out.println(student.getKey() + ": " + student.getValue());

        }

        //Looping through the String
//        for (int i = 0; i < sentance.length(); i ++) {
//            System.out.println(sentance.charAt(i));
//            char newChar = sentance.charAt(i);
//            count = count +1;
//            counter.put(newChar,count);
//            }



//        char[] charactersInString = sentance.toCharArray();
//        System.out.println(Arrays.toString(charactersInString));
//    int count = 0;
//    for (char word : charactersInString) {
//        System.out.println(word);
////       do{
//           if(word == I){
//                count ++;
//           }
//       }while();
//    }

        }

}
