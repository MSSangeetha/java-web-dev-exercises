package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ChapterTwoHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> students = new HashMap<>();//declaring Hashmap
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and grades
        do {

            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID: ");
                Integer newId = input.nextInt();
                students.put(newId, newStudent);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while(!newStudent.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");
        double sum = 0.0;

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getValue() + "'s ID: " + student.getKey() + ")");

        }

        System.out.println("Number of students in roster: " + students.size());
    }
}
