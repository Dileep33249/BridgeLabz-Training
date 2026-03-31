package smartcitytransportservicemanagementsystem;

public class TaxiService implements TransportService {

    private double pricePerKm;
    private String currentLocation;
    private String destination;
    private boolean isAvailable = true;
    private int departureTime;

    TaxiService(double price, String currentLocation, String destination, int time) {
        this.pricePerKm = price;
        this.currentLocation = currentLocation;
        this.destination = destination;
        this.departureTime = time;
    }

    public double farePerKm() {
        return pricePerKm;
    }

    public String getSource() {
        return currentLocation;
    }

    public void setAvailability() {
        isAvailable = !isAvailable;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public int getDepartureTime() {
        return departureTime;
    }

}
