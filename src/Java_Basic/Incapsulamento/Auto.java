package Java_Basic.Incapsulamento;
/*
Scrivere un programma che contenga una classe che definisce un'Auto che abbia come proprietà cilindrata, targa, marca e modello.
Per questa classe saranno necessari i metodi accessori (getter e setter) ed un costruttore.
Nel principale dichiarare un oggetto di tipo Auto.
In questo caso la nota importante è rendere le proprietà della classe auto accessibili solo attraverso i metodi.
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public String getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(String cilindrata) {
        this.cilindrata = cilindrata;
    }
}
