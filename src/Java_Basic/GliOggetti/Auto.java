package Java_Basic.GliOggetti;
/*
Scrivere un programma che contenga una classe che definisce un'Auto che abbia come proprietà cilindrata, targa, marca e modello.
Per questa classe saranno necessari i metodi accessori (getter e setter) ed un costruttore.
Nel principale dichiarare un oggetto di tipo Auto.
 */
public class Auto {
    String marca;
    String modello;
    String targa;
    String cilindrata;

    public Auto(String marca, String modello, String targa, String cilindrata) {
        this.marca = marca;
        this.modello = modello;
        this.targa = targa;
        this.cilindrata = cilindrata;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                ", targa='" + targa + '\'' +
                ", cilindrata='" + cilindrata + '\'' +
                '}';
    }
}
