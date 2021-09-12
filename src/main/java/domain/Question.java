package domain;

public class Question {
    private int questionNumber;
    private String questionMark;
    private String questionTeme;
    private String correctAnswer;
    private String opcion1;
    private String opcion2;
    private String opcion3;
    private String opcion4;
    private String playerAnswer;

    public Question(int questionNumber, String questionMark, String questionTeme, String correctAnswer, String opcion1, String opcion2, String opcion3, String opcion4) {
        this.questionNumber = questionNumber;
        this.questionMark = questionMark;
        this.questionTeme = questionTeme;
        this.correctAnswer = correctAnswer;
        this.opcion1 = opcion1;
        this.opcion2 = opcion2;
        this.opcion3 = opcion3;
        this.opcion4 = opcion4;
    }

    public Question() {
    }

    public int getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(int questionNumber) {
        this.questionNumber = questionNumber;
    }

    public String getQuestionMark() {
        return questionMark;
    }

    public void setQuestionMark(String questionMark) {
        this.questionMark = questionMark;
    }

    public String getQuestionTeme() {
        return questionTeme;
    }

    public void setQuestionTeme(String questionTeme) {
        this.questionTeme = questionTeme;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getPlayerAnswer() {
        return playerAnswer;
    }

    public void setPlayerAnswer(String playerAnswer) {
        this.playerAnswer = playerAnswer;
    }

    public String getOpcion1() {
        return opcion1;
    }

    public void setOpcion1(String opcion1) {
        this.opcion1 = opcion1;
    }

    public String getOpcion2() {
        return opcion2;
    }

    public void setOpcion2(String opcion2) {
        this.opcion2 = opcion2;
    }

    public String getOpcion3() {
        return opcion3;
    }

    public void setOpcion3(String opcion3) {
        this.opcion3 = opcion3;
    }

    public String getOpcion4() {
        return opcion4;
    }

    public void setOpcion4(String opcion4) {
        this.opcion4 = opcion4;
    }
}