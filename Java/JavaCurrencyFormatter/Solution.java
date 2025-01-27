package JavaCurrencyFormatter;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double result = scanner.nextDouble();

        scanner.close();

        String ResultUs = NumberFormat.getCurrencyInstance(Locale.US).format(result);
        String ResultIndia = NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(result);
        String ResultChina = NumberFormat.getCurrencyInstance(Locale.CHINA).format(result);
        String ResultFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(result);

        System.out.println("US: " + ResultUs);
        System.out.println("India: " + ResultIndia);
        System.out.println("China: " + ResultChina);
        System.out.println("France: " + ResultFrance);
    }
}
