public class Fabrik {
    int produktionsMenge = 1;
    int zaehlerMengenrabatt = 10;
    double produktionsPreis = 0.25 * produktionsMenge;

    public void main() {
        for(int i = 0; i==1000; i++) {
            if(produktionsMenge < zaehlerMengenrabatt){
               produktionsPreis = produktionsPreis * (1 - 0.01 * i);
            }
        }
        System.out.println("hi");
    }

    
}
