package KinoZadanieDomowe;

public class Film {

    String nazwaSeansu;

    public Film(String nazwaSeansu){
        setNazwaSeansu(nazwaSeansu);
    }

    public String getNazwaSeansu() {
        return nazwaSeansu;
    }

    public void setNazwaSeansu(String nazwaSeansu) {
        this.nazwaSeansu = nazwaSeansu;
    }


    @Override
    public String toString() {
        return getNazwaSeansu();
    }
}
