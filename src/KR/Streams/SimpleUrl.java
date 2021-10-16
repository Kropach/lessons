package KR.Streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class SimpleUrl {
    public static void main(String[] args) throws MalformedURLException {
//        URL nbuAPI = new URL("http://www.cbr.ru/scripts/XML_daily.asp");
        URL nbuAPI = new URL("");

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(nbuAPI.openStream()));
            String str;
            while ((str = br.readLine()) != null)
                System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
