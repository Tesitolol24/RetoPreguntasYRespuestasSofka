package domain;

import java.util.ArrayList;
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

    //Metodo para generar un numero aleatorio
    public int generateRandomNumber(){
        int randomNumber = (int)(Math.random()*4+0);
        return randomNumber;
    }

    public void nextOrNot(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tienes: "+ getPoints() +" Puntos");
        System.out.println("¿Deseas continuar en el juego o deseas retirarte con el monto obtenido, recuerda que si la siguiente pregunta la respondes mal te vas a casa con 0$?");
        System.out.println("Si deseas continuar marca 1 de lo contrario marca 2");

        setYesOrNot(scanner.nextInt());
    }

    //Metodo para renderizar fin el juego
    public void gameOver(){
        System.out.println("Juego terminado");
    }

    //Metodo para renderizar que ganaste
    public void winner(){
        System.out.println("Has ganado un monto de: "+ getPoints()+ " Puntos");
    }

    //Metodo renderizar salida a voluntad del juego
    public void retreat(){
        System.out.println("Bien, se ha llevado un monto de: "+ getPoints()+ " Puntos");
    }

    //Metodo para simplificar la logica de los rounds 1, 2, 3
    public void roundLogic(ArrayList<Question> arrayList){
        if(getIsCorrect() == 1 && getYesOrNot() == 1){
            makeAQuestion(arrayList.get(generateRandomNumber()));
            if (getIsCorrect() == 1){
                nextOrNot();
                if (getIsCorrect() == 1 && getYesOrNot() == 2){
                    retreat();
                }
            }
        }else {
            if(getIsCorrect() == 0){
                gameOver();
                setIsCorrect(0);
            }
        }
    }

    //Round 1
    public void roundOne(ArrayList<Question> easyQuestions){
        makeAQuestion(easyQuestions.get(generateRandomNumber()));
        if (getIsCorrect() == 1){
            nextOrNot();
            if(getIsCorrect() == 1 && getYesOrNot() == 2){
                retreat();
            }
        }else {
            if(getIsCorrect() == 0){
                setIsCorrect(0);
                gameOver();
            }
        }
    }

    public void roundTwo(ArrayList<Question> middleQuestions){
        roundLogic(middleQuestions);
    }

    public void roundThree(ArrayList<Question> hardQuestions){
        roundLogic(hardQuestions);
    }

    public void roundFour(ArrayList<Question> expertQuestions){
        roundLogic(expertQuestions);
    }

    //Round 5
    public void roundFive (ArrayList<Question> legendaryQuestions){
        if(getIsCorrect() == 1 && getYesOrNot() == 1){
            makeAQuestion(legendaryQuestions.get(generateRandomNumber()));
            if (getIsCorrect() == 1){
                winner();
            }
        }else {
            if (getIsCorrect() == 0) {
                setIsCorrect(0);
                gameOver();
            }
        }
    }
}


