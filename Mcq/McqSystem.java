package Mcq;

import java.util.Scanner;

public class McqSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Html html = new Html("D:/IJProject/src/Mcq/html.csv"); //creating on object for Html class
        Java java = new Java("D:/IJProject/src/Mcq/java.csv"); //creating on object for Java class
        ControlStructure controlStructure = new ControlStructure("D:/IJProject/src/Mcq/cs.csv");
        //creating on object for ControlStructure class

        System.out.println("Choose question set 1, 2 or 3 - ");
        int userChoice = sc.nextInt(); //accepting user choice

        if (userChoice == 1) {
            html.displayQuestions();
            html.displayResult();
        }
        else if (userChoice == 2){
            java.displayQuestions();
            java.displayResult();
        }
        else if (userChoice == 3){
            controlStructure.displayQuestions();
            controlStructure.displayResult();
        } //checking what the user choose and displaying the questions accordingly
        else {
            while (true){
                System.out.println("Sorry, invalid choice. Please choose again.");
                userChoice = sc.nextInt();

                if (userChoice == 1) {
                    html.displayQuestions();
                    html.displayResult();
                    break;
                }
                else if (userChoice == 2){
                    java.displayQuestions();
                    java.displayResult();
                    break;
                }
                else if (userChoice == 3){
                    controlStructure.displayQuestions();
                    controlStructure.displayResult();
                    break;
                } //If the user chooses an invalid number, make them choose until they pick a valid number.
            }
        }

    }
}
