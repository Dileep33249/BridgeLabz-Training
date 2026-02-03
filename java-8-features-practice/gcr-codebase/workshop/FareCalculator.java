package smartcitytransportservicemanagementsystem;

public interface FareCalculator {
	abstract double calculateFare(double pricePerKm, double distance);
}
