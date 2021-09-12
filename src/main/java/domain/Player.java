package domain;

public class Player {
    private int playerId;
    private String playerName;
    private String email;
    private int earnedMoney;

    public Player() {
    }

    public Player(String playerName, String email, int earnedMoney) {
        this.playerName = playerName;
        this.email = email;
        this.earnedMoney = earnedMoney;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEarnedMoney() {
        return earnedMoney;
    }

    public void setEarnedMoney(int earnedMoney) {
        this.earnedMoney = earnedMoney;
    }

}
