package Java_Basic.Incapsulamento;
/*
Scrivere un programma che contenga una classe che definisce un'Auto che abbia come proprietà cilindrata, targa, marca e modello.
Per questa classe saranno necessari i metodi accessori (getter e setter) ed un costruttore.
Nel principale dichiarare un oggetto di tipo Auto.
In questo caso la nota importante è rendere le proprietà della classe auto accessibili solo attraverso i metodi.
 */
public class Incapsulamento_1 {
    public static void main(String[] args) {

        Auto auto = new Auto("Nissan", "Skyline", "FG 345HJ", "2568 cm3 156.71 cu. in.");
        System.out.println(auto.getMarca());
        System.out.println(auto.getModello());
        System.out.println(auto.getTarga());
        System.out.println(auto.getCilindrata());

    }
}
