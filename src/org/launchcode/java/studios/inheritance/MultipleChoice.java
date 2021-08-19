package org.launchcode.java.studios.inheritance;

import java.util.HashMap;

public class MultipleChoice extends Question{

    //Fields
    private String actualAnswer;
    private HashMap<String,String> multipleChoices = new HashMap<>();

    //Constructors
    public MultipleChoice (String question){
        super(question);
    }

    //Getters and Setters
    public String getActualAnswer() {
        return actualAnswer;
    }

    public HashMap<String, String> getMultipleChoices() {
        return multipleChoices;
    }

    public void setMultipleChoices(HashMap<String, String> multipleChoices) {
        this.multipleChoices = multipleChoices;
    }

    //Methods
    public void addMultipleChoiceQuestion(String choiceQuestion, String choiceAnswer){
        if (!(multipleChoices.containsKey(choiceQuestion))) {
            this.multipleChoices.put(choiceQuestion,choiceAnswer);
        }
    }

    //toString Method
    @Override
    public String toString() {
        return "MultipleChoice{" +
                "actualAnswer='" + actualAnswer + '\'' +
                ", multipleChoices=" + multipleChoices +
                '}';
    }
}
