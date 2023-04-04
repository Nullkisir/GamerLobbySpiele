public class ereigniskarten
{
    String[] ereignissTexte =
            {       "Senkt die Produktionskosten für eine Runde um 5% bis 25%",
                    "Steigert die Produktionskosten für eine Runde um 5% bis 25%",
                    "Senkt die Anzahl der Kunden um 10 bis 50 Kunden",
                    "Steigert die Anzahl der Kunden um 10 bis 50 Kunden "};
    int anzahlEreignisse = ereignissTexte.length;
    public void ereigniskartenMain()
    {
        double wahrscheinlichkeitFuerEreigniss = Math.random();
        //Überprüft ob ein Ereigniss eintritt
        if(wahrscheinlichkeitFuerEreigniss <= 0.33)
        {
            int indexEreigniss = (int) (Math.random() * (anzahlEreignisse-1));

            //Ereignisse:
            if(indexEreigniss == 0)
            {
                ausgabe(ereignissTexte[0]);

                //Änderung: Produktionskosten Senkung 5% bis 25% eine Runde
                double produktionsKostenSenkung = (int) (Math.random() * 20 + 5);
                for(int i = 0; i < spiel.spielerListe.length; i ++)
                {
                    spiel.spielerListe[i].fabrik.produktionsPreis = spiel.spielerListe[i].fabrik.produktionsPreis * (1 - produktionsKostenSenkung/100);
                }
            }
            else if(indexEreigniss == 1)
            {
                ausgabe(ereignissTexte[1]);

                //Änderung: Produktionskosten Steigung 5% bis 25% eine Runde
                double produktionsKostenSteigung = (int) (Math.random() * 20 + 5);
                for(int i = 0; i < spiel.spielerListe.length; i ++)
                {
                    spiel.spielerListe[i].fabrik.produktionsPreis = spiel.spielerListe[i].fabrik.produktionsPreis * (1 + produktionsKostenSteigung/100);
                }
            }
            else if(indexEreigniss == 2)
            {
                ausgabe(ereignissTexte[2]);

                //Änderung: Anzahl Kunden verringert um 10 bis 50 eine Runde
                int anzahlKundenSenkung = (int) (Math.random() * 40 + 10);
                spiel.anzahlKunden = spiel.anzahlKunden - anzahlKundenSenkung;
            }
            else if(indexEreigniss == 3)
            {
                ausgabe(ereignissTexte[3]);

                //Änderung: Anzahl Kunden steigt um 10 bis 50 eine Runde
                int anzahlKundenSteigung = (int) (Math.random() * 40 + 10);
                spiel.anzahlKunden = spiel.anzahlKunden + anzahlKundenSteigung;
            }
        }
    }
    //Funktion regelt die Ausgabe:
    private void ausgabe(String text)
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
