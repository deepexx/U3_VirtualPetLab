// Part B

public class Game {
    private String name;
    private int happinessInc;
    private int weightGain;
    public Game(String name, int happinessIncr, int weightDecr){

    }

    public String getName() {
        return name;
    }

    public int getHappinessInc() {
        return happinessInc;
    }

    public int getWeightLoss() {
        return weightGain;
    }
    public boolean isWinner() {
        return Math.random() < 0.5;
    }

}
