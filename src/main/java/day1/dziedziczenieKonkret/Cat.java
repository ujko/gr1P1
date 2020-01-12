package day1.dziedziczenieKonkret;

public class Cat extends Animal{
    public Cat() {
        super();
        System.out.println("Konstruktor klasy Cat");
    }

    @Override
    public void wypisz() {
        System.out.println("wypisz z klasy Cat");
    }

    public void wypiszCat() {
        System.out.println("wypiszCat z klasy Cat");
    }
}
