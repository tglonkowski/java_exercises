package energyDrink;

import java.util.ArrayList;

public class Koszyk {

    ArrayList<String> energetykiKlienta = new ArrayList<>();
    ArrayList<Integer> ilosc = new ArrayList<>();

    public void addKoszyk(String wybranyEnergetyk, int wybranaIlosc){
        this.energetykiKlienta.add(wybranyEnergetyk);
        this.ilosc.add(wybranaIlosc);
    }

}

