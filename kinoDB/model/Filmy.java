package Kino.model;

import Kino.controller.Controller;

import java.sql.SQLException;
import java.util.Scanner;

public class Filmy {

    Controller uc = new Controller();
    Scanner input = new Scanner(System.in);

    public Filmy() throws SQLException {

        System.out.println("***Witaj w module Filmy***");

        while (true){

            System.out.println("P-pokaż filmy, D-dodaj filmy, U-usuń film, Q-wyjście");
            String dec = input.nextLine().toUpperCase();

            if (dec.equals("P")){

                uc.showFilm();

            } else if (dec.equals("D")){
                System.out.println("Podaj nazwę filmu: ");
                String nazwaFilm = input.nextLine();
                uc.showKino();
                System.out.println("Podaj ID kina, gdzie ma być grany film:");
                int  idKino = input.nextInt();
                input.nextLine();
                uc.addFilm(nazwaFilm, idKino);
            }
            else if (dec.equals("U")){
                System.out.println("Podaj ID filmu do usunięcia: ");
                int id = input.nextInt();
                input.nextLine();
                uc.deleteFilm(id);
            }
            else if(dec.equals("Q")){
                break;
            }
        }
    }
}
