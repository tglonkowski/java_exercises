package KinoZadanieDomowe;



import java.util.ArrayList;
import java.util.Scanner;

public class Tydzien extends DzienTygodnia {

    Scanner input = new Scanner(System.in);

    ArrayList<DzienTygodnia> tydzien = new ArrayList<>();

    public Tydzien(String dzienTygodnia) {
        super(dzienTygodnia);
    }


    public void addDzienTygodnia() {

        System.out.println("Wybierz dzień tygodnia: ");
        String dzienTygodniaU = input.nextLine();

        DzienTygodnia dzienTygodnia = new DzienTygodnia(dzienTygodniaU);

        tydzien.add(dzienTygodnia);

        while (true) {
            System.out.println("Czy chcesz dodać nowy film? T/N");
            String decF = input.nextLine().toUpperCase();

            if (decF.equals("T")) {

                dzienTygodnia.addFilm();

            }else
                break;


        }
    }
}