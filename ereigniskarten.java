public class ereigniskarten
{
    public static double senkungProduktion;

    static String[] ereignissTexte =
            {       "Senkt die Produktionskosten für eine Runde um 5% bis 25%",
                    "Steigert die Produktionskosten für eine Runde um 5% bis 25%",
                    "Senkt die Anzahl der Kunden um 10 bis 50 Kunden",
                    "Steigert die Anzahl der Kunden um 10 bis 50 Kunden ",
                    "Unwetter vernichtet einen Teil der Produktion "};
    static int anzahlEreignisse = ereignissTexte.length;
    public static void ereigniskartenMain()
    {
        double wahrscheinlichkeitFuerEreigniss = Math.random();
        //Ueberprueft ob ein Ereigniss eintritt
        if(wahrscheinlichkeitFuerEreigniss <= 0.33)
        {
            int indexEreigniss = (int) (Math.random() * (anzahlEreignisse-1));

            //Ereignisse:
            if(indexEreigniss == 0)
            {
                ausgabe(ereignissTexte[0]);

                //Aenderung: Produktionskosten Senkung 5% bis 25% eine Runde
                double produktionsKostenSenkung = (int) (Math.random() * 20 + 5);
                for(int i = 0; i < spiel.spielerListe.length; i ++)
                {
                    spiel.spielerListe[i].fabrik.produktionsPreis = spiel.spielerListe[i].fabrik.produktionsPreis * (1 - produktionsKostenSenkung/100);
                }
            }
            else if(indexEreigniss == 1)
            {
                ausgabe(ereignissTexte[1]);

                //Aenderung: Produktionskosten Steigung 5% bis 25% eine Runde
                double produktionsKostenSteigung = (int) (Math.random() * 20 + 5);
                for(int i = 0; i < spiel.spielerListe.length; i ++)
                {
                    spiel.spielerListe[i].fabrik.produktionsPreis = spiel.spielerListe[i].fabrik.produktionsPreis * (1 + produktionsKostenSteigung/100);
                }
            }
            else if(indexEreigniss == 2)
            {
                ausgabe(ereignissTexte[2]);

                //Aenderung: Anzahl Kunden verringert um 10 bis 50 eine Runde
                int anzahlKundenSenkung = (int) (Math.random() * 40 + 10);
                spiel.anzahlKunden = spiel.anzahlKunden - anzahlKundenSenkung;
            }
            else if(indexEreigniss == 3)
            {
                ausgabe(ereignissTexte[3]);

                //Aenderung: Anzahl Kunden steigt um 10 bis 50 eine Runde
                int anzahlKundenSteigung = (int) (Math.random() * 40 + 10);
                spiel.anzahlKunden = spiel.anzahlKunden + anzahlKundenSteigung;
            }
            else if(indexEreigniss == 4)
            {
                ausgabe(ereignissTexte[4]);

                //Aenderung: Produkte die produziert werden sinkt um 50% -5% pro Versicherungsupgrade
                for(int i = 0; i < spiel.spielerListe.length; i ++)
                {
                int[] upgradeLvl = spiel.spielerListe[i].fabrik.upgradeLvl;
                double senkungsSenkung = 1 - (upgradeLvl[3] * 0.05);
                senkungProduktion = 0.5 - senkungsSenkung;
                }

            }
        }
    }
    //Funktion regelt die Ausgabe:
    private static void ausgabe(String text)
    {
        System.out.println(text);
    }
    //Funktion findet zu einer Text Eingabe den Index des Arrays. Wenn nicht vorhanden dann return -1
    private int indexAusgabeZuTextEingabe(String text)
    {
        for(int i = 0; i < ereignissTexte.length; i++)
        {
            if(ereignissTexte[i].equals(text))
            {
                return i;
            }
        }
        return -1;
    }
}
