import java.util.Scanner;

public class Markt {
    String[][][] upgradePreiseList = new String[1][3][1];
    String[] upgradeKategorien;
    public void listAusgabe(){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();


        System.out.print("Waehle eine Upgrade Kategorie"+num);
        
        scan.close();
    }
}
//evtl. kann man noch Versicherungen einbauen, die man pro Runde bezahlen muss.
//man kann dann iwo Sachen machen die passieren koennen und wenn man keine Versicherung hat dann muss man zahlen
//Die Versicherung waere dann pro Runde zu bezahlen
