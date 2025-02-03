package Java_Basic.CicliAvanzati;
/*
Scrivi un programma che contiene un metodo che prende in ingresso un valore numerico
e stampa tutti i numeri fino al valore immesso, la stampa dovrà interrompersi se il valore è uguale a 5.
 */
public class CicliAvanzati_1 {
    public static void main(String[] args) {

        // Variabile per identificare il numero massimo da raggiungere
        int n = 10;
        // Richiamo della funzione per stampare il numero massimo raggiungibile 5
        printNumberUpToFive(n);

    }

    // Metodo che prende in ingresso un valore numerico e si interrompe se il numero è uguale a 5
    public static void printNumberUpToFive(int number) {

        for(int i = 1; i <= number; i++){
            if(i == 5){
                break;
            }
            System.out.println(i);
        }
    }
}
