package domain;

import java.util.Scanner;

public class Round extends Question{
    private int isCorrect;
    private int yesOrNot;
    private int points;

    public Round() {
    }

    public int getIsCorrect() {
        return isCorrect;
    }

    public void setIsCorrect(int isCorrect) {
        this.isCorrect = isCorrect;
    }

    public int getYesOrNot() {
        return yesOrNot;
    }

    public void setYesOrNot(int yesOrNot) {
        this.yesOrNot = yesOrNot;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    //Metodo para renderizar y responder preguntas
    public void makeAQuestion(Question question){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la letra de la respuesta que considere correcta, Ingresala en minuscula");
        System.out.println("");
        System.out.println(question.getQuestionNumber()+". "+question.getQuestionMark()+"  Tema: "+question.getQuestionTeme());

        System.out.println(question.getOpcion1());
        System.out.println(question.getOpcion2());
        System.out.println(question.getOpcion3());
        System.out.println(question.getOpcion4());

        question.setPlayerAnswer(scanner.nextLine());

        if(question.getPlayerAnswer().equals(question.getCorrectAnswer())){
            System.out.println("Es Correcto");
            setIsCorrect(1);
            increasePoints();
        } else {
            System.out.println("Es Incorrecto");
            setIsCorrect(0);
        }
    }

    public void increasePoints(){
        int accumulated = getPoints();
        accumulated += 5;
        setPoints(accumulated);
        pointsToZero();
    }

    public void pointsToZero(){
        setPoints(0);
    }
}
