package org.launchcode.java.demos.lsn4classes2;

import org.launchcode.java.demos.lsn3classes1.Teacher;

public class Student {

    //declaring variables
    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    //Creating an object for Teacher class
    Teacher som = new Teacher("Som","Raj", "Maths", 1);
    Teacher sek = new Teacher("Sek","Shan", "Maths", 2);

    //constructors
    public Student (String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }


    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }

    public static void main(String[] args) {
        Student sally = new Student("Sally",1,1,4.0);
        Student dally = new Student("Dallly",1,1,4.0);
        Student volly = new Student("Volly",3,4,5.0);

        System.out.println("The Student class works! " + sally.getName() + " is a student!");
        System.out.println(sally.getName() + " is in the Grade level of " + sally.getGradeLevel(sally.getNumberOfCredits()) + " with Credits of " + sally.getNumberOfCredits());;
        System.out.println(sally.toString());
        sally.addGrade(12, 3.5);
        System.out.println(sally);
        sally.addGrade(25, 3.8);
        System.out.println(sally);

        //Calling Equals method
        System.out.println(sally.equals(dally));

        //Creating object for Course class
        Course courseOne = new Course("Science", dally.som);
        Course courseTwo = new Course("Science", dally.sek);


//calling the toString method
        System.out.println(courseOne.toString());

//Calling Teacher class
        System.out.println(courseOne.getInstructor().getFirstName());

        //Adding a new student
        courseOne.addStudent(dally);
        System.out.println(courseOne.getEnrolledStudents());

//        System.out.println(courseOne.setEnrolledStudents(volly));
//        System.out.println(courseOne.getEnrolledStudents());

        //Checking equals method of Course class
        System.out.println(courseOne.equals(courseTwo));

        System.out.println(courseOne.getInstructor().getFirstName());
        System.out.println(courseTwo.getInstructor().getFirstName());

    }


     //TODO: Uncomment and complete the getGradeLevel method here:
    public String getGradeLevel(int credits) {
//        // Determine the grade level of the student based on numberOfCredits
        if(credits <= 29) {
            return "Freshman";
        }
        else if(credits <= 59){
            return "Sophomore";
        }
        else if(credits <= 89){
            return "Junior";
        }
        else {
            return "Senior";
        }

    }

    // TODO: Complete the addGrade method.
    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa
        double currentQualityScore = this.gpa * this.numberOfCredits;
        double totalQualityScore = currentQualityScore + (courseCredits * grade);
        this.numberOfCredits = this.numberOfCredits + courseCredits;
        this.gpa = totalQualityScore / this.numberOfCredits;
        System.out.println("The GPA is " + this.gpa);

    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather
    //  than just the class fields.
    public String toString() {
//        return name + " (Credits: " + numberOfCredits + ", GPA: " + gpa + ")";
        String studentReport = String.format("%s is a %s with %d credits and a GPA of %.2f", this.name, this.getGradeLevel(this.numberOfCredits), this.getNumberOfCredits(), this.getGpa());
        return studentReport;
    }

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Student objects equal.
    public boolean equals(Object toBeCompared) {
        if (toBeCompared == this) {
            return true;
        }

        if (toBeCompared == null) {
            return false;
        }

        if (toBeCompared.getClass() != getClass()) {
            return false;
        }

        Student theStudent = (Student) toBeCompared;
        return theStudent.getStudentId() == getStudentId();
    }

    //Getters and Setters
    public String getName(){
        return name;
    }

    public int getStudentId(){
        return studentId;
    }

    public int getNumberOfCredits(){
        return numberOfCredits;
    }

    public double getGpa(){
        return gpa;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setStudentId(int studentId){
        this.studentId = studentId;
    }

    public void setGpa(double gpa){
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }


}
