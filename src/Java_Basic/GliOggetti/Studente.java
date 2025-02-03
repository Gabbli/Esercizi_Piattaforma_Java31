package Java_Basic.GliOggetti;
/*
Scrivere un programma che contenga una classe che definisce uno Studente che abbia come proprietà nome, cognome ed identificativo.
Per questa classe saranno necessari i metodi accessori (getter e setter) ed un costruttore.
Nel main dichiarare un oggetto di tipo Studente.
 */
public class Studente {
    String name;
    String surname;
    String identificativo;

    public Studente(String name, String surname, String identificativo) {
        this.name = name;
        this.surname = surname;
        this.identificativo = identificativo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getIdentificativo() {
        return identificativo;
    }

    public void setIdentificativo(String identificativo) {
        this.identificativo = identificativo;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", identificativo='" + identificativo + '\'' +
                '}';
    }
}
