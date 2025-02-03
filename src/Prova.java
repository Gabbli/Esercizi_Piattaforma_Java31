import java.util.Arrays;
import java.util.Random;


public class Prova {
        public static void main(String[] args) {
            Random random = new Random();
            int[] array = new int[10];

            // Riempimento e stampa dell'array originale
            System.out.println("Array originale:");
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(5);
                System.out.print(array[i] + " ");
            }

            // Definizione e sostituzione dei "gliteri" (esempio: numeri maggiori di 5)
            int sogliaGlitter = 10; // Sostituisci con la tua logica per "gliteri"
            for (int i = 0; i < array.length; i++) {
                if (array[i] > sogliaGlitter) {
                    array[i] = -1;
                }
            }

            // Stampa dell'array modificato
            System.out.println("\nArray modificato:");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }

            // Stampa degli elementi duplicati
            System.out.println("\nElementi duplicati:");
            stampaDuplicati(array);
        }

        public static void stampaDuplicati(int[] array) {
            Arrays.sort(array); // Ordina l'array per trovare facilmente i duplicati

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] == array[i + 1]) {
                    System.out.print(array[i] + " ");
                    i++; // Salta l'elemento successivo per evitare di stamparlo di nuovo
                }
            }
        }
}
