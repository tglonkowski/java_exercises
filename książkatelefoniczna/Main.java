package KsiążkaTelefoniczna;

import KsiążkaTelefoniczna.controller.Controller;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws SQLException {

        Scanner input = new Scanner(System.in);
        Controller uc = new Controller();

        while (true){

            System.out.println("P-pokaż, D-dodaj, U-usuń, M-modyfikuj, S-szukaj, K-koniec");
            String dec = input.nextLine().toUpperCase();

            if (dec.equals("D")){

                System.out.println("Podaj imię: ");
                String imie = input.nextLine();
                System.out.println("Podaj nazwisko: ");
                String nazwisko = input.nextLine();
                System.out.println("Podaj telefon: ");
                String telefon = input.nextLine();

                uc.add(imie, nazwisko, telefon);

            } else if (dec.equals("P")){
                System.out.println("Lista kontaktów: ");
                uc.show();

            }
            else if(dec.equals("U")){
                System.out.println("Podaj ID do usunięcia: ");
                int id = input.nextInt();
                input.nextLine();
                uc.delete(id);
            }
            else if (dec.equals("M")){
                System.out.println("Podaj ID do zmiany: ");
                int id = input.nextInt();
                input.nextLine();

                System.out.println("Podaj kolumnę z bazy danych, w której będą modyfikowane dane: ");
                String kolumna = input.nextLine();
                System.out.println("Podaj nową wartość: ");
                String wartosc = input.nextLine();

                uc.edit(id, kolumna, wartosc);
            }
            else if (dec.equals("S")){
                System.out.println("Wyszukaj: ");
                String wartosc = input.nextLine();
                uc.search(wartosc);

            }
        }
    }
}
