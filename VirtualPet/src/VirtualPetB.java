// Part B

public class VirtualPetB {

        private String name;
        private int energy;
        private int happiness;
        private int weightG;
        private int ageY;
        private int ageM;

        public VirtualPetB(String name){
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
        public void feed(Food food){
            if(food.getEnergyRating()>=0&& food.getEnergyRating()<11){
                energy++;
                weightG++;
            }
            if(energy==-1){
                energy= 0;
            }
            if(happiness==-1){
                happiness =0;
            }
            if(happiness==11){
                happiness =10;
            }else if(energy==11){
                energy= 10;
            }
        }
        public int getEnergyLevel(){
            return energy;
        }
        public int getHappinessLevel(){
            return happiness;
        }
        public boolean play(Game game){
            if((happiness>=0&&happiness<11)&&(game.getWeightLoss()>4)){
                happiness++;
                weightG--;
            }

            boolean winner = game.isWinner();
            if(winner){
                happiness++;
            }else{
                happiness--;
            }if(energy==-1){
                energy= 0;
            }
            if(happiness==-1){
                happiness =0;
            }
            if(happiness==11){
                happiness =10;
            }else if(energy==11){
                energy= 10;
            }
            return winner;
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

                if(happiness==11){
                    happiness =10;
                }else if(energy==11){
                    energy= 10;
                }
            }
        }




}