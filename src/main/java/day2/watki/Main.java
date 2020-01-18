package day2.watki;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Cyfry cy = new Cyfry();
        Thread t1 = new Thread(cy);
        Litery li = new Litery();
        Thread t2 = new Thread(li);
        t1.setDaemon(true);
        t2.setDaemon(true);
        t1.start();
        t2.start();
        Thread.sleep(5000);
        li.setCheck(false);
        cy.setCheck(false);



//        t2.interrupt();
//        t1.interrupt();
//        t2.join();
//        t1.join();
        System.out.println("koniec programu");

    }


}
