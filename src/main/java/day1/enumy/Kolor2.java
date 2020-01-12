package day1.enumy;

public class Kolor2 {
    private int red;
    private int green;
    private int blue;

    private Kolor2(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }
    public static final Kolor2 RED = new Kolor2(255,0,0);
    public static final Kolor2 BLUE = new Kolor2(0,0,255);
    public static final Kolor2 GREEN = new Kolor2(0,255,0);
    public static final Kolor2 BLACK = new Kolor2(0,0,0);

    @Override
    public String toString() {
        return "Kolor2{" +
                "red=" + red +
                ", green=" + green +
                ", blue=" + blue +
                '}';
    }
}
