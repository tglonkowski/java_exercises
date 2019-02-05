package ProgramSzkoleniowy;

public class Uczestnik {

    String imie;
    String nazwisko;


    // konstruktor klasy Uczestnik
    public Uczestnik(String imie, String nazwisko) {
        setImie(imie);
        setNazwisko(nazwisko);
    }

    //gettery i settery klasy
    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return  getImie() + " " + getNazwisko();
    }
}
