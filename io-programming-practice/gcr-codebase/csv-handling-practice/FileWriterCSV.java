package filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterCSV {

    public static void main(String[] args) {

        String filePath = "D:/students.csv";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {

            bw.write("ID,Name,Department,Salary");
            bw.newLine();
            bw.write("101,Rahul Sharma,IT,65000");
            bw.newLine();
            bw.write("102,Anita Verma,HR,48000");
            bw.newLine();
            bw.write("103,Suresh Kumar,Finance,72000");
            bw.newLine();
            bw.write("104,Priya Singh,Marketing,55000");
            bw.newLine();
            bw.write("105,Amit Patel,Operations,60000");

            System.out.println("CSV file written successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
