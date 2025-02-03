package Java_Basic.For;

import java.util.Scanner;

/*
Scrivi un programma che contenga un metodo che prende in ingresso un numero e il massimo numero di risultati che vuoi avere
e stampi tutti i numeri naturali in ordine inverso
(quindi se passo il punto di partenza a 6 e gli dico di restituirmi 3 risultati mi aspetto in uscita [6 5 4] stampati).
 */
public class For2 {
    public static void main(String[] args) {

        // implentazione dello Scanner per una richiesta riferita all'utente
        Scanner lettore = new Scanner(System.in);
        // Richiesta all'utente
        System.out.print("Inserisci un numero per iniziare il decremento ");
        // Variabile per salvare la richiesta dell'utente
        int numeroDiPartenza = lettore.nextInt();
        // Richiesta all'utente per inserire in numero massimo da raggiungere
        System.out.print("Inserisci un numero massimo di risultati da raggiungere ");
        // Variabile per salvare la richiesta dell'utente
        int numeroMassimo = lettore.nextInt();

        risultatoInverso(numeroDiPartenza, numeroMassimo);

        lettore.close();
    }

    public static void risultatoInverso(int numero, int numeroMassimo){

        // Controllo se il numero inserito sia maggiore si zero
        if (numero <= 0) {
            throw new IllegalArgumentException("Il numero deve essere un intero positivo.");
        }

        // Ciclo for per iterare nel numero inserito
        for(int i = numero -1; i >= numeroMassimo; i--){
            System.out.println("La partenza è "+ numero+ " il risultato è "+ i);
        }
    }
}
