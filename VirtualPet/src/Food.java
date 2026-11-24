// Part B

public class Food {
    private String name;
    private int energyInc;
    private int happinessInc;
    private int weightGain;
    public Food(String name, int energyIncrease, int happinessIncrease, int weightGain){
        this.name = name;
        this.energyInc = energyIncrease;
        this.happinessInc = happinessIncrease;
        this.weightGain = weightGain;

    }

    public String getName() {
        return name;
    }

    public int getEnergyRating() {
        return energyInc;
    }

    public int getHappinessRating() {
        return happinessInc;
    }

    public int getWeightGain() {
        return weightGain;
    }
}
