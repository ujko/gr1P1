package day1.dziedziczenieKonkret;

public class Kolo extends Ksztalt {
    public Kolo() {
        super("kolo");
    }

    @Override
    public double pobierzPole() {
        return (Math.PI * Math.pow(a, 2));
    }
}
