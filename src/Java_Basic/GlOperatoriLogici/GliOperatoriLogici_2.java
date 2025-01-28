package Java_Basic.GlOperatoriLogici;
/*
Scrivi un programma che permetta di capire, tramite l'implementazione di due metodi, se un numero è pari o dispari.
 */
public class GliOperatoriLogici_2 {
    public static void main(String[] args) {

        // Dichiarazione di un numero intero
        int numero = 14;

        // Dichiarazione della variabile boolean per verificare se il numero è pari
        boolean ePari = numeroPari(numero);
        System.out.println("Metodo 1: " + numero + " è pari? " + ePari);
        // Dichiarazione della variabile boolean per verificare se il numero è pari
        boolean eDispari = numeroDispari(numero);
        System.out.println("Metodo 2: " + numero + " è dispari? " + eDispari);
    }

    // Metodo per capire se un numero è pari
    public static boolean numeroPari(int n1){
        return n1 % 2 == 0;
    }

    // Metodo per capire se un numero è dispari
    public static boolean numeroDispari(int n1){
        return n1 % 2 != 0;
    }
}
