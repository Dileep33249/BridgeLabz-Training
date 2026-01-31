package com.streamapi;
import java.util.*;

public class SensorMonitoring {
    public static void main(String[] args) {

        List<Double> sensorReadings = Arrays.asList(
                28.5, 35.2, 41.8, 30.0, 45.6
        );

        double threshold = 35.0;

        System.out.println("Readings above threshold:");

        sensorReadings.stream()
                      .filter(reading -> reading > threshold)
                      .forEach(reading -> System.out.println(reading));
    }
}
