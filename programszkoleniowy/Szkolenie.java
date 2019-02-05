package ProgramSzkoleniowy;

public class Szkolenie extends Uczestnicy{

    String nazwaSzkolenia;
    String wykladowca;


    public Szkolenie(String nazwaSzkolenia, String wykladowca) {
        setNazwaSzkolenia(nazwaSzkolenia);
        setWykladowca(wykladowca);
    }

    public String getNazwaSzkolenia() {
        return nazwaSzkolenia;
    }

    public void setNazwaSzkolenia(String nazwaSzkolenia) {
        this.nazwaSzkolenia = nazwaSzkolenia;
    }

    public String getWykladowca() {
        return wykladowca;
    }

    public void setWykladowca(String wykladowca) {
        this.wykladowca = wykladowca;
    }

    @Override
    public String toString() {
        return "Nazwa szkolenia: " +  getNazwaSzkolenia() + "\nWykładowca: " +
                getWykladowca();
    }

}

