package org.example;

import java.io.*;

public class IplCsvAnalyzer {

    public static void processCsv() throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("ipl.csv"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("ipl_censored.csv"));

        String header = br.readLine();
        bw.write(header);
        bw.newLine();

        String line;
        while ((line = br.readLine()) != null) {

            String[] data = line.split(",");

            data[1] = CensorUtil.maskTeam(data[1]);
            data[2] = CensorUtil.maskTeam(data[2]);
            data[6] = CensorUtil.redactPlayer();

            bw.write(String.join(",", data));
            bw.newLine();
        }

        br.close();
        bw.close();

        System.out.println("Censored CSV generated");
    }
}
