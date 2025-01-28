package Java_Basic.MetodoIfElse;

import java.util.Scanner;

/*
Scrivere un programma che dato un valore inserito dall'utente o dichiarato in una variabile,
utilizzi un metodo che per i multipli di 3 stampi "Fizz" al posto del numero e per i multipli di 5 stampi "Buzz".
Nel caso in cui un numero sia multiplo di entrambi stampi "FizzBuzz".
 */
public class MetodoIfElse_1 {
    public static void main(String[] args) {

        //  Importazione della classe Scanner
        Scanner scanner = new Scanner(System.in);

        // richiesta per l'utente per inserire un numero
        System.out.println("Digita un numero a tuo piacimento: ");

        // Dichiarazione dello Scanner all'interno di una variabile int
        int numeroSelezionato = scanner.nextInt();

        // Stampa del risultato finale
        System.out.println(fizzBuzz(numeroSelezionato));

        // Chiusura dello Scanner
        scanner.close();
    }


    // Metodo per determinare se un numero è un multipli di 3, 5 o di entrambi
    public static String fizzBuzz(int numero){
        if (numero % 3 == 0 && numero % 5 == 0) {
            return "FizzBuzz";
        } else if (numero % 3 == 0) {
            return "Fizz";
        } else if (numero % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(numero);
        }
    }
}
