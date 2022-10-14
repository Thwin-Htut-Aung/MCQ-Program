package Mcq;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class QuestionSet {

    private String fileName;

    public QuestionSet(String fName){
        this.fileName = fName;
    } //constructor method constructing object with argument

    //getter and setter
    public String getFileName(){
        return this.fileName;
    }

    public void setFileName(String fName){
        this.fileName = fName;
    }

    public void displayQuestions(){
        Question question;
        String line; // readline of the file
        try{
            BufferedReader reader = new BufferedReader(new FileReader(this.fileName));
            while ((line = reader.readLine()) != null) {
                question = parseQuestion(line);
                displayQuestion(question); }
        } //reading questions line by line and passing to parseQuestion method until there are no more lines
        catch (IOException e) {
            e.printStackTrace();
        } //catching error in reading the file if any
    }
    //method to read CSV file and display question using BufferedReader and FileReader classes

    public void displayQuestion(Question question) {
        System.out.println(question.displayQuestion());
        acceptUserOption(question);
    } //method to display question and accept user option

    public Question parseQuestion(String line){
        String[] question = line.split(",");
        Question quest = new Question( question[0], question[1], question[2],
                question[3], question[4], question[5], question[6]);
        return quest;
    } //method to parse CSV readline into question, options and correct answer

    private void acceptUserOption(Question question) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your answer");
        String userOption = sc.next();
        question.setUserOption(userOption);
        System.out.println(question.getDisplayText());
    }

    public void displayResult(){
        int correctAnswers = Question.correctAnswerCount;
        int wrongAnswers = Question.wrongAnswerCount;
        int correctPercentage = (correctAnswers*100)/(correctAnswers+wrongAnswers);
        System.out.println("Test Completed.\nCorrect Answers - "+correctAnswers+
                "\nWrong Answers - "+wrongAnswers+"\nPercentage - "+correctPercentage+"%");
    } //method to display the final result

}


