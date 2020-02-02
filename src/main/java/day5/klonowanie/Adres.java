package day5.klonowanie;

public class Adres implements Cloneable {
    private String ulica;
    private int nrUlicy;

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public int getNrUlicy() {
        return nrUlicy;
    }

    public void setNrUlicy(int nrUlicy) {
        this.nrUlicy = nrUlicy;
    }

    public Adres(Adres a) {
        this.ulica = a.getUlica();
        this.nrUlicy = a.getNrUlicy();
    }

    public Adres() {
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Adres{" +
                "ulica='" + ulica + '\'' +
                ", nrUlicy=" + nrUlicy +
                '}';
    }
}
