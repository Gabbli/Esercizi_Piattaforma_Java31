package Java_Basic.Array;
import java.util.Random;
/*
Scrivi un programma che contiene un metodo per creare un array e lo riempire con dei caratteri.
Questo metodo dovrà poi stampare tutte le occorrenze del carattere a o 0 nel caso non ce ne siano.
 */
public class Array_2 {
    public static void main(String[] args) {
        char[] array = new char[10];
        riempiEStampa(array);
    }

    public static void riempiEStampa(char[] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = (char) (random.nextInt(25) + 'a');// Genera lettera casuale
            System.out.print(array[i] + " "); // Stampa carattere corrente
        }
        System.out.println(" ");
        int incremento = 0;
        for(int j = 0;  j < array.length; j++){
            if(array[j] == 'a'){
                incremento++;
            }
        }
        if(incremento > 0){
            System.out.println("Ho trovato 'a' "+ incremento+ " volte");
        }else{
            System.out.println(incremento);
        }
    }
}
