package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StudentJson {
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        Map<String, Object> student = new HashMap<>();
        student.put("name", "Rahul");
        student.put("age", 21);
        student.put("subjects", Arrays.asList("Maths", "Physics", "Computer Science"));

        String json = mapper.writerWithDefaultPrettyPrinter()
                .writeValueAsString(student);

        System.out.println(json);
    }
}
