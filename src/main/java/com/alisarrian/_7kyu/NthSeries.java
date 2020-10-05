package com.alisarrian._7kyu;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.stream.IntStream;

public class NthSeries {
    public static String seriesSum(int n) {
        if (n == 1) {
            return "1.00";
        }
        double sum = IntStream.range(0, n)
                .mapToDouble(i -> 1.0 / (1.0 + i * 3))
                .sum();
        return format(sum);
    }

    private static String format(double num) {
        DecimalFormatSymbols decimalSymbols = DecimalFormatSymbols.getInstance();
        decimalSymbols.setDecimalSeparator('.');
        return new DecimalFormat("0.00", decimalSymbols).format(num);
    }
}
