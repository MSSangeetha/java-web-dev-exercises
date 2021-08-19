package org.launchcode.java.studios.inheritance;

import java.util.HashMap;

public class CheckBox extends Question{

    //Fields
    private HashMap<String, Boolean> checkBoxQuestion = new HashMap();

    //Constructor
    public CheckBox(String question){
        super(question);
    }

    //Getters and Setters
    public HashMap<String, Boolean> getCheckBoxQuestion() {
        return checkBoxQuestion;
    }

    public void setCheckBoxQuestion(HashMap<String, Boolean> checkBoxQuestion) {
        this.checkBoxQuestion = checkBoxQuestion;
    }

    //Methods
    public void checkTrue(String checkQuestion){
        checkBoxQuestion.put(checkQuestion, true);
    }

    public void checkFalse(String checkQuestion){
        checkBoxQuestion.put(checkQuestion, false);
    }

    //override getactualanswer from question class
}
