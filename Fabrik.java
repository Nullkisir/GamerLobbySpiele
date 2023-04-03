public class Fabrik {
    int produktionsMenge 1;
    int zaehlerMengenrabatt 10;
    int produktionsPreis = 0.25 * produktionsMenge;

    public static
    for(int i = 0; i==1000; i++) {
        if(produktionsMenge < zaehlerMengenrabatt){
            produktionsPreis * (1 - 0.01 * i);
        }
    }
}
