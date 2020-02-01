package day4.generic;

public class Osoba implements Czlowiek{
    private int id;
    private String name;

    public Osoba(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void wypisz() {
        System.out.println(toString());
    }
}
