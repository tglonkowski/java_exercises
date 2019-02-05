package ProgramSzkoleniowy;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgramSzkoleniowyController{

    Scanner input = new Scanner(System.in);

    ArrayList<Szkolenie> listaSzkolen = new ArrayList<>();

    public ProgramSzkoleniowyController(){
 
        while (true){

            System.out.println("Czy chcesz dodać nowe szkolenie? T/N");
            String dec = input.nextLine().toUpperCase();

            if (dec.equals("T")){

                System.out.println("Podaj nazwę szkolenia: ");
                String nazwaSzkolenia = input.nextLine();
                System.out.println("Podaj wykładowcę szkolenia: ");
                String wykladowca = input.nextLine();

                Szkolenie szkolenie = new Szkolenie(nazwaSzkolenia, wykladowca);

                listaSzkolen.add(szkolenie);

                while (true){

                    System.out.println("Czy chcesz dodać uczestnika? T/N");
                    String decU = input.nextLine().toUpperCase();

                    if ( decU.equals("T"))
                        szkolenie.addUczestnik();
                    else
                        break;
                }
            } else
                break;
        }

        int numerSzkolenia = 1;
        for (Szkolenie szkolenie: listaSzkolen
             ) {
            System.out.println();
            System.out.println("Szkolenie numer: " + numerSzkolenia++);
            System.out.println(szkolenie);

            System.out.println("|      Uczestnicy      |");
            for (int i = 0; i < szkolenie.listaUczestnicy.size() ; i++) {

                System.out.println(szkolenie.listaUczestnicy.get(i));

                }
            }
        }
}


