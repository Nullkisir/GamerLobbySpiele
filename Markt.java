import java.util.Scanner;

public class Markt {
    String[][][] upgradeList = new String[1][3][1];
    
    public void listAusgabe(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");

        // This method reads the number provided using keyboard
        int num = scan.nextInt();
        System.out.print(num);
        scan.close();
    }
}
