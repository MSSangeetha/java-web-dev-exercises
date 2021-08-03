package org.launchcode.java.demos.lsn4classes2;

import org.launchcode.java.demos.lsn3classes1.Teacher;

import java.util.ArrayList;
import java.util.Objects;

public class Course {
    //Declare variables
    private String topic;
    private Teacher instructor = new Teacher("Robin","Hood","Maths",4.5);

    private ArrayList<Student> enrolledStudents = new ArrayList<>();//Arraylist of Student (class)



    //Function to add new student to enrolled Student arraylist
    public boolean addStudent( Student newStudent ) {
        enrolledStudents.add(newStudent );
        return true;
    }

    //Constructors
public Course (String topic, Teacher instructor, ArrayList<Student> enrolledStudents) {
    this.topic = topic;
    this.instructor = instructor;
    this.enrolledStudents = enrolledStudents;
  }

    public Course (String topic) {
        this.topic = topic;
          }
    public Course (String topic, Teacher instructor) {
        this.topic = topic;
        this.instructor = instructor;
    }

    public Course (ArrayList<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }


    //Getters and Setters
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Teacher getInstructor() {
        return instructor;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

//    public void setEnrolledStudents(Student enrolledStudents) {
//        this.enrolledStudents = enrolledStudents;
//    }
public void setEnrolledStudents(ArrayList enrolledStudents) {
    this.enrolledStudents = enrolledStudents;
}

    public void setInstructor(Teacher instructor) {
    this.instructor = instructor;
//        this.instructor = instructor.getFirstName();
//        this.instructor = instructor.getLastName();
//        this.instructor = instructor.getSubject();
//        this.instructor = instructor.getYearsTeaching();
    }


    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.
    public String toString() {
        return "Course Name: " + this.topic;
//        String studentReport = String.format("%s is a %s with %d credits and a GPA of %.2f", this.name, this.getGradeLevel(this.numberOfCredits), this.getNumberOfCredits(), this.getGpa());
//        return studentReport;
    }



    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return topic.equals(course.topic) && instructor.equals(course.instructor);
//        return topic.equals(course.topic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topic, instructor);
//        return Objects.hash(topic);
    }

}
