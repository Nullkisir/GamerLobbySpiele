import java.util.Scanner;
public class spiel{

    Scanner scan = new Scanner(System.in);

    String spielerNamen = scan.nextLine();
    double spielerAnzahd = scan.nextDouble();

    static Fabrik fabrik = new Fabrik();
    static int anzahlKunden = 100;
    static boolean spielEnde = false;
    static Spieler[] spielerListe;
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
        System.out.println("Wie viele Spieler spielen mit?");
        Scanner scan1 = new Scanner(System.in);
        int spielerAnzahl = scan1.nextInt();
        spielerListe =  new Spieler[spielerAnzahl];
        for(int i = 0; i < spielerListe.length;i++)
        {
            System.out.println("Hallo Spieler " + (i+1) + ", wie lautet dein Spielername?");
            Scanner scan2 = new Scanner(System.in);
            String spielerNamen = scan2.nextLine();
            Spieler spieler = new Spieler(10000, spielerNamen);
            spielerListe[i] = spieler;
            System.out.println("Viel Spaß " + spielerNamen);
        }

    }
    //Hier findet der komplette Ablauf einer Runde statt wird aufgerufen bis spielEnde = false
    private static void spielAbblauf()
    {
        fabrik.produktionskosten();
    }
}