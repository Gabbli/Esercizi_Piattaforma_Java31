package Java_Basic.Array;

/*
Scrivi un programma che contiene un metodo che crea un array e lo riempie con i numeri da 1 a 10
e che calcola la somma dei numeri contenuti nell'array inizializzato e la stampi a video.
 */
public class Array_1 {
    public static void main(String[] args) {
        // Richiamo del metodo addNumbers
        int[] ilMioArray = addNumbers();
        // Richiamo del metodo per sommani i numeri all'interno dell'array
        int somma = sumOfNumberIntoArray(ilMioArray);

        // cliclo foreach per stampare il valore dell'array fino al 10
        for(int valore : ilMioArray){
            System.out.println(valore + " ");
        }
        System.out.println();

        System.out.println("La somma dell'array è "+ somma);
    }
    // Metodo per aggiungere un massimo di 10 numeri all'interno dell'array
    public static int[] addNumbers(){
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1; // Riempie l'array con i numeri da 1 a 10
        }
        return array;
    }
    // Metodo per sommare tutti i numeri all'interno dell'array
    public static int sumOfNumberIntoArray(int[] sum){
        int somma = 0;
        for(int numero : sum){
            somma += numero;
        }
        return somma;
    }
}
