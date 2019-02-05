package Kino;

import Kino.model.Bilety;
import Kino.model.Filmy;
import Kino.model.Kino;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException {

        Scanner input = new Scanner(System.in);

        boolean program = true;

        while (program){

            System.out.println("K-zarządzaj kinami, F-zarządzaj filmami, B-kup bilet, Q-wyjście");
            String dec = input.nextLine();

            switch (dec.toUpperCase()){
                case "K":

                    Kino kino = new Kino();

                    break;
                case "F":

                    Filmy filmy = new Filmy();

                    break;

                case "B":

                    Bilety bilety = new Bilety();

                    break;

                case "Q":
                    System.out.println("Dziękujemy za skorzystanie z systemu.");
                    program = false;
                    break;
            }

        }

    }
}
