package Java_Basic.Casting;
/*
Scrivere uno snippet di codice che dati 2 numeri con la virgola (double)
li sommi e li stampi senza virgola (int).
 */
public class Casting_1 {
    public static void main(String[] args) {
        double primoNumero = 7.2;
        double secondoNumero = 4.3;
        int casting = (int) primoNumero + (int) secondoNumero;
        System.out.println(casting);
    }
}
