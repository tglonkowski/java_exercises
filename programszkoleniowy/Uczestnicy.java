package ProgramSzkoleniowy;

import java.util.ArrayList;
import java.util.Scanner;

public class Uczestnicy {

    Scanner input = new Scanner(System.in);

    ArrayList<Uczestnik> listaUczestnicy = new ArrayList<>();

    public void addUczestnik() {

        System.out.println("Podaj imię uczestnika: ");
        String imie = input.nextLine();
        System.out.println("Podaj nazwisko uczestnika: ");
        String nazwisko = input.nextLine();

        Uczestnik uczestnik = new Uczestnik(imie, nazwisko);

        listaUczestnicy.add(uczestnik);

    }

    public void setListaUczestnicy(ArrayList<Uczestnik> listaUczestnicy) {
        this.listaUczestnicy = listaUczestnicy;
    }



}

