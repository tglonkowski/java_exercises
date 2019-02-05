package M2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Pomieszczenie {

    String nazwaPomieszczenia;
    double dlugoscPomieszczenia;
    double szerokoscPomieszczenia;

    public Pomieszczenie(String wybranaNazwa, double wybranaDlugosc, double wybranaSzerokosc){
        setNazwaPomieszczenia(wybranaNazwa);
        setDlugoscPomieszczenia(wybranaDlugosc);
        setSzerokoscPomieszczenia(wybranaSzerokosc);
    }


    public String getNazwaPomieszczenia() {
        return nazwaPomieszczenia;
    }

    public void setNazwaPomieszczenia(String nazwaPomieszczenia) {
        this.nazwaPomieszczenia = nazwaPomieszczenia;
    }

    public double getDlugoscPomieszczenia() {
        return dlugoscPomieszczenia;
    }

    public void setDlugoscPomieszczenia(double dlusgoscPomieszczenia) {
        this.dlugoscPomieszczenia = dlusgoscPomieszczenia;
    }

    public double getSzerokoscPomieszczenia() {
        return szerokoscPomieszczenia;
    }

    public void setSzerokoscPomieszczenia(double szerokoscPomieszczenia) {
        this.szerokoscPomieszczenia = szerokoscPomieszczenia;
    }

    @Override
    public String toString() {
        return "Pomieszczenie: " + getNazwaPomieszczenia() + "\nDługość " + getDlugoscPomieszczenia()
                + "\nSzerokość: " + getSzerokoscPomieszczenia();
    }
}
