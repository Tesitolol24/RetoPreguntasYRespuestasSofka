package domain;

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
}
