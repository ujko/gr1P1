package day2.watki;

public class Cyfry implements Runnable {
    boolean check = true;

    public void setCheck(boolean check) {
        this.check = check;
    }

    @Override
    public void run() {
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
}

