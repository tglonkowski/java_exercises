package M2;

import java.util.ArrayList;
import java.util.Scanner;

public class MieszkanieController extends ListaPomieszczen {


    public MieszkanieController(){

        Scanner input = new Scanner(System.in);
        System.out.println("Rozpoczęcie programu M2");
        System.out.println();

        while (true){

            System.out.println("Czy chcesz dodać nowe mieszkanie? T/N");
            String decM = input.nextLine().toUpperCase();

            if (decM.equals("T")) {
                ListaPomieszczen mieszkanie = new ListaPomieszczen();
                listaMieszkan.add(mieszkanie);

                while (true){
                System.out.println("Czy chcesz dodać nowy pokój? T/N");
                String dec = input.nextLine().toUpperCase();

                    if (dec.equals("T")) {
                        mieszkanie.addPomieszczenie();

                    }else
                        break;
                }
            }else
                break;

        }

        int nrMieszkania = 1;

        for (ListaPomieszczen mieszkanie : listaMieszkan
             ) {
            System.out.println();
            System.out.println("Mieszkanie nr." + nrMieszkania++);
            System.out.println("Posiada następujęce pomieszczenia: ");
            double suma = 0;

            for (int i = 0; i < mieszkanie.listaPomieszczen.size() ; i++) {

                System.out.println(mieszkanie.listaPomieszczen.get(i));
                suma += mieszkanie.wielkosciPomiesczen.get(i);
            }
            System.out.println("Wielkość mieszkania to: " + suma + "m2,");

        }
    }
}
