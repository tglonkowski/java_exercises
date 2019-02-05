package energyDrink;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SklepController {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Koszyk> listaKoszykow = new ArrayList<>();

        HashMap<Integer, String> energetyki = new HashMap<>();

        energetyki.put(1 , "RedBull");
        energetyki.put(2, "Tiger");
        energetyki.put(3 , "Black");
        energetyki.put(4 , "MonsterEnergy");

        System.out.println("****Witamy w sklepie****");

        while (true) {

            System.out.println("Czy chcesz rozpocząć zakupy? T/N");
            String dec = input.nextLine().toUpperCase();

            if (dec.equals("T")) {

                Koszyk koszyk = new Koszyk();

                while (true) {

                    System.out.println("Czy chcesz wybrać energetyk? T/N");
                    String decE = input.nextLine().toUpperCase();

                    if (decE.equals("T")) {

                        for (int i = 1; i < 5; i++) {
                            System.out.println(i + " " + energetyki.get(i));
                        }
                            System.out.println("Podaj numer energetyka:");
                            int decEC = input.nextInt();
                            input.nextLine();
                            System.out.println("Podaj ilość: ");
                            int ilosc = input.nextInt();
                            input.nextLine();

                        if (1 == decEC) {
                            koszyk.addKoszyk(energetyki.get(decEC), ilosc);

                        } else if (2 == decEC) {
                            koszyk.addKoszyk(energetyki.get(decEC), ilosc);

                        } else if (3 == decEC) {
                            koszyk.addKoszyk(energetyki.get(decEC), ilosc);

                        } else {
                            koszyk.addKoszyk(energetyki.get(decEC), ilosc);
                        }

                    } else {
                        listaKoszykow.add(koszyk);
                        break;
                    }
                }
            } else
                break;
        }

        int klient = 1;
        for (Koszyk koszyk: listaKoszykow
             ) {
            System.out.println();
            System.out.println("Klient nr. " + klient++);
            System.out.println("Kupił:");

            int suma = 0;
            for (int i = 0; i < koszyk.energetykiKlienta.size(); i++) {

                System.out.println("Energetyk: " + koszyk.energetykiKlienta.get(i) + "\nIlość: " + koszyk.ilosc.get(i));
                suma += koszyk.ilosc.get(i);

            }
            System.out.println("Łącznie kupiłeś: " + suma + " energetyków.");
            if (suma > 5)
                System.out.println("Spożycie takiej ilości w\n" +
                        "krótkim czasie może wpłynąć negatywnie na Twoje zdrowie!!!");
        }
    }
}



