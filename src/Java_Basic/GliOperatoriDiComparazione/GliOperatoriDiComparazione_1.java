package Java_Basic.GliOperatoriDiComparazione;
/*
Scrivi un programma che contiene un metodo che che confronti due numeri interi e determini se sono diversi.
Il programma dovrà stampare a video i due valori e il risultato dell'eguaglianza
 */
public class GliOperatoriDiComparazione_1 {
    public static void main(String[] args) {

        // Dichiarazione dei due numeri interi
        int n1 = 23;
        int n2 = 23;

        // Variabile boolean per determinarne l'uguaglianza
        boolean sonoUguali = confrontoDeiNumeri(n1, n2);

        // Stampa dei numeri e del risultato finale dell'uguaglianza
        System.out.println("I numeri " + n1 + " e " + n2 + " sono uguali? " + sonoUguali);
    }

    // Metodo per determinare se due numeri interi sono uguali
    public static boolean confrontoDeiNumeri(int n1, int n2){
        return n1 == n2;
    }
}
