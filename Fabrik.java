public class Fabrik {


    //Die produktionsMenge wird von Spieler uebergeben und hier spaeter zur berechnung des ProduktionsPreises benutzt
    public int produktionsMenge = 1;

    //Mengenrabatt Schrittzaehler, immer *10 fuer die jeweiligen Spruenge
    private int zaehlerMengenrabatt = 1;

    //Menge mal Preis pro Stueck = Preis insgesamt
    public double produktionsPreis = 2.50 * produktionsMenge;

    //Jede Fabrik kostet pro Runde immer einen gewissen Betrag
    private double fixKosten = 250;

    //Upgrades vom Markt werden hier angelegt und darunter werden die Lvl. fuer die jeweilige Fabrik gespeichert
    public String[] upgrades = {"Foerderband","Buerosoftware","Energiedeal"};
    public int[] upgradeLvl = {0,0,0};

    //Alle Methoden werden aufgerufen und die fixkosten werden dazugerechnet um dann den finalen Preis uebergeben zu koennen
    public double produktionskosten(){
        mengenrabattRechner();
        foerderbandUpgrade();
        buerosoftwareUpgrade();
        energiedealUpgrade();
        produktionsPreis += fixKosten;
        return produktionsPreis;
    }

    //Alle *10 wir ein Mengenrabatt auf den Stueckpreis gewaehrt
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

    //Fuer jedes Lvl. Foerderband gibt es auf den Stueckpreis Rabatt
    private void foerderbandUpgrade(){
        double foerderbandEffekt = 0.01;
        produktionsPreis -= ((foerderbandEffekt * upgradeLvl[0]) * produktionsMenge);
    }

    //Fuer jedes Lvl. Buerosoftware wird ein hoeherer Mengenrabatt simuliert
    private void buerosoftwareUpgrade(){
        double buerosoftwareEffekt = 0.002;
        produktionsPreis *= (1 - (buerosoftwareEffekt * upgradeLvl[1]));
    }

    //Jedes Energiedeal Upgrade senkt die fixKosten um 10 Euro
    private void energiedealUpgrade(){
        fixKosten -= (10 * upgradeLvl[2]);
    }
}
