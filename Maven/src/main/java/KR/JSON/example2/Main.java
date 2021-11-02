package KR.JSON.example2;

import KR.JSON.example2.parser.GsonParser;

public class Main {
    public static void main(String[] args) {
        GsonParser.parseJson("https://api.privatbank.ua/p24api/pubinfo?json&exchange&coursid=5");
    }
}
