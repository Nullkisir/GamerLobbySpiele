public class Spieler{
    double konto;
    String name;
    Fabrik fabrik;

    public Spieler(double konto, String name)
    {
        this.konto = konto;
        this.name = name;
        fabrik = new Fabrik();
    }

    //setzt die Produktionsmenge der Spieler
    public void setProduktionsMenge(int produktionsAnzahl){
        fabrik.produktionsMenge = produktionsAnzahl;
    }

    //führt ein Upgrade gemäß den Upgrade nummer aus
    public void fabrikUpgrade(int upgradeNum){
        
    }
}