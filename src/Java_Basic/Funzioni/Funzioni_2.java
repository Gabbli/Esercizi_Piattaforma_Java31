package Java_Basic.Funzioni;
/*
Definire una funzione che accetta in ingresso una stringa e ne restituisce la lunghezza
 */
public class Funzioni_2 {
    public static void main(String[] args) {

        System.out.println("La Stringa è lunga " + lunghezzaDellaStringa("Ciao Develhope")+ " caratteri");
    }

    // Funzione che accetta una stringa in ingresso e restituisce la lunghezza
    public static int lunghezzaDellaStringa (String parola){
        return parola.length();
    }
}
