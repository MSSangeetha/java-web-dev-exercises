package org.launchcode.java.studios.inheritance;

import java.util.Objects;

public abstract class Question {

    //Fields
    private String question;

    //Constructors
    public Question(String question){
        this.question = question;
    }

    public Question(){
        this.question = question;
    }

    //Abstract methods
    public abstract String getActualAnswer();

    //Getters and Setters

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    //Equals and Hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question1 = (Question) o;
        return Objects.equals(question, question1.question);
    }

    @Override
    public int hashCode() {
        return Objects.hash(question);
    }

    //toString

    @Override
    public String toString() {
        return "Question{" +
                "question='" + question + '\'' +
                '}';
    }
}
