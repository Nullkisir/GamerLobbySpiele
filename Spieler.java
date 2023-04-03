public class Spieler{
    double konto;
    String name;
    Fabrik fabrik;

    //setzt die Produktionsmenge der Spieler
    public void setProduktionsMenge(int produktionsAnzahl){
        fabrik.produktionsMenge = produktionsAnzahl;
    }

    //führt ein Upgrade gemäß den Upgrade nummer aus
    public void fabrikUpgrade(int upgradeNum){
        
    }
}