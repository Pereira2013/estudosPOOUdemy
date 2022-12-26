package exerciciosOO.util;

public class CurrencyConverter {
    public static double priceDollar;
    public static double amountDollar;

    public static double converter(double priceDollar, double amountDollar) {
        double iof = amountDollar * priceDollar * 6 /100;
        return amountDollar * priceDollar + iof;
    }

}
