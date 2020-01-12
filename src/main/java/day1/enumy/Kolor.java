package day1.enumy;

public enum Kolor {
    RED(255,0,0),
    GREEN(0,255,0),
    BLUE(0,0,255),
    WHITE(255,255,255),
    BLACK(0,0,0);

    private int red;
    private int green;
    private int blue;

    Kolor(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    public void wypisz() {
        System.out.println(
        "wypisuje {" +
                "red=" + red +
                ", green=" + green +
                ", blue=" + blue +
                '}'
        );
    }

    @Override
    public String toString() {
        return "Kolor{" +
                "red=" + red +
                ", green=" + green +
                ", blue=" + blue +
                '}';
    }
}
