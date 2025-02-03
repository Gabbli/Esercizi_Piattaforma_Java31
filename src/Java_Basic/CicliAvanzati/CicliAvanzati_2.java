package Java_Basic.CicliAvanzati;
/*
Scrivi un programma che contiene un metodo che prende in ingresso un valore numerico
e stampa tutti i numeri fino al valore immesso, la stampa dovrà saltare il valore uguale a 5.
 */
public class CicliAvanzati_2 {
    public static void main(String[] args) {
        // Variabile per contare fino a 10
        int maxNumber = 10;
        // Richiamo del metodo che contando fino a 10 permette di saltare il numero 5
        printNumbersskippingTheFive(maxNumber);
    }

    // Metodo per stampare tutti i numeri saltando il numero 5
    public static void printNumbersskippingTheFive(int number){
        for(int i = 1; i <= number; i++){
            if(i == 5){
                System.out.println("saltato il numero 5");
                continue;
            }
            System.out.println(i);
        }
    }
}
