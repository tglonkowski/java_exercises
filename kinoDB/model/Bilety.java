package Kino.model;

import Kino.controller.Controller;

import java.sql.SQLException;
import java.util.Scanner;

public class Bilety {

    Controller uc = new Controller();
    Scanner input = new Scanner(System.in);

    public Bilety() throws SQLException {

        System.out.println("***Witaj w module Bilety***");

        while (true){

            System.out.println("K-kup bilet, P-pokaż bilety, U-usuń bilet, Q-wyjście");
            String dec = input.nextLine().toUpperCase();

            if (dec.equals("K")){
                uc.showFilm();
                System.out.println("Wybierz ID filmu: ");
                int idFilm = input.nextInt();
                input.nextLine();
                System.out.println("Podaj ilość biletów: ");
                int iloscBilet = input.nextInt();
                input.nextLine();
                uc.addBilet(idFilm, iloscBilet);
            }
            else if (dec.equals("P")){
                uc.showBilet();
            }
            else if (dec.equals("U")){
                System.out.println("Podaj id biletu do usunięcia: ");
                int idBilet = input.nextInt();
                input.nextLine();
                uc.deleteBilet(idBilet);
            }
            else if (dec.equals("Q")){
                break;
            }
        }

    }
}
