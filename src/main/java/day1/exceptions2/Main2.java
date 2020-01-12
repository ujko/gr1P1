package day1.exceptions2;

public class Main2 {

    private void doSth2() {
        boolean a = true;
        while (a) {
            System.out.println("cos");
        }
        System.out.println("program");
    }

    private void doSth() {
        try{
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            System.out.println("Illegalargument exception");
        }catch (Exception e) {
            System.out.println("Exception");

        }
    }
}
