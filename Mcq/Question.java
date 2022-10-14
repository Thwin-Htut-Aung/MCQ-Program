package Mcq;

public class Question {

    private String question;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String correctOption;
    private String correctAnswer;
    private String userOption;
    public static int correctAnswerCount;
    public static int wrongAnswerCount;

    public Question(String question, String option1, String option2, String option3, String option4,
                    String correctOption, String correctAnswer) {
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.correctOption = correctOption;
        this.correctAnswer = correctAnswer;
    } //constructor method constructing object with arguments

    //getters and setters
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public String getOption4() {
        return option4;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }
    public String getCorrectOption() {
        return correctOption;
    }

    public void setCorrectOption(String correctOption) {
        this.correctOption = correctOption;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getUserOption() {
        return userOption;
    }

    public void setUserOption(String userOption) {
        this.userOption = userOption;
    }

    public String displayQuestion(){
        return question+"\n"+option1+"\n"+option2+"\n"+option3+"\n"+option4;
    }
    //method to display question to user

    public String getDisplayText() {
        String displayText;
        if (this.userOption.equals(this.correctOption)){
            displayText = "Well Done";
            correctAnswerCount++;
        }
        else {
            displayText = "Better luck next time. Correct answer- " + this.correctAnswer;
            wrongAnswerCount++;
        } //checking whether user's answer is right or wrong
        return displayText;
    } //method to display text after each question according to user's answer

}
