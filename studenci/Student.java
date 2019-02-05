package J29;

public class Student {

    private String imie;
    private String nazwisko;
    private int index;
    public static int count = 0;

    public Student(String imie, String nazwisko, int indeks) {
        setImie(imie);
        setNazwisko(nazwisko);
        setIndex(indeks);
    }

    @Override
    public String toString() {
        return "Student{" +
                "imie='" + getImie() + '\'' +
                ", nazwisko='" + getNazwisko() + '\'' +
                ", index=" + getIndex() +
                '}';
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
