package day2.watki;

public class Litery implements Runnable {
    static boolean check = true;

    public void setCheck(boolean check) {
        this.check = check;
    }

    @Override
    public void run() {
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
            ;
        }
    }
}
