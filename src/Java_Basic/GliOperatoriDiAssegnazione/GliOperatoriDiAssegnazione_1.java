package Java_Basic.GliOperatoriDiAssegnazione;
/*
Scrivi un programma che contiene un metodo che date due variabili
le incrementi di un valore scelto da te e le moltiplichi fra di loro.

Il metodo dovrà restituire il risultato dell'operazione che dovrà essere stampato a video.
 */
public class GliOperatoriDiAssegnazione_1 {
    public static void main(String[] args) {

        // Dichiarazione del risultato tra due interi
        int risultato = incrementazioneVariabili(12, 22);
        // Stampa del risultato finale
        System.out.println("Il risultato è: "+ risultato);

    }
    // Metodo per restituire il risultato imcrementato e moltiplicato
    public static int incrementazioneVariabili(int n1, int n2){
        n1 += 2;
        n2 += 2;

        return n1 * n2;
    }
}
