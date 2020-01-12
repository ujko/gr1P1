package day1.klasyStatyczne;

public class Main {

    public static void main(String[] args) {
        new Bloki();
//        new Main().doSth();

//        Zwierze z = new Zwierze();
//        Zwierze.Kot k = z.new Kot();
//
//        Zwierze.Pies p = new Zwierze.Pies();

    }

    public void doSth() {
        class K {
            int a;
            public void doSth() {
                System.out.println(a);
            }
        }
        K k = new K();
        k.a = 34;
        k.doSth();
    }

}
