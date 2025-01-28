package Java_Basic.GliOperatoriAritmetici;
/*
Definisci un metodo che calcola la media tra 3 numeri e restituisci il risultato che dovrà essere stampato.
 */
public class GliOperatoriArtimetici_3 {
    public static void main(String[] args) {

        // Stampa della media tra tre numeri interi
        System.out.println(mediaTraINumeri(23, 47, 55));
    }

    // Metodo che prende in ingresso tre numeri interi e ne restituisce la media
    public static double mediaTraINumeri(int n1, int n2, int n3){
        return (double) (n1 + n2 + n3) / 3;
    }
}
