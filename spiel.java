import java.util.Scanner;
public class spiel{

    Scanner scan = new Scanner(System.in);

    String spielerNamen = scan.nextLine();

    static Fabrik fabrik = new Fabrik();
    static int anzahlKunden = 100;
    static boolean spielEnde = false;
    static Spieler[] spielerListe;
    static int[] produktionsZahlen;
    static int[] verkaufspreise;
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
        //Sammelt alle produktionsmengen
        for(int i = 0; i < produktionsZahlen.length;i++)
        {
            System.out.println("Hallo " + spielerListe[i] + " wie viel willst du produzieren?");
            Scanner scan3 = new Scanner(System.in);
            int produktionsmenge = scan3.nextInt();
            produktionsZahlen[i] = produktionsmenge;
            System.out.println("Und wie viel sollen deine Produkte kosten? Bitte in Cent angeben");
            Scanner scan4 = new Scanner(System.in);
            int verkaufspreis = scan4.nextInt();
            verkaufspreise[i] = verkaufspreis;
        }
        //Ereigniss erfolgt
        ereigniskarten.ereigniskartenMain();
        //Berechnung der Produktionszahlen und Kostenabrechnung
        for(int i = 0; i < produktionsZahlen.length;i++)
        {
            double preis = spielerListe[i].fabrik.produktionskosten(produktionsZahlen[i]);
            if(spielerListe[i].konto - preis >= 0)
            {
                spielerListe[i].konto = spielerListe[i].konto - preis;
                System.out.println("Es wurden erfolgreich " + produktionsZahlen[i] + " Einheiten produziert");
            }
            else
            {
                for(int x = produktionsZahlen[i]; x > 0; x--)
                {
                    preis = spielerListe[i].fabrik.produktionskosten(x);
                    if(spielerListe[i].konto - preis >= 0)
                    {
                        spielerListe[i].konto = spielerListe[i].konto - preis;
                        System.out.println("Es wurden nur " + x + " Einheiten produziert");
                    }
                }
            }
            profitBerechnen(); //TODO implementieren
            ueberpruefeSpielende(); //TODO implementieren
        }
    }
    private static void profitBerechnen()
    {

    }
    private static void ueberpruefeSpielende()
    {

    }
}