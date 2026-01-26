package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonValidation {
    public static void validateJson() {

        ObjectMapper mapper = new ObjectMapper();
        String json = "{ \"name\": \"Amit\", \"age\": 25 }";

        try {
            mapper.readTree(json);
            System.out.println("JSON Validation: Valid JSON");
        } catch (Exception e) {
            System.out.println("JSON Validation: Invalid JSON");
        }
    }
}
