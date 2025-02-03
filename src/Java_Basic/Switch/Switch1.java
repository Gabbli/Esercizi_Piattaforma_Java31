package Java_Basic.Switch;

import java.util.Scanner;
/*
Scrivi un programma che contiene un metodo che prende in ingresso un valore numerico
e restituisce il nome del giorno della settimana come stringa o una stringa di errore
nel caso di valore maggiore di 7 o minore di 1.
 */
public class Switch1 {
    public static void main(String[] args) {

        // implemetazione dello Scanner
        Scanner lettore = new Scanner(System.in);

        // Richiesta per l'utente
        System.out.println("Inserisci un numero da 1 a 7 ");

        // Variabile per salvare la rispota dell'utente
        int giorno = lettore.nextInt();

        // Stampa del risultato finale
        System.out.println("Il numero selezionato "+ giorno + " corrisponde al giorno "+ dayOfWeek(giorno));
    }

    // Funzione per convertire il numero dell'utente in un giorno della settimana
    public static String dayOfWeek(int giorno){

        switch (giorno){
            case 1: return "Lunedi";
            case 2: return "Martedi";
            case 3: return "Mercoledi";
            case 4: return "Giovedi";
            case 5: return "Venerdi";
            case 6: return "Sabato";
            case 7: return "Domenica";
            default: return "Errore: inserisci un numero valido tra 1 e 7";
        }
    }
}
