package smartcitytransportservicemanagementsystem;

public class AmbulanceService implements TransportService, EmergencyService {
    private double pricePerKm;
    private String currentLocation;
    private String destination;
    private int departureTime;

    public AmbulanceService(double pricePerKm, String currentLocation, String destination, int time) {
        this.pricePerKm = pricePerKm;
        this.currentLocation = currentLocation;
        this.destination = destination;
        this.departureTime = time;
    }

    @Override
    public double farePerKm() {
        return pricePerKm;
    }

    @Override
    public String getSource() {
        return currentLocation;
    }

    public void setDepartureTime(int minutes) {
        departureTime = minutes;
    }

    public int getDepartureTime() {
        return departureTime;
    }

    // Emergency services can bypass traffic
    public void bypassTraffic() {
        System.out.println("Ambulance bypassing traffic rules for emergency.");
    }
}