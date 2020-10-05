package com.alisarrian._8kyu;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class NthSeries {
    public static String seriesSum(int n) {
        if (n == 1) {
            return "1.00";
        }
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum =  sum + 1.0 / (1.0 + i * 3);
        }
        return format(sum);
    }

    private static String format(double num) {
        DecimalFormatSymbols decimalSymbols = DecimalFormatSymbols.getInstance();
        decimalSymbols.setDecimalSeparator('.');
        return new DecimalFormat("0.00", decimalSymbols).format(num);
    }
}
