package Java_Basic.Switch;

import java.util.Scanner;

/*
Scrivi un programma che contiene un metodo che prende in ingresso un carattere e ne identifica il tipo per un'operazione di algebra
(+ addizione - sottrazione * moltiplicazione / divisione).
Nel caso non riesca ad identificare il tipo di operazione dovrà restituire una stringa di errore.
 */
public class Switch2 {
    public static void main(String[] args) {
        Scanner lettore = new Scanner(System.in);
        // Richiesta per l'utente di inserire un numero
        System.out.print("Inserisci un numero ");
        double n1 = lettore.nextDouble();
        // Seconda Richiesta per l'utente di inserire un numero
        System.out.print("Inserisci un numero ");
        double n2 = lettore.nextDouble();
        // terza Richiesta per l'utente di inserire un operatore
        System.out.print("Inserisci un operatore (+, -, *, /) ");
        String operatore = lettore.next();

        String risultato = calculate(n1, n2, operatore);

        System.out.println(risultato);
    }

    public static String calculate(double n1, double n2, String operatore){

        switch (operatore){
            case "+": return String.valueOf(n1 + n2);
            case "-": return String.valueOf(n1 - n2);
            case "*": return String.valueOf(n1 * n2);
            case "/": if(n2 == 0){return "Errore: impossibile divedere per zero";}else{return String.valueOf(n1 / n2);}
            default: return "Errore: operatore non disponibile";
        }
    }
}
