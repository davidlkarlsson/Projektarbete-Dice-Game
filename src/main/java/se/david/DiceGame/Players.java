package se.david.DiceGame;

public class Players {

    //ATTRIBUT

    private String playerName;
    private int playerScore;

    //KONSTRUKTOR

    public Players(String playerName) {

        this.playerName = playerName;
    }


    //SETTERS

    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }


    //GETTERS

    public String getPlayerName() {
        return playerName;
    }


    public int getPlayerScore() {
        return playerScore;
    }


}




