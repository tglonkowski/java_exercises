package konwerterTemperatury;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Konwerter {

    public void konwersja() {

        System.out.println("#### Witaj w programie ####");

        while (true) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Podaj temperaturę w stopniach Celsjusza: ");

            try {

                double stopnieCelsjusza = sc.nextDouble();
                double stopnieFahrenheita = 1.80 * stopnieCelsjusza + 32.0;
                System.out.println(stopnieFahrenheita);


            } catch (InputMismatchException e) {
                System.out.println("Nie podałeś liczby!");

            }

            Scanner scFinally = new Scanner(System.in);
            System.out.println("Czy chcesz ponownie przeliczyć temperaturę? T/N");
            String odpowiedz = scFinally.next().toUpperCase();

            if (odpowiedz.equals("N")) {
                System.out.println("Koniec programu");
                break;
            }
        }
    }

    public static void main(String[] args) {

        Konwerter konwerter = new Konwerter();

        konwerter.konwersja();

    }
}
