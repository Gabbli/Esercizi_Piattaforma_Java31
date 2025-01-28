package Java_Basic.GlOperatoriLogici;
/*
Scrivi un programma che contiene un metodo che dati 2 interi in ingresso ed un valore di confronto
verifichi se il numero di confronto è compreso tra due valori specifici
e stampi il risultato dell'operazione comprensivo dei due limiti (inferiore e superiore)
 */
public class GliOperatoriLogici_1 {
    public static void main(String[] args) {

        // Dichiarazione di 3 numeri interi
        int numeroInferiore = 10;
        int numeroSuperiore = 20;
        int numeroDaConfrontare = 15;

        // Dichiarazione variabile boolean per decretare se il numero sia compreso
        boolean eCompreso = eCompresoNellIntervallo(numeroInferiore, numeroSuperiore, numeroDaConfrontare);

        // Metodo if per verificare se è compreso o meno
        if(eCompreso){
            System.out.println(numeroDaConfrontare + " è compreso tra "+ numeroInferiore + " e "+ numeroSuperiore);
        }else{
            System.out.println(numeroDaConfrontare + " non è compreso tra "+ numeroInferiore + " e "+ numeroSuperiore);
        }
    }

    // Metodo che prende in ingresso 2 numeri interi e un valore di contronto per verificare se è compreso tra i due numeri interi
    public static boolean  eCompresoNellIntervallo(int numeroInferiore, int numeroSuperiore, int numero){
        return numero >= numeroInferiore && numero <= numeroSuperiore;
    }
}
