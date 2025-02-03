package Java_Basic.Array;

import java.util.Random;

/*
Scrivere un programma che contenga un metodo che permetta di sostituire gliteri
con il valore -1. L'array ottenuto dovrà essere stampato a vid elementi duplicati in un array di interi.
 */
public class Array_3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        System.out.println("Array originale ");

        // Riempimento dell'array
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");
        }
        elementiDuplicati(array);
    }

    public static void elementiDuplicati(int[] array){

        System.out.println("\nArray con dublicati ");
        for(int i = 0; i < array.length; i++){
            for(int j = 1; j < array.length; j++){
                if(array[j] == array[i]){
                    array[i] = -1;
                    System.out.print(array[j]);
                }
            }
        }
    }
}
