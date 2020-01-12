package day1.dziedziczenieKonkret;

public class Trojkat extends Ksztalt {
    public Trojkat() {
        super("Trojkat");
    }

    @Override
    public double pobierzPole() {
        return (0.5 * a * b);
    }
}
