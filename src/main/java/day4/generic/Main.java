package day4.generic;

public class Main {
    public static void main(String[] args) {
        NaszaLista<Osoba> n = new NaszaLista<>();
        n.addO(new Osoba(1,"Tomek"));
        n.addO(new Osoba(2,"Pawel"));
        System.out.println(n.getO(0));

//        NaszaLista<Double> doubleNaszaLista = new NaszaLista<>();
//        doubleNaszaLista.addO(2.33);
//        System.out.println(doubleNaszaLista.getO(0));
//        NaszaLista nl = new NaszaLista();
//        nl.addO(new Osoba(1,"Tomek"));
//        nl.addO(new Osoba(2,"Pawel"));
//
//        Osoba o = (Osoba)nl.getO(1);
//        System.out.println(o);
    }
}
