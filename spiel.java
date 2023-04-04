import java.util.Scanner;
public class spiel{

    Scanner scan = new Scanner(System.in);

    String spielerNamen = scan.nextLine();

    static Fabrik fabrik = new Fabrik();
    static int anzahlKunden = 100;
    static boolean spielEnde = false;
    static Spieler[] spielerListe;
    static int[] produktionsZahlen;
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
        produktionsZahlen = new int[spielerAnzahl];
        for(int i = 0; i < spielerListe.length;i++)
        {
            System.out.println("Hallo Spieler " + (i+1) + ", wie lautet dein Spielername?");
            Scanner scan2 = new Scanner(System.in);
            String spielerNamen = scan2.nextLine();
            Spieler spieler = new Spieler(10000, spielerNamen);
            spielerListe[i] = spieler;
            System.out.println("Viel Erfolg " + spielerNamen);
        }

    }
    //Hier findet der komplette Ablauf einer Runde statt wird aufgerufen bis spielEnde = false
    private static void spielAbblauf()
    {
        for(int i = 0; i < produktionsZahlen.length;i++)
        {
            System.out.println("Hallo " + spielerListe[i] + " wie viel willst du produzieren?");
            Scanner scan3 = new Scanner(System.in);
            int produktionsmenge = scan3.nextInt();
            produktionsZahlen[i] = produktionsmenge;

            //TODO Ereignisse einbauen

            double preis = spielerListe[i].fabrik.produktionskosten(produktionsmenge);
            if(spielerListe[i].konto - preis >= 0)
            {
                spielerListe[i].konto = spielerListe[i].konto - preis;
            }
            else
            {
                for(int x = 0; x < 100; x++)
                {

                }
            }
        }
         // fabrik.produktionskosten();
    }
    private static void profitBerechnen()
    {

    }
}