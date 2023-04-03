public class ereigniskarten
{
    String[] ereignissTexte = {"Test0","Test1"};
    int anzahlEreignisse = 4; //Anzahl muss geändert werden
    public void ereigniskartenMain()
    {
        double wahrscheinlichkeitFuerEreigniss = Math.random();
        //Überprüft ob ein Ereigniss eintritt
        if(wahrscheinlichkeitFuerEreigniss <= 0.33)
        {
            double indexEreigniss = Math.random() * (anzahlEreignisse-1);

            //Ereignisse:
            if(indexEreigniss == 0)
            {
                ausgabe("Test0");
            }
            else if(indexEreigniss == 1)
            {
                ausgabe("Test1");
            }
            else if(indexEreigniss == 2)
            {
                ausgabe("Test2");
            }
            else if(indexEreigniss == 3)
            {
                ausgabe("Test3");
            }
        }
    }
    //Funktion regelt die Ausgabe:
    private void ausgabe(String text)
    {
        System.out.println(text);
    }
    private int indexAusgabeZuTextEingabe()
    {
        return 0;
    }
}
