import java.util.Scanner;
public class spiel{

    Scanner scan = new Scanner(System.in);
    int spielerAnzahl = scan.nextInt();
    String spielerNamen = scan.nextLine();
    double spielerAnzahd = scan.nextDouble();

    static Fabrik fabrik = new Fabrik();
    static int anzahlSpieler = 5; // Ändern
    static int anzahlKunden = 101;
    static boolean spielEnde = false;
    static Spieler[] spielerListe = new Spieler[anzahlSpieler];
    public static void main(String[] args)
    {
        spielerAnlegen();
        while(!spielEnde)
        {
            spielAbblauf();
        }
    }
    //Legt die Anzahl und Namen der Spieler fest und erstellt sie
    private static void spielerAnlegen()
    {

    }
    //Hier findet der komplette Ablauf einer Runde statt wird aufgerufen bis spielEnde = false
    private static void spielAbblauf()
    {
        fabrik.produktionskosten();
    }
}