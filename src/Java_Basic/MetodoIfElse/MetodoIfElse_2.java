package Java_Basic.MetodoIfElse;

import java.util.Scanner;

/*
Scrivi un programma che calcoli la lunghezza di una stringa,
sulla base di questa lunghezza stampi "Lunghezza maggiore di 10",
"Lunghezza minore di 10" o "Lunghezza pari a 10".
 */
public class MetodoIfElse_2 {
    public static void main(String[] args) {

        // Implementazione della classe Scanner
        Scanner scanner = new Scanner(System.in);

        // Richiesta per l'utente
        System.out.println("Scrivi una parola: ");

        // Dichiarazione dello Scanner all'interno di una variabile int
        String parola = scanner.nextLine();

        // Stampa del risultato finale
        System.out.println(lunghezzaStringa(parola));
    }

    // Metodo per verificare la lunghezza di una stringa
    public static String lunghezzaStringa(String parola){
        if(parola.length() > 10){
            return "Lunghezza maggiore di 10";
        } else if (parola.length() < 10){
            return "Lunghezza minore di 10";
        }else{
            return "Lunghezza pari a 10";
        }
    }
}
