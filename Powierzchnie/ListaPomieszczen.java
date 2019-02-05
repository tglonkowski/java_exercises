package M2;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaPomieszczen extends Mieszkanie {

    Scanner input = new Scanner(System.in);

    double wielkoscPomieszczenia;

    ArrayList<Pomieszczenie> listaPomieszczen = new ArrayList<>();
    ArrayList<Double> wielkosciPomiesczen = new ArrayList<>();


    public void addPomieszczenie(){

        System.out.println("Podaj nazwę pomieszczenia: ");
        String nazwaPomieszczenia = input.nextLine();
        System.out.println("Podaj długość pomieszczenia: ");
        double dlugoscPomieszczenia = input.nextDouble();
        input.nextLine();
        System.out.println("Podaj szerokość pomieszczenia: ");
        double wybranaSzerokosc = input.nextDouble();
        input.nextLine();

        Pomieszczenie pomieszczenie = new Pomieszczenie(nazwaPomieszczenia,dlugoscPomieszczenia,wybranaSzerokosc);
        wielkoscPomieszczenia = pomieszczenie.getDlugoscPomieszczenia() * pomieszczenie.getSzerokoscPomieszczenia();
        wielkosciPomiesczen.add(wielkoscPomieszczenia);
        listaPomieszczen.add(pomieszczenie);
    }

}
