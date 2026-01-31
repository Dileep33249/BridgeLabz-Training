package com.streamapi;
import java.util.*;

public class StockPriceLogger {
    public static void main(String[] args) {

        List<Double> stockPrices = Arrays.asList(
                1023.50, 1018.75, 1031.20, 1009.40
        );

        System.out.println("Live Stock Prices:");
        stockPrices.forEach(price -> System.out.println(price));
    }
}
