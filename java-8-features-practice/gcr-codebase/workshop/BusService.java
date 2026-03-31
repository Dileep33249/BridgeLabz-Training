package smartcitytransportservicemanagementsystem;

import java.util.Scanner;

public class BusService implements TransportService {

    double pricePerKm;
    String currentLocation;
    String destination;
    boolean isAvailable = true;
    int departureTime;

    public void SetDepatureTime(int minutes) {
        departureTime = minutes;
    }

    public double farePerKm() {
        return pricePerKm;
    }

    public String getSource() {
        return currentLocation;
    }

    BusService(double pricePerKm, String currentLocation, String destination, int time) {
        this.pricePerKm = pricePerKm;
        this.currentLocation = currentLocation;
        this.destination = destination;
        this.departureTime = time;
    }
}
