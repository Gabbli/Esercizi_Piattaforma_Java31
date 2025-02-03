package Java_Basic.GliOggetti;
/*
Scrivere un programma che contenga una classe che definisce uno Studente che abbia come proprietà nome, cognome ed identificativo.
Per questa classe saranno necessari i metodi accessori (getter e setter) ed un costruttore.
Nel main dichiarare un oggetto di tipo Studente.
 */
public class GliOggetti1 {
    public static void main(String[] args) {

        Studente studente = new Studente("Gabriele", "Gaita", "A123");
        System.out.println(studente);
    }
}
