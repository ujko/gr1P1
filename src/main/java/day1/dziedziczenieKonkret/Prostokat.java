package day1.dziedziczenieKonkret;

public class Prostokat extends Ksztalt {
    public Prostokat() {
        super("prostokat");
    }

    @Override
    public double pobierzPole() {
        return a * b;
    }
}
