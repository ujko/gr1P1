package day1.dziedziczenieKonkret;

public abstract class Ksztalt {

    protected int a;
    protected int b;
    private String nazwa;

    public Ksztalt(String nazwa) {
        this.nazwa = nazwa;
    }

    public abstract double pobierzPole();

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getNazwa() {
        return nazwa;
    }
}
