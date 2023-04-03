import java.util.Scanner;

public class Markt {
    String[][][] upgradePreiseList = new String[1][3][1];
    String[] upgradeKategorien;
    public void listAusgabe(){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();


        System.out.print("Waehle eine Upgrade Kategorie");
        
        scan.close();
    }
}
