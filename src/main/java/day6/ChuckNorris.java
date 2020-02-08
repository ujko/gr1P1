package day6;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ChuckNorris {
    public static void main(String[] args) throws IOException {
        pobierzCzaka();
    }

    public static void pobierzCzaka() throws IOException {
        String strona = "https://api.chucknorris.io/jokes/random";
        URL url = new URL(strona);

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.connect();
        InputStream input = connection.getInputStream();
        Scanner scan = new Scanner(input);
        //while (scan.hasNext()) {
        String[] zdanie = scan.nextLine().split(("value\"\\:"));
        String kawal = zdanie[zdanie.length - 1].replace("}", "");
        System.out.println(kawal);
        //}
        connection.disconnect();
        //URL
        //HTTPUrl
    }
}
