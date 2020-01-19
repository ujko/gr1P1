package day3.andOrExample;

public class TestAndOr {

    public static void main(String[] args) {
        doSth(null);
    }

    private static void doSth(String txt) {
        if(txt != null && !txt.equals("")) {
            System.out.println("txt");
        } else {
            System.out.println("nieprawidlowy parametr");
        }
    }
}
