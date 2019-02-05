package KinoZadanieDomowe;

public class KinoUzytkownika extends Tydzien {

    String kinoUzytkownika;

    public KinoUzytkownika(String wybranyDzien, String kinoUzytkownika) {
        super(wybranyDzien);
        setKinoUzytkownika(kinoUzytkownika);
    }


    public String getKinoUzytkownika() {
        return kinoUzytkownika;
    }

    public void setKinoUzytkownika(String kinoUzytkownika) {
        this.kinoUzytkownika = kinoUzytkownika;
    }

    @Override
    public String toString() {
        return getKinoUzytkownika();
    }
}
