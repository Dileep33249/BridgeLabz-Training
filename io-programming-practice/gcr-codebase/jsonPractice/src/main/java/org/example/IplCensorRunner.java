package org.example;

public class IplCensorRunner {
    public static void main(String[] args) throws Exception {

        IplJsonAnalyzer.processJson();
        IplCsvAnalyzer.processCsv();

        System.out.println("IPL Censor Analysis Completed");
    }
}
