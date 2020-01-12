package day1.dziedziczenieEnum;

public class Ksztalt {

    private int a;
    private int b;
    private Shape shape;

    public Ksztalt(Shape shape) {
        this.shape = shape;
    }

    public double pobierzPole() {
        if(shape == Shape.PROSTOKAT) {
            return a * b;
        }
        if(shape == Shape.KOLO) {
            return (Math.PI * Math.pow(a, 2));
        }
        if(shape == Shape.TROJKAT) {
            return (0.5 * a * b);
        }
        return -1;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
}
