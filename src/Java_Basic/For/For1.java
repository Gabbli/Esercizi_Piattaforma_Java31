package Java_Basic.For;

import java.util.Scanner;

/*
Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico
e restituisca la tabellina aritmetica di quel numero che dovrà essere stampata a video.
 */
public class For1 {
    public static void main(String[] args) {
        // implentazione dello Scanner per una richiesta riferita all'utente
        Scanner lettore = new Scanner(System.in);
        // Richiesta all'utente
        System.out.print("Inserisci un numero per avere la tabellina ");
        // Variabile per salvare la richiesta dell'utente
        int numeroInserito = lettore.nextInt();

        // Imposto il limite da iterare nel ciclo for per eseguire la tabellina fino al 10
        int limite = 11;

        // Richiamo della funzione getTabellina
        getTabellina(numeroInserito, limite);

    }

    // Metodo per restiture la tabellina di un numero dato dall'utente
    public static void getTabellina(int numero, int limite){

        // Verifica che il numero e il limite siano maggiori di 0
        if (numero <= 0 || limite <= 0) {
            throw new IllegalArgumentException("Sia il numero che il limite devono essere interi positivi.");
        }

        int risultato; // inizializzo una Variabile risultato senza un valore aggiunto

        // Ciclo for per iterare sul numero dato
        for(int i = 0; i < 11; i ++) {
            risultato = i * numero; // assegno alla variabile risultato il valore i * numero
            System.out.println(numero + " x " + i + " = " + risultato);
        }
    }
}
