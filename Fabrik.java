public class Fabrik {
    int produktionsMenge = 1;
    private int zaehlerMengenrabatt = 1;
    double produktionsPreis = 2.50 * produktionsMenge;
    private double fixKosten = 250;
    String[] upgrades = {"Foerderband","Buerosoftware","Energiedeal"};
    int[] upgradeLvl = {0,0,0};

    public double produktionskosten(){
        mengenrabattRechner();
        foerderbandUpgrade();
        buerosoftwareUpgrade();
        energiedealUpgrade();
        produktionsPreis += fixKosten;
        return produktionsPreis;
    }

    private void mengenrabattRechner() {
        for(int i = 0; i==6; i++) {
            if(produktionsMenge < zaehlerMengenrabatt){
               produktionsPreis = produktionsPreis * (1 - 0.01 * i);
               zaehlerMengenrabatt *= 10;
            }
            else{
                i = 6;
            }
        }
    }
    private void foerderbandUpgrade(){
        double foerderbandEffekt = 0.01;
        produktionsPreis -= ((foerderbandEffekt * upgradeLvl[0]) * produktionsMenge);
    }

    private void buerosoftwareUpgrade(){
        double buerosoftwareEffekt = 0.002;
        produktionsPreis *= (1 - (buerosoftwareEffekt * upgradeLvl[1]));
    }

    private void energiedealUpgrade(){
        fixKosten -= (10 * upgradeLvl[2]);
    }
}
