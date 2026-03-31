package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;

public class JsonToXml {

    public static void convertJsonToXml() throws Exception {

        ObjectMapper jsonMapper = new ObjectMapper();
        XmlMapper xmlMapper = new XmlMapper();

        JsonNode jsonNode = jsonMapper.readTree(new File("person.json"));

        xmlMapper.writerWithDefaultPrettyPrinter()
                .writeValue(new File("person.xml"), jsonNode);

        System.out.println("JSON converted to XML successfully!");
    }
}
