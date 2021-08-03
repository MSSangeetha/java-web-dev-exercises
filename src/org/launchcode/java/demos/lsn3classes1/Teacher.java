package org.launchcode.java.demos.lsn3classes1;

public class Teacher {

    //fields
    private String firstName;
    private String lastName;
    private String subject;
    private double yearsTeaching;

    //constructors
    public Teacher (String firstName, String lastName,
                   String subject, double yearsTeaching) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.yearsTeaching = yearsTeaching;
    }

    //Getters and Setters Methods
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String aFirstName) {
        this.firstName = aFirstName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String aLastName) {
        this.lastName = aLastName;
    }

    public String getSubject() {
        return subject;
    }

    private void setSubject(String aSubject) {
        this.subject = aSubject;
    }

    public double getYearsTeaching() {
        return yearsTeaching;
    }

    private void setYearsTeaching(double aYearsTeaching) {
        this.yearsTeaching = aYearsTeaching;
    }
}
