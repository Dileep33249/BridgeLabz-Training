package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class ReadJson {
    public static void readSpecificFields() throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        JsonNode node = mapper.readTree(new File("user.json"));

        System.out.println("Extracted Fields:");
        System.out.println("Name  : " + node.get("name").asText());
        System.out.println("Email : " + node.get("email").asText());
    }
}
