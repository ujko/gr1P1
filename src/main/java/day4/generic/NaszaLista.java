package day4.generic;

import java.util.Arrays;

public class NaszaLista<T extends Czlowiek> {
    Czlowiek[] t = new Czlowiek[0];

    public T getO(int i) {
        return (T) t[i];
    }

    public void addO(T o) {
        o.wypisz();
        t = Arrays.copyOf(t, t.length + 1);
        t[t.length - 1] = o;
    }


//    Object[] t = new Object[0];
//
//    public T getO(int i) {
//        return (T) t[i];
//    }
//
//    public void addO(T o) {
//        t = Arrays.copyOf(t, t.length + 1);
//        t[t.length - 1] = o;
//    }


    //    Object[] objects = new Object[0];
//
//    public Object getO(int i) {
//        return objects[i];
//    }
//
//    public void addO(Object o) {
//        objects = Arrays.copyOf(objects, objects.length + 1);
//        objects[objects.length - 1] = o;
//    }

}
