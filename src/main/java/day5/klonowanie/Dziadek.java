package day5.klonowanie;

public class Dziadek implements Cloneable {
    private int id;
    private String name;

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    private Adres adres;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dziadek(Dziadek d) {
        this.id = d.getId();
        this.name = d.getName();
        this.adres = new Adres(d.getAdres());
    }

    public Dziadek() {
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Dziadek o = (Dziadek) super.clone();
        o.adres = (Adres) adres.clone();
        return o;
    }

    @Override
    public String toString() {
        return "Dziadek{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", adres=" + adres +
                '}';
    }
}
