package day1.exceptions;

public class Ksztalt {

    private int a;
    private int b;
    private String shape;

    public Ksztalt(String shape) {
        this.shape = shape;
    }

    public double pobierzPole() {
        if(shape.equalsIgnoreCase("prostokat")) {
            return a * b;
        }
        if(shape.equalsIgnoreCase("kolo")) {
            return (Math.PI * Math.pow(a, 2));
        }
        if(shape.equalsIgnoreCase("trojkat")) {
            return (0.5 * a * b);
        }
        throw new IllegalArgumentException("zla figura " + shape );
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
}
