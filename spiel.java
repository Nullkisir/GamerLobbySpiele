public class spiel{
    static Fabrik fabrik = new Fabrik();
    static int anzahlSpieler = 5; // Ändern
    static int anzahlKunden = 101;
    static Spieler[] spielerListe = new Spieler[anzahlSpieler];
    public static void main(String[] args)
    {
        fabrik.produktionskosten();
    }
}