package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student sangeetha = new Student("Sangeetha",1,1,4.0);
        System.out.println("The student ID is " + sangeetha.getStudentId() + ", Name is " + sangeetha.getName() + ", has " + sangeetha.getNumberOfCredits() + " credits" + " with GPA " + sangeetha.getGpa());
        //Using Setter method in Student class to modify the Student Id
        sangeetha.setStudentId(2);
        System.out.println("The new Student ID is " + sangeetha.getStudentId());

    }
}
