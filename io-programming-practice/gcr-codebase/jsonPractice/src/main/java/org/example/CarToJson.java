package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

public class CarToJson {
    public static void convertCarToJson() throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        Car car = new Car("Tata", "Nexon", 1200000);

        String json = mapper.writerWithDefaultPrettyPrinter()
                .writeValueAsString(car);

        System.out.println("Car JSON:");
        System.out.println(json);
    }
}
