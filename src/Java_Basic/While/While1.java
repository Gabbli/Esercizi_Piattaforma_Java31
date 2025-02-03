package Java_Basic.While;

import java.util.Scanner;

/*
Scrivere un programma che contenga un metodo che sfrutti il while loop
e prenda in ingresso 1 valore intero come limite superiore e calcola la somma di tutti i valori prima del limite e la stampa a video.
(Esempio passo 5 come limite e otterrò la somma di 1 + 2 + 3 + 4)
 */
public class While1 {
    public static void main(String[] args) {

        // Importazione dello Scanner per fare una richiesta all'utente
        Scanner lettore = new Scanner(System.in);
        // richiesta per l'utente
        System.out.print("Inserisci un limite da sommare ");
        // Variabile per salvare la risposta dell'utente
        int limite = lettore.nextInt();
        // Variabile che identifica l'inizio della somma
        int inizio = 0;

        int sommaDeiNumeriPrecedenti = sumOnWhileLoop(inizio, limite);

        // Stampa del risultato finale
        System.out.println("La somma dei numeri di "+ limite+ " è "+ sommaDeiNumeriPrecedenti);

        lettore.close(); // chiusura dello Scanner
    }

    // Metodo per sommare tutti i numeri precedenti al limite
    public static int sumOnWhileLoop(int n1, int limite){

        // Verifica se un numero è positivo
            if (limite <= 0){
                throw new IllegalArgumentException("Il limite deve essere un intero positivo.");
        }
            int somma = 0; // inizializzo la somma a 0
            while (n1 < limite){
                somma += n1; // incremento la somma + n1
                n1++; // incremento solo n1
            }
            return somma;
    }
}
