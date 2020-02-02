package day5.kolejki;

public class Main {
    public static void main(String[] args) {
//        Fifo fif = new Fifo();
        Kolejka fif = new Lifo();
       // fif.peek();
//        fif.push(1);
//        fif.push(2);
//        fif.push(3);
//        fif.push(3);
//        fif.push(3);
//        fif.push(3);

        for(int i =1; i<=5; i++){
            fif.push(i);
        }


        fif.display();

        System.out.println();
        System.out.println(fif.pop());
        System.out.println(fif.pop());
        fif.display();
//        for(int i =100; i<=110; i++){
//            fif.pushPriority(i);
//        }
        System.out.println();
        fif.display();
        System.out.println();
        fif.peek();

    }
}
