package day2.refleksje;
public class Adnotacje {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void method1() {
        System.out.println("wywolanie metody 1");
    }

    @MojaAdnotacja(name = "dom")
    public void method2() {
        System.out.println("wywolanie metody 2 " + name);
    }

    public void method3() {
        System.out.println("wywolanie metody 3");
    }

    @MojaAdnotacja(name = "domek")
    public void method4() {
        System.out.println("wywolanie metody 4 " + name);
    }
}
