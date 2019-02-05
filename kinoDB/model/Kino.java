package Kino.model;

import Kino.controller.Controller;

import java.sql.SQLException;
import java.util.Scanner;

public class Kino {

    Controller uc = new Controller();
    Scanner input = new Scanner(System.in);

    public Kino() throws SQLException {

        System.out.println("***Witaj w module Kino***");

        while (true){

            System.out.println("P-pokaż kino, D-dodaj kino, U-usuń kino, Q-wyjście");
            String dec = input.nextLine().toUpperCase();

            if (dec.equals("P")){

                uc.showKino();
            }
            else if (dec.equals("D")){
                System.out.println("Podaj nazwę kina: ");
                String nazwa = input.nextLine();
                uc.addKino(nazwa);

            }
            else if (dec.equals("U")){
                System.out.println("Podaj ID kina: ");
                int id = input.nextInt();
                input.nextLine();
                uc.deleteKino(id);
            }else if (dec.equals("Q")){
                break;
            }

        }
    }
}
