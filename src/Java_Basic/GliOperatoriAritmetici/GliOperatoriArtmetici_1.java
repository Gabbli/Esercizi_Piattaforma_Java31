package Java_Basic.GliOperatoriAritmetici;
/*
Definisci un metodo che restituisce il resto della divisione di due numeri interi e stampalo a schermo.
 */
public class GliOperatoriArtmetici_1 {
    public static void main(String[] args) {

        // Stampa del resto tra due numeri interi
        System.out.println(restoDellaDivisione(45, 5));
    }

    //Metodo che restituisce il resto tra due numeri interi
    public static int restoDellaDivisione(int n1, int n2){
        return n1 % n2;
    }
}
