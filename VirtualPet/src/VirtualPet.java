// Part A

public class VirtualPet {
    private String name;
    private int energy;
    private int happiness;
    private int weightG;
    private int ageY;
    private int ageM;

    public VirtualPet(String name){
        this.name = name;
        this.weightG = 5;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return name+"'s information:  \n Energy: "+ energy + "\n Happiness: "+ happiness +
                "\n Weight:  "+ weightG + "\n Age:  "+ageM + " months and " +ageY + " years";
    }
    public void feed(){
        if(energy>=0&&energy<11){
            energy++;
            weightG++;
        }
        if(energy==-1){
            energy= 0;
        }
    }
    public int getEnergyLevel(){
        return energy;
    }
    public int getHappinessLevel(){
        return happiness;
    }
    public void play(){
        if((happiness>=0&&happiness<11)&&(weightG>4)){
            happiness++;
            weightG--;
        }
        if(happiness==-1){
            happiness =0;
        }
    }
    public void updateStatus(){
        if((happiness>=0)&&(happiness<11)&&energy>=0&&energy<11){
            happiness--;
            energy--;
            ageM++;
            if(ageM>12){
                ageY++;
                ageM = 0;
            }

            if(happiness==-1){
                happiness =0;
            }else if(energy==-1){
                energy= 0;
            }
        }
    }


}
