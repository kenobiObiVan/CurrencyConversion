import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

    static ArrayList<String> table = new ArrayList<>();
    static String[] result = new String[]{};

    //получаем таблицу
    public static void getTableFromSite() throws IOException {
        Document page = Jsoup.connect("https://www.cbr.ru/currency_base/daily/").get();
        Element currencyTable = page.select("table[class=data]").first();
        Elements currency = currencyTable.select("tr");

        table = new ArrayList<>();

        for (int i = 0; i < currency.size(); i++) {
            Element lineTable = currency.get(i);
            table.add(lineTable.text());
        }
    }

    public static void main(String[] args) throws Exception {
        String currencyCode;
        double sum;

        Scanner scanner = new Scanner(System.in);

        //использование таблицы из кэша
        if (table == null || table.size() == 0) {
            getTableFromSite();


            do {
                System.out.print("Введите один из указанных кодов валюты или x чтобы выйти: ");
                currencyCode = scanner.next();

                if (currencyCode.equals("x")) {
                    return;
                }

                for (int i = 0; i < table.size(); i++) {
                    if (table.get(i).indexOf(currencyCode) > -1) {
                        result = table.get(i).split(" ");
                    }
                }
                if (result.length == 0) {
                    System.out.println("Что-то пошло не так");
                } else {
                    double rate = Double.parseDouble(result[result.length - 1].replace(',', '.'));
                    int unit = Integer.parseInt(result[2]);
                    System.out.printf("Введите сумму в указанной валюте: ");
                    sum = scanner.nextDouble();
                    System.out.println("Результат: " + Math.round(sum * rate / unit * 100) / 100.0);
                }
            } while (true);
        }
    }
}
