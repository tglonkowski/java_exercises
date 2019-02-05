package KinoZadanieDomowe;

import java.util.ArrayList;
import java.util.Scanner;

public class DzienTygodnia {

    Scanner input = new Scanner(System.in);

    String dzienTygodnia;

    ArrayList<Film> listaFilmow = new ArrayList<>();

    public DzienTygodnia(String dzienTygodnia) {
        setDzienTygodnia(dzienTygodnia);
    }

    public String getDzienTygodnia() {
        return dzienTygodnia;
    }

    public void setDzienTygodnia(String dzienTygodnia) {
        this.dzienTygodnia = dzienTygodnia;
    }

    public void addFilm(){

        System.out.println("Podaj nazwę filmu: ");
        String nazwaFilmu = input.nextLine();

        Film film = new Film(nazwaFilmu);

        listaFilmow.add(film);

    }

    public ArrayList<Film> getListaFilmow() {
        return listaFilmow;
    }


    @Override
    public String toString() {
        return getDzienTygodnia() + "\n" + getListaFilmow();
    }
}
