package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class MergeJson {
    public static void mergeJsonObjects() {

        ObjectMapper mapper = new ObjectMapper();

        ObjectNode json1 = mapper.createObjectNode();
        json1.put("name", "Dileep");

        ObjectNode json2 = mapper.createObjectNode();
        json2.put("email", "dileep@gmail.com");

        json1.setAll(json2);

        System.out.println("Merged JSON:");
        System.out.println(json1.toPrettyString());
    }
}
