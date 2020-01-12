package day1.date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DataICzas {

    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);

        LocalDate d2 = LocalDate.now();
        System.out.println(d2);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy;MMMM;dd");
        System.out.println(d2.format(dtf));

    }
}
