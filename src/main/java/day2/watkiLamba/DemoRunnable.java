package day2.watkiLamba;

public class DemoRunnable {
    static boolean check = true;

    public static void cyfryMetoda() {
        try {
            for (int i = 0; i <= 25; i++) {
                if (!check) {
                    break;
                }
                System.out.print(i);
                i %= 25;
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("jestem w liczbach");
        }
    }

    public static void litery() {
        char a = 'a';
        int i = 0;
        try {
            while (check) {
                System.out.print((char) (a + i));
                i++;
                i %= 25;
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("przerwalem watek jestem w literach");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(DemoRunnable::cyfryMetoda);
        Thread t2 = new Thread(() -> System.out.println("abc") );
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                litery();
            }
        });


        t1.start();
        t2.start();
        t3.start();
        Thread.sleep(5000);
        check = false;
        System.out.println("watek glowny zatrzymany");
    }

}
