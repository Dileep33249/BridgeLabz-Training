package org.example;

public class AssignmentRunner {
    public static void main(String[] args) throws Exception {
        CarToJson.convertCarToJson();
        ReadJson.readSpecificFields();
        MergeJson.mergeJsonObjects();
        JsonValidation.validateJson();
        CsvToJson.convertCsvToJson();
        JsonToXml.convertJsonToXml();
    }
}
