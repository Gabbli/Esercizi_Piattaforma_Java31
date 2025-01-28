package Java_Basic.GliOperatoriDiComparazione;
/*
Scrivi un programma che contiene un metodo che che confronti due caratteri e determini se sono diversi.
Il programma dovrà stampare a video i due caratteri e il risultato dell'eguaglianza.
 */
public class GliOperatoriDiComparazione_2 {
    public static void main(String[] args) {

        // Dichiarazione di due caratteri
        char c1 = 'A';
        char c2 = 'B';

        // Dichiarazione variabile boolean per determinarne l'uguaglianza
        boolean sonoUguali = confrontoCaratteri(c1 , c2);

        // Stampa dei due caratteri e del rispettivo risultato di uguaglianza
        System.out.println("I caratteri " + c1 + " e " + c2 + " sono uguali? " + sonoUguali);
    }

    // Metodo per definire se due caratteri sono uguali
    public static boolean confrontoCaratteri(char c1, char c2){
        return c1 == c2;
    }
}
