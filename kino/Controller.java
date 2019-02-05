package KinoZadanieDomowe;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller{


    public Controller() {

        Scanner input = new Scanner(System.in);

        ArrayList<KinoUzytkownika> listaKin = new ArrayList<>();

        while (true) {

            System.out.println("Czy chcesz rozpocząć? T/N");
            String dec = input.nextLine().toUpperCase();

            if (dec.equals("T")) {

                System.out.println("Wprowadź nazwę kina: ");
                String nazwaKina = input.nextLine();

                KinoUzytkownika kinoUzytkownika = new KinoUzytkownika(dec, nazwaKina);

                listaKin.add(kinoUzytkownika);

                while (true) {

                    System.out.println("Czy chcesz dodać nowy dzień tygodnia? T/N");
                    String decD = input.nextLine().toUpperCase();

                    if (decD.equals("T")) {

                        kinoUzytkownika.addDzienTygodnia();

                    } else
                        break;
                }
            } else
                break;
        }

        int numerKina = 1;
        for (KinoUzytkownika kinoUzytkownika : listaKin) {
            System.out.println();
            System.out.println("Kino nr. " + numerKina++);
            System.out.println(kinoUzytkownika);
            System.out.println("Repertuar na kolejne dni: ");

            for (int i = 0; i < kinoUzytkownika.tydzien.size(); i++) {

                System.out.println(kinoUzytkownika.tydzien.get(i));
                }
            }
        }
}

