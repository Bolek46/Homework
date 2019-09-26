import java.util.Comparator;

public class Samochody implements Comparable<Samochody> {

    private String marka;
    private String model;
    private int ile_drzwi;
    private boolean klimatyzacja;
    private int przebieg;
    private float cena;
    private String kolor;

    public Samochody(String marka, String model, int ile_drzwi, boolean klimatyzacja, int przebieg, float cena, String kolor) {
        this.marka = marka;
        this.model = model;
        this.ile_drzwi = ile_drzwi;
        this.klimatyzacja = klimatyzacja;
        this.przebieg = przebieg;
        this.cena = cena;
        this.kolor = kolor;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setIle_drzwi(int ile_drzwi) {
        this.ile_drzwi = ile_drzwi;
    }

    public void setKlimatyzacja(boolean klimatyzacja) {
        this.klimatyzacja = klimatyzacja;
    }

    public void setPrzebieg(int przebieg) {
        this.przebieg = przebieg;
    }

    public void setCena(float cena) {
        this.cena = cena;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getIle_drzwi() {
        return ile_drzwi;
    }

    public boolean isKlimatyzacja() {
        return klimatyzacja;
    }

    public int getPrzebieg() {
        return przebieg;
    }

    public float getCena() {
        return cena;
    }

    public String getKolor() {
        return kolor;
    }

    @Override
    public String toString() {
        return "Samochody{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", ile_drzwi=" + ile_drzwi +
                ", klimatyzacja=" + klimatyzacja +
                ", przebieg=" + przebieg +
                ", cena=" + cena +
                ", kolor='" + kolor + '\'' +
                '}';
    }

    //Metoda umożliwiająca sortowanie po cenie
    @Override
    public int compareTo(Samochody S){
        float compareCena=((Samochody) S).getCena();
        return (int)(compareCena-this.cena);
    }

}
