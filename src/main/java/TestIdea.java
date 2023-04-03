import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.StreamSupport;

public class TestIdea {
    public static final double DOLLAR_EXCHANGE_RATE = 76.54;
    public static final double EURO_EXCHANGE_RATE = 65.4;

    public static int [] dollarsList;
    public static double [] roublesList;

    public static int conversionCounter;
    public static int i;

/*    public static void main(String[] args) throws IOException {

        instruction();

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Введите корректное количество конвертаций: ");
            conversionCounter = scanner.nextInt();
        } while (conversionCounter <= 0);

        dollarsList = new int[conversionCounter];

        for (i = 0; i < dollarsList.length; i++) {
            System.out.print("Введите сумму в долларах: ");
            dollarsList[i] = scanner.nextInt();
        }
        roublesList = conversionToRoubles(dollarsList, DOLLAR_EXCHANGE_RATE);

        System.out.println("\n\t\t\tТАБЛИЦА КОНВЕРТАЦИИ\nДоллары, $" + "  " + "Рубли, руб");

        for (i = 0; i < dollarsList.length; i++) {
            System.out.println(dollarsList[i] + "\t\t\t" + (int) (roublesList[i] *100)/ 100.0);
        }


    }

    public static void instruction() {
        System.out.println("Данная программа позволяет пользователю ввести сумму в долларах " +
                "определенное количество раз, а затем конвертирует указанные суммы в российский рубль\n");
    }

    public static double[] conversionToRoubles(int [] dollarsList, double DOLLAR_EXCHANGE_RATE) {

        double [] roublesList = new double[conversionCounter];
        for (int i = 0; i < conversionCounter; i++) {
            roublesList[i] = dollarsList[i] * DOLLAR_EXCHANGE_RATE;
        } return roublesList;
    }

 */
}
